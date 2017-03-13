package com.zlcook.iqas.ios.form;

import javax.validation.constraints.NotNull;

/**
* @author 周亮 
* @version 创建时间：2017年3月13日 上午11:32:25
* 忽略同步提醒提交数据表
*/
public class IgnoreSynRemindForm {

	/**
	 * token值
	 */
	@NotNull
	private String token;
	@NotNull
	private String synDevice;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getSynDevice() {
		return synDevice;
	}
	public void setSynDevice(String synDevice) {
		this.synDevice = synDevice;
	}
	
}
