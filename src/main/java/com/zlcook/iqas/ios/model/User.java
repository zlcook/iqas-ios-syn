package com.zlcook.iqas.ios.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author 周亮 
* @version 创建时间：2017年2月26日 下午3:21:08
* 类说明
*/
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	@Column(nullable=false,unique=true)
	private String loginName;	
	@Column(nullable=false)
	private String password	;
	private String realName;
	private Integer sex	;
	private String school;
	private String grade;
	private Integer classNum;
	private Integer level	;
	private Integer Englishscore;
	private Integer learningstyle1;
	private Integer learningstyle2;
	private Integer learningstyle3;
	private Integer learningtyle4;
	private Integer score;
	private Integer loginTimes;
	private Integer topiccount1;
	private Integer topiccount2	;
	private Integer wordcount;
	private Integer resourcecount1;
	private Integer resourcecount2;
	private Integer resourcecount3;
	private Integer resourcecount4;
	private Integer workcount;
	private Integer workcount1;
	private Integer workcount2;
	private Integer workcount3;
	private Integer wordcount1;
	private Integer presentgrade;
	private Integer adaptive;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
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
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Integer getClassNum() {
		return classNum;
	}
	public void setClassNum(Integer classNum) {
		this.classNum = classNum;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public Integer getEnglishscore() {
		return Englishscore;
	}
	public void setEnglishscore(Integer englishscore) {
		Englishscore = englishscore;
	}
	public Integer getLearningstyle1() {
		return learningstyle1;
	}
	public void setLearningstyle1(Integer learningstyle1) {
		this.learningstyle1 = learningstyle1;
	}
	public Integer getLearningstyle2() {
		return learningstyle2;
	}
	public void setLearningstyle2(Integer learningstyle2) {
		this.learningstyle2 = learningstyle2;
	}
	public Integer getLearningstyle3() {
		return learningstyle3;
	}
	public void setLearningstyle3(Integer learningstyle3) {
		this.learningstyle3 = learningstyle3;
	}
	public Integer getLearningtyle4() {
		return learningtyle4;
	}
	public void setLearningtyle4(Integer learningtyle4) {
		this.learningtyle4 = learningtyle4;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public Integer getLoginTimes() {
		return loginTimes;
	}
	public void setLoginTimes(Integer loginTimes) {
		this.loginTimes = loginTimes;
	}
	public Integer getTopiccount1() {
		return topiccount1;
	}
	public void setTopiccount1(Integer topiccount1) {
		this.topiccount1 = topiccount1;
	}
	public Integer getTopiccount2() {
		return topiccount2;
	}
	public void setTopiccount2(Integer topiccount2) {
		this.topiccount2 = topiccount2;
	}
	public Integer getWordcount() {
		return wordcount;
	}
	public void setWordcount(Integer wordcount) {
		this.wordcount = wordcount;
	}
	public Integer getResourcecount1() {
		return resourcecount1;
	}
	public void setResourcecount1(Integer resourcecount1) {
		this.resourcecount1 = resourcecount1;
	}
	public Integer getResourcecount2() {
		return resourcecount2;
	}
	public void setResourcecount2(Integer resourcecount2) {
		this.resourcecount2 = resourcecount2;
	}
	public Integer getResourcecount3() {
		return resourcecount3;
	}
	public void setResourcecount3(Integer resourcecount3) {
		this.resourcecount3 = resourcecount3;
	}
	public Integer getResourcecount4() {
		return resourcecount4;
	}
	public void setResourcecount4(Integer resourcecount4) {
		this.resourcecount4 = resourcecount4;
	}
	public Integer getWorkcount() {
		return workcount;
	}
	public void setWorkcount(Integer workcount) {
		this.workcount = workcount;
	}
	public Integer getWorkcount1() {
		return workcount1;
	}
	public void setWorkcount1(Integer workcount1) {
		this.workcount1 = workcount1;
	}
	public Integer getWorkcount2() {
		return workcount2;
	}
	public void setWorkcount2(Integer workcount2) {
		this.workcount2 = workcount2;
	}
	public Integer getWorkcount3() {
		return workcount3;
	}
	public void setWorkcount3(Integer workcount3) {
		this.workcount3 = workcount3;
	}
	public Integer getWordcount1() {
		return wordcount1;
	}
	public void setWordcount1(Integer wordcount1) {
		this.wordcount1 = wordcount1;
	}
	public Integer getPresentgrade() {
		return presentgrade;
	}
	public void setPresentgrade(Integer presentgrade) {
		this.presentgrade = presentgrade;
	}
	public Integer getAdaptive() {
		return adaptive;
	}
	public void setAdaptive(Integer adaptive) {
		this.adaptive = adaptive;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", loginName=" + loginName + ", password=" + password + ", realName="
				+ realName + ", sex=" + sex + ", school=" + school + ", grade=" + grade + ", classNum=" + classNum
				+ ", level=" + level + ", Englishscore=" + Englishscore + ", learningstyle1=" + learningstyle1
				+ ", learningstyle2=" + learningstyle2 + ", learningstyle3=" + learningstyle3 + ", learningtyle4="
				+ learningtyle4 + ", score=" + score + ", loginTimes=" + loginTimes + ", topiccount1=" + topiccount1
				+ ", topiccount2=" + topiccount2 + ", wordcount=" + wordcount + ", resourcecount1=" + resourcecount1
				+ ", resourcecount2=" + resourcecount2 + ", resourcecount3=" + resourcecount3 + ", resourcecount4="
				+ resourcecount4 + ", workcount=" + workcount + ", workcount1=" + workcount1 + ", workcount2="
				+ workcount2 + ", workcount3=" + workcount3 + ", wordcount1=" + wordcount1 + ", presentgrade="
				+ presentgrade + ", adaptive=" + adaptive + "]";
	}
	

}
