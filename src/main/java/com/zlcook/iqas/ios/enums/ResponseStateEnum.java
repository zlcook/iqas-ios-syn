package com.zlcook.iqas.ios.enums;
/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午8:35:53
* 请求响应状态 
*/
public enum ResponseStateEnum {

	/**
	 * 成功
	 */
	SUCCESS("success"),
	FAILURE("failure"),	
	PARAM_ERROR("参数有误!"),
	
	USER_EXIST("用户已存在");
	
	
	private String value;
	private ResponseStateEnum(String value){
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	
}
