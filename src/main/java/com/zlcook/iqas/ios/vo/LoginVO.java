package com.zlcook.iqas.ios.vo;

import com.zlcook.iqas.ios.bean.User;
import com.zlcook.iqas.ios.enums.SynStateEnum;

/**
* @author 周亮 
* @version 创建时间：2017年3月2日 下午8:46:46
* 
*/
public class LoginVO  {
	
	private String token;
	/**
	 * 同步标识
	 */
	private Integer synFlage;
	/**
	 * 同步信息
	 */
	private String message;
	
	public void setSynState(SynStateEnum synStateEnum){
		synFlage = synStateEnum.getSynFlage();
		message = synStateEnum.getMessage();
	}
	
	public Integer getSynFlage() {
		return synFlage;
	}

	public void setSynFlage(Integer synFlage) {
		this.synFlage = synFlage;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
