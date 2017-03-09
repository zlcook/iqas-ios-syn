package com.zlcook.iqas.ios.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.enums.ResponseStateEnum;
import com.zlcook.iqas.ios.form.SynMetaForm;
import com.zlcook.iqas.ios.service.DataSynService;
import com.zlcook.iqas.ios.service.TokenService;
import com.zlcook.iqas.ios.vo.BaseStatusVO;
import com.zlcook.iqas.ios.vo.SynTableMetaVO;


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
	@RequestMapping(value ="/listmetas",method=RequestMethod.POST)
	public BaseStatusVO<List<SynTableMetaVO>> getSynMeta( String token,String jsonStr){
		
		/**
		    "token":"wangerxiao:1231254",
			"userId":10,
			tablemeta:[
			 {
			      "synTable": "user",
			      "userId": 1,
			      “version":0,
			      "lastModifyTime":null
			    }
			]
		 */
		JSONObject json =JSONObject.parseObject(jsonStr);
		 token =(String) json.get("token");
		//1.解析移动端元数据
		 System.out.println("token:"+token+" : test:"+jsonStr);
		 
		 
		//2.获取服务端的元数据
		
		
		//3.进行比对并返回同步元数据
		
		
		BaseStatusVO<List<SynTableMetaVO>> synMeta = new BaseStatusVO<>(ResponseStateEnum.SUCCESS); 
		
		Integer userId = 1;
		//获取用户数据表同步记录
		List<DataSynRecord> userSynRecordList =dataSynService.listTableSynRecord(userId);
		
		List<SynTableMetaVO> synTableMetaList = new ArrayList<>(userSynRecordList.size());
		for(DataSynRecord ds : userSynRecordList){
			SynTableMetaVO stv = new SynTableMetaVO();
			BeanUtils.copyProperties(ds, stv);
			synTableMetaList.add(stv);
		}
		synMeta.setData(synTableMetaList);
		
		return synMeta;
	}
	
	
	
	
	public DataSynService getDataSynService() {
		return dataSynService;
	}
	public void setDataSynService(DataSynService dataSynService) {
		this.dataSynService = dataSynService;
	}
	
}
