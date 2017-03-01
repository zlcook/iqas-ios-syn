package com.zlcook.iqas.ios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午2:51:03
* 用户学习单词表
*/
@Entity
public class UserWord {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userWordId;
	private Integer userId;
	private String  word;
	private Integer wordtest;
	private Integer wordlearn;
	private Integer topi;
	private Integer wrongtesttimes;
	public Integer getUserWordId() {
		return userWordId;
	}
	public void setUserWordId(Integer userWordId) {
		this.userWordId = userWordId;
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
	public Integer getWordtest() {
		return wordtest;
	}
	public void setWordtest(Integer wordtest) {
		this.wordtest = wordtest;
	}
	public Integer getWordlearn() {
		return wordlearn;
	}
	public void setWordlearn(Integer wordlearn) {
		this.wordlearn = wordlearn;
	}
	public Integer getTopi() {
		return topi;
	}
	public void setTopi(Integer topi) {
		this.topi = topi;
	}
	public Integer getWrongtesttimes() {
		return wrongtesttimes;
	}
	public void setWrongtesttimes(Integer wrongtesttimes) {
		this.wrongtesttimes = wrongtesttimes;
	}
	@Override
	public String toString() {
		return "UserWord [userWordId=" + userWordId + ", userId=" + userId + ", word=" + word + ", wordtest=" + wordtest
				+ ", wordlearn=" + wordlearn + ", topi=" + topi + ", wrongtesttimes=" + wrongtesttimes + "]";
	}

	
}
