package com.zlcook.iqas.ios.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午2:38:03
* 用户登录表
*/
@Entity
public class UserLogin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private Integer userLoginId;
	 private Integer userId	;
	 private Date loginTime;
	 private Date logoutTime	;
	 private Integer loginState;
	public Integer getUserLoginId() {
		return userLoginId;
	}
	public void setUserLoginId(Integer userLoginId) {
		this.userLoginId = userLoginId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public Date getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}
	public Integer getLoginState() {
		return loginState;
	}
	public void setLoginState(Integer loginState) {
		this.loginState = loginState;
	}
	@Override
	public String toString() {
		return "UserLogin [userLoginId=" + userLoginId + ", userId=" + userId + ", loginTime=" + loginTime
				+ ", logoutTime=" + logoutTime + ", loginState=" + loginState + "]";
	}
	 
}
