package com.zlcook.iqas.ios.bean;
/**
* @author 周亮 
* @version 创建时间：2017年3月8日 下午9:34:31
* 
*/
public class LoginRecord {

	private Integer id;
	
	private String loginName;
	
	private String lastToken;
	
	private Integer lastSynCount;
	
	private String newToken;
	
	private Integer newSynCount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLastToken() {
		return lastToken;
	}

	public void setLastToken(String lastToken) {
		this.lastToken = lastToken;
	}

	public Integer getLastSynCount() {
		return lastSynCount;
	}

	public void setLastSynCount(Integer lastSynCount) {
		this.lastSynCount = lastSynCount;
	}

	public String getNewToken() {
		return newToken;
	}

	public void setNewToken(String newToken) {
		this.newToken = newToken;
	}

	public Integer getNewSynCount() {
		return newSynCount;
	}

	public void setNewSynCount(Integer newSynCount) {
		this.newSynCount = newSynCount;
	}
	
}
