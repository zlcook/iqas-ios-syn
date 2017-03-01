package com.zlcook.iqas.ios.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午2:44:37
* 
*/
@Entity
public class UserTest {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer usertestId;
	private Integer userId;
	private String word;
	private Integer testtype;
	private Integer answertimes;//回答次数
	private Integer righttimes;//错误次数
	private Integer wrongtimes;
	private Date testinTime;
	private Date testoutTime;
	public Integer getUsertestId() {
		return usertestId;
	}
	public void setUsertestId(Integer usertestId) {
		this.usertestId = usertestId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Integer getTesttype() {
		return testtype;
	}
	public void setTesttype(Integer testtype) {
		this.testtype = testtype;
	}
	public Integer getAnswertimes() {
		return answertimes;
	}
	public void setAnswertimes(Integer answertimes) {
		this.answertimes = answertimes;
	}
	public Integer getRighttimes() {
		return righttimes;
	}
	public void setRighttimes(Integer righttimes) {
		this.righttimes = righttimes;
	}
	public Integer getWrongtimes() {
		return wrongtimes;
	}
	public void setWrongtimes(Integer wrongtimes) {
		this.wrongtimes = wrongtimes;
	}
	public Date getTestinTime() {
		return testinTime;
	}
	public void setTestinTime(Date testinTime) {
		this.testinTime = testinTime;
	}
	public Date getTestoutTime() {
		return testoutTime;
	}
	public void setTestoutTime(Date testoutTime) {
		this.testoutTime = testoutTime;
	}
	@Override
	public String toString() {
		return "UserTest [usertestId=" + usertestId + ", userId=" + userId + ", word=" + word + ", testtype=" + testtype
				+ ", answertimes=" + answertimes + ", righttimes=" + righttimes + ", wrongtimes=" + wrongtimes
				+ ", testinTime=" + testinTime + ", testoutTime=" + testoutTime + "]";
	}

	
}
