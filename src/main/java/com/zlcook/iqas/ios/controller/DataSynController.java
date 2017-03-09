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
import com.zlcook.iqas.ios.enums.ResponseStateEnum;
import com.zlcook.iqas.ios.exception.RequestParamersException;
import com.zlcook.iqas.ios.form.RequestParams;
import com.zlcook.iqas.ios.form.SynMetaJSON;
import com.zlcook.iqas.ios.service.DataSynService;
import com.zlcook.iqas.ios.service.TokenService;
import com.zlcook.iqas.ios.vo.BaseStatusVO;
import com.zlcook.iqas.ios.vo.SynMetaVO;


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
	/**
	 * 获取同步头
	 * @return
	 * {
        "meta": {
          "status": 1,
          "message": "success"
        },
        "data":[
        	{"synId":"1","lastModTime":"123243","lastSynTime":"12123","size":12132,"userId",1},
        	{},
        	{}
        ]
       }
	 */
	/**
	 * 处理用户发起同步请求，并返回要同步元数据
	 * @param requestParams 用户携带参数,包括token和json两个字段，
	 * 其中json字段接收json格式的数据，而且数据内容要符合SynMetaJSON类的属性，因为会根据json数据生成SynMetaJSON实体对象。
	 *  json字段接收数据和下面类似
		   {
			  "userId":11,
			  "tablemeta":[
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
	@RequestMapping(value ="/listmetas",method=RequestMethod.POST)
	public BaseStatusVO<SynMetaVO> getSynMeta( @Valid RequestParams<SynMetaJSON> requestParams,BindingResult bindingResult){
		
		BaseStatusVO<SynMetaVO> synMeta = new BaseStatusVO<>(ResponseStateEnum.SUCCESS); 
		
		if( bindingResult.hasErrors()){
			synMeta.setStatuEnum(ResponseStateEnum.PARAM_ERROR);
			return synMeta;
		}
		SynMetaJSON synTableMeta=(SynMetaJSON) requestParams.getObj(SynMetaJSON.class);
		
		//1.解析移动端元数据
		Integer userId =synTableMeta.getUserId();
		List<DataSynRecord> mobileTableMetas = synTableMeta.getTablemeta();
		
		//2.获取服务端的元数据
		
		List<DataSynRecord> serverTableMetas =dataSynService.listTableSynRecord(userId);
		
		//3.进行比对并返回同步元数据
		SynMetaDTO synMetaDto= dataSynService.getSynMeta(serverTableMetas,mobileTableMetas);
		
		//4.返回给移动端json数据
		SynMetaVO synMetaVO = new SynMetaVO(userId, synMetaDto.getUpsyntable(), synMetaDto.getDownsyntable());
	    //5.设置返回数据
		synMeta.setData(synMetaVO);
		
		return synMeta;
	}
	
	
	
	
	public DataSynService getDataSynService() {
		return dataSynService;
	}
	public void setDataSynService(DataSynService dataSynService) {
		this.dataSynService = dataSynService;
	}
	
}
