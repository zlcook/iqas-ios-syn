package com.zlcook.iqas.ios.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.dto.SynMetaDTO;
import com.zlcook.iqas.ios.dto.SynTableData;
import com.zlcook.iqas.ios.enums.ResponseStateEnum;
import com.zlcook.iqas.ios.form.IgnoreSynRemindForm;
import com.zlcook.iqas.ios.form.RegisterForm;
import com.zlcook.iqas.ios.form.RequestParams;
import com.zlcook.iqas.ios.form.SynMetaJSON;
import com.zlcook.iqas.ios.form.SynTableDataJSON;
import com.zlcook.iqas.ios.service.DataSynService;
import com.zlcook.iqas.ios.service.SynStateService;
import com.zlcook.iqas.ios.service.TokenService;
import com.zlcook.iqas.ios.vo.BaseStatusVO;
import com.zlcook.iqas.ios.vo.SynMetaVO;
import com.zlcook.iqas.ios.vo.SynTableDataVO;


/**
* @author 周亮 
* @version 创建时间：2017年2月26日 下午10:12:39
* 
*/
@RestController
@RequestMapping("/datasyn/syn")
public class DataSynController {

	/**
	 * 用户数据表元数据服务类
	 */
	@Autowired
	private DataSynService dataSynService;
	/**
	 * token服务类
	 */
	@Autowired
	private TokenService tokenService;
	@Autowired
	private SynStateService synStateService;
	
	/**
	 * 处理用户发起同步请求，并返回同步元数据
	 * @param requestParams 用户携带参数,包括token和json两个字段，
	 * 其中json字段接收json格式的数据，而且数据内容要符合SynMetaJSON类的属性，因为会根据json数据生成SynMetaJSON实体对象。
	 *  json字段接收数据和下面类似，其中synTable的取值受限于：DataSynService中定义的实体名称
		   {
			  "userId":11,
			  "tableMeta":[
			    {
			  	  "synId":1,
			      "synTable":"user",
			      "userId": 11,
			      "version":0,
			      "lastModTime":0
			    }
			   ]
			}
	 * @return
	 * 返回此次同步元数据
	 * 
	 */
	@RequestMapping(value ="/synmetas",method=RequestMethod.POST)
	public BaseStatusVO<SynMetaVO> synMetas( @Valid RequestParams<SynMetaJSON> requestParams,BindingResult bindingResult){
		
		BaseStatusVO<SynMetaVO> synMeta = new BaseStatusVO<>(ResponseStateEnum.SUCCESS); 
		
		if( bindingResult.hasErrors()){
			synMeta.setStatuEnum(ResponseStateEnum.PARAM_ERROR);
			return synMeta;
		}
		//0.解析得到json数据
		SynMetaJSON synTableMeta=(SynMetaJSON) requestParams.getObjFromJSON(SynMetaJSON.class);
		
		//1.解析移动端元数据
		Integer userId =tokenService.getUserIdFromToken(requestParams.getToken());
		List<DataSynRecord> mobileTableMetas = synTableMeta.getTableMeta();
		
		//2.获取服务端的元数据
		
		List<DataSynRecord> serverTableMetas =dataSynService.listTableSynRecord(userId);
		
		//3.进行比对并返回同步元数据
		SynMetaDTO synMetaDto= dataSynService.getSynMeta(serverTableMetas,mobileTableMetas);

		//3.1设置同开始
		synStateService.startSynFlage(userId);
		
		//4.返回给移动端json数据
		SynMetaVO synMetaVO = new SynMetaVO(userId, synMetaDto.getUpSynTable(), synMetaDto.getDownSynTable());
	    //5.设置返回数据
		synMeta.setData(synMetaVO);
		
		return synMeta;
	}
	
	/**
	 * 接收移动端上传的同步数据，并返回服务端下传的同步数据
	 * @param requestParams
	 * token="11:1232423",
	   json={
	    "userId":11,
		"downSynTable":[ { "synTable":"userCard"},...],    //服务端需要下传的数据表     
		"tableData":{                                       //移动端传给服务端的数据               
			"user":[{"userId":11,"loginName":"liang","grade":4,"leavel":1,...},...],//用户表的同步数据
			"userCord":[{}],  
			"userLearningStyle":[{}],
			"userResource":[{}],
			"userTestCount":[{}],
			"userWord":[{}]
		  }
		}
	 * @param bindingResult
	 * @return
	 */
	@RequestMapping(value ="/syntabledata",method=RequestMethod.POST)
	public BaseStatusVO<SynTableDataVO> receiveUpSynDataAndBackDownSynData( @Valid RequestParams<SynTableDataJSON> requestParams,BindingResult bindingResult){
		
		BaseStatusVO<SynTableDataVO> status = new BaseStatusVO<>(ResponseStateEnum.SUCCESS); 
		if( bindingResult.hasErrors()){
			status.setStatuEnum(ResponseStateEnum.PARAM_ERROR);
			return status;
		}
		//0.解析得到json数据
		SynTableDataJSON synTableData=(SynTableDataJSON) requestParams.getObjFromJSON(SynTableDataJSON.class);
		
		Integer userId = tokenService.getUserIdFromToken(requestParams.getToken());
		//1.处理向上同步的表数据
		  //1.1用移动端的数据更新服务端数据
		boolean synResult =dataSynService.updateSynTable(synTableData.getTableData(),userId);
		if( !synResult ){
			status.setStatuEnum(ResponseStateEnum.SYN_FAILURE);
			return status;
		}
		//2.获取要向下同步的的表数据
	    SynTableData tableData= dataSynService.getTableData(synTableData.getDownSynTable(),userId);
		
	    //3.获取用户的的数据表元数据
	    List<DataSynRecord> tableMeta=dataSynService.listTableSynRecord(userId);
	    
		//3.1设置同结束
		synStateService.stopSynFlage(userId);
		
	    //4.返回给移动端
	    SynTableDataVO synTableDataVo = new SynTableDataVO(tableMeta, tableData);
	    status.setData(synTableDataVo);
	    
		return status;
	}
	
	
	@RequestMapping(value ="/ignore",method=RequestMethod.POST)
	public BaseStatusVO<String> ignoreSynRemind(@Valid IgnoreSynRemindForm form,BindingResult bindingResult){
		
		BaseStatusVO<String> status = new BaseStatusVO<>(ResponseStateEnum.SUCCESS); 
		
		if( bindingResult.hasErrors()){
			status.setStatuEnum(ResponseStateEnum.PARAM_ERROR);
			return status;
		}
		Integer userId = tokenService.getUserIdFromToken(form.getToken());
		synStateService.ignoreSynRemind(userId, form.getSynDevice());
		return status;
	}
	
}
