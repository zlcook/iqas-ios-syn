package com.zlcook.iqas.ios.dto;

import java.util.HashMap;
import java.util.Map;

/**
* @author 周亮 
* @version 创建时间：2017年3月1日 上午11:08:20
* Service层返回的DTO类的基类
*/
public class BaseServiceDTO {
	Map<String,String> msgMap = new HashMap<String,String>();

	public Map<String, String> getMsgMap() {
		return msgMap;
	}

	public void setMsgMap(Map<String, String> msgMap) {
		this.msgMap = msgMap;
	}
	
}
