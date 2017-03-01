package com.zlcook.iqas.ios.vo;

import com.zlcook.iqas.ios.enums.ResponseStateEnum;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午8:45:29
* 
*/
public class BaseStatus {
	private int status;
	private String message;
	
	
	public BaseStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseStatus(ResponseStateEnum status) {
		super();
		this.status = status.ordinal();
		this.message = status.getValue();
		
	}
	public void setStatuEnum(ResponseStateEnum status){
		this.status = status.ordinal();
		this.message = status.getValue();
	}
	public int getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
	
}
