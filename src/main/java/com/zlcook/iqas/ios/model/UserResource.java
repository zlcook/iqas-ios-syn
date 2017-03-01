package com.zlcook.iqas.ios.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午2:39:50
* 用户资源表
*/
@Entity
public class UserResource {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userResourceId;
	private Integer userId;
	private Integer resourceId;
	private Integer	rType;
	private Date rloginTime;
	private Date rlogoutTime;
	private Integer learntimes;
	private Integer learncount;
	private String  word;
	private Integer learntimenow;
	public Integer getUserResourceId() {
		return userResourceId;
	}
	public void setUserResourceId(Integer userResourceId) {
		this.userResourceId = userResourceId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getResourceId() {
		return resourceId;
	}
	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}
	public Integer getrType() {
		return rType;
	}
	public void setrType(Integer rType) {
		this.rType = rType;
	}
	public Date getRloginTime() {
		return rloginTime;
	}
	public void setRloginTime(Date rloginTime) {
		this.rloginTime = rloginTime;
	}
	public Date getRlogoutTime() {
		return rlogoutTime;
	}
	public void setRlogoutTime(Date rlogoutTime) {
		this.rlogoutTime = rlogoutTime;
	}
	public Integer getLearntimes() {
		return learntimes;
	}
	public void setLearntimes(Integer learntimes) {
		this.learntimes = learntimes;
	}
	public Integer getLearncount() {
		return learncount;
	}
	public void setLearncount(Integer learncount) {
		this.learncount = learncount;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Integer getLearntimenow() {
		return learntimenow;
	}
	public void setLearntimenow(Integer learntimenow) {
		this.learntimenow = learntimenow;
	}
	@Override
	public String toString() {
		return "UserResource [userResourceId=" + userResourceId + ", userId=" + userId + ", resourceId=" + resourceId
				+ ", rType=" + rType + ", rloginTime=" + rloginTime + ", rlogoutTime=" + rlogoutTime + ", learntimes="
				+ learntimes + ", learncount=" + learncount + ", word=" + word + ", learntimenow=" + learntimenow + "]";
	}
	
}
