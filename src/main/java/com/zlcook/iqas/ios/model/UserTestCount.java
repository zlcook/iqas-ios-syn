package com.zlcook.iqas.ios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午2:48:57
* 用户测试次数统计表：变
*/
@Entity
public class UserTestCount {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer usertestcountId;
	private Integer userId;
	private Integer testcount	;
	private Integer testrightcount	;
	private Integer test1count	;
	private Integer test1rightcount	;
	private Integer test2count	;
	private Integer test2rightcount	;
	private Integer test3count	;
	private Integer test3rightcount	;
	private Integer test4count	;
	private Integer test4rightcount;
	public Integer getUsertestcountId() {
		return usertestcountId;
	}
	public void setUsertestcountId(Integer usertestcountId) {
		this.usertestcountId = usertestcountId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getTestcount() {
		return testcount;
	}
	public void setTestcount(Integer testcount) {
		this.testcount = testcount;
	}
	public Integer getTestrightcount() {
		return testrightcount;
	}
	public void setTestrightcount(Integer testrightcount) {
		this.testrightcount = testrightcount;
	}
	public Integer getTest1count() {
		return test1count;
	}
	public void setTest1count(Integer test1count) {
		this.test1count = test1count;
	}
	public Integer getTest1rightcount() {
		return test1rightcount;
	}
	public void setTest1rightcount(Integer test1rightcount) {
		this.test1rightcount = test1rightcount;
	}
	public Integer getTest2count() {
		return test2count;
	}
	public void setTest2count(Integer test2count) {
		this.test2count = test2count;
	}
	public Integer getTest2rightcount() {
		return test2rightcount;
	}
	public void setTest2rightcount(Integer test2rightcount) {
		this.test2rightcount = test2rightcount;
	}
	public Integer getTest3count() {
		return test3count;
	}
	public void setTest3count(Integer test3count) {
		this.test3count = test3count;
	}
	public Integer getTest3rightcount() {
		return test3rightcount;
	}
	public void setTest3rightcount(Integer test3rightcount) {
		this.test3rightcount = test3rightcount;
	}
	public Integer getTest4count() {
		return test4count;
	}
	public void setTest4count(Integer test4count) {
		this.test4count = test4count;
	}
	public Integer getTest4rightcount() {
		return test4rightcount;
	}
	public void setTest4rightcount(Integer test4rightcount) {
		this.test4rightcount = test4rightcount;
	}
	@Override
	public String toString() {
		return "UserTestCount [usertestcountId=" + usertestcountId + ", userId=" + userId + ", testcount=" + testcount
				+ ", testrightcount=" + testrightcount + ", test1count=" + test1count + ", test1rightcount="
				+ test1rightcount + ", test2count=" + test2count + ", test2rightcount=" + test2rightcount
				+ ", test3count=" + test3count + ", test3rightcount=" + test3rightcount + ", test4count=" + test4count
				+ ", test4rightcount=" + test4rightcount + "]";
	}

	
}
