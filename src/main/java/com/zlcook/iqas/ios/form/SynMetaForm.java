package com.zlcook.iqas.ios.form;
/**
* @author 周亮 
* @version 创建时间：2017年3月8日 上午10:31:03
* 请求同步元数据的表单，用户在请求同步时会填写该表单中的相关内容，服务端用该类来接收服务端的数据。
*/
public class SynMetaForm {
	private String token;
	private Integer userId;
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	

}
