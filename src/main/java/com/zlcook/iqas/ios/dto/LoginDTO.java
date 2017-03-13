package com.zlcook.iqas.ios.dto;


/**
* @author 周亮 
* @version 创建时间：2017年3月2日 下午3:49:40
* 用户登录的返回对象
*/
public class LoginDTO extends BaseServiceDTO{
	/**
	 * 用户登录状态标识，1：登录成功；-1：登录失败；0：token值设置失败
	 */
	private Integer status;
	private Integer userId;
	private String token;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
