package com.zlcook.iqas.ios.form;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author 周亮 
* @version 创建时间：2017年3月12日 上午11:19:14
* 登录表单
*/
public class LoginForm {
	@NotEmpty
	private String loginName;
	@NotEmpty
	private String password;
	/**
	 * 登录设备标识
	 */
	@NotEmpty
	private String synDevice;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSynDevice() {
		return synDevice;
	}
	public void setSynDevice(String synDevice) {
		this.synDevice = synDevice;
	}
	
}
