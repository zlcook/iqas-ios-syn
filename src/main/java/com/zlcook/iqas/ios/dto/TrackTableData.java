package com.zlcook.iqas.ios.dto;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.zlcook.iqas.ios.bean.UserBehaviour;
import com.zlcook.iqas.ios.bean.UserLogin;
import com.zlcook.iqas.ios.bean.UserTestCount;

/**
* @author 周亮 
* @version 创建时间：2017年3月15日 下午8:36:44
* 轨迹数据类，包含了userBehaviour、userLogin、userTestCount3个表的数据
*/
public class TrackTableData {

	@JSONField(name="userbehaviour")
	private List<UserBehaviour> userBehaviour;
	@JSONField(name="userlogin")
	private List<UserLogin> userLogin;
	
	public List<UserBehaviour> getUserBehaviour() {
		return userBehaviour;
	}
	public void setUserBehaviour(List<UserBehaviour> userBehaviour) {
		this.userBehaviour = userBehaviour;
	}
	public List<UserLogin> getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(List<UserLogin> userLogin) {
		this.userLogin = userLogin;
	}
	
}
