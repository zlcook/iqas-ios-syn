package com.zlcook.iqas.ios.dto;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.zlcook.iqas.ios.bean.User;
import com.zlcook.iqas.ios.bean.UserCard;
import com.zlcook.iqas.ios.bean.UserLearningStyle;
import com.zlcook.iqas.ios.bean.UserResource;
import com.zlcook.iqas.ios.bean.UserTest;
import com.zlcook.iqas.ios.bean.UserTestCount;
import com.zlcook.iqas.ios.bean.UserWord;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 上午9:41:59
* 多个同步表的数据
* 
*/
public class SynTableData {
	private List<User> user;
	private List<UserCard> userCard;
	private List<UserLearningStyle> userLearningStyle;
	private List<UserTestCount> userTestCount;
	private List<UserResource> userResource;
	private List<UserTest> userTest;
	private List<UserWord> userWord;
	
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public List<UserCard> getUserCard() {
		return userCard;
	}
	public void setUserCard(List<UserCard> userCard) {
		this.userCard = userCard;
	}
	@JSONField(name="Userlearningstyle")
	public List<UserLearningStyle> getUserLearningStyle() {
		return userLearningStyle;
	}
	@JSONField(name="Userlearningstyle")
	public void setUserLearningStyle(List<UserLearningStyle> userLearningStyle) {
		this.userLearningStyle = userLearningStyle;
	}
	public List<UserResource> getUserResource() {
		return userResource;
	}
	public void setUserResource(List<UserResource> userResource) {
		this.userResource = userResource;
	}
	
	public List<UserTest> getUserTest() {
		return userTest;
	}
	public void setUserTest(List<UserTest> userTest) {
		this.userTest = userTest;
	}
	public List<UserWord> getUserWord() {
		return userWord;
	}
	public void setUserWord(List<UserWord> userWord) {
		this.userWord = userWord;
	}
	public List<UserTestCount> getUserTestCount() {
		return userTestCount;
	}
	public void setUserTestCount(List<UserTestCount> userTestCount) {
		this.userTestCount = userTestCount;
	}
	
}
