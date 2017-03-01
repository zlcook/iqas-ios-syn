package com.zlcook.iqas.ios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午2:24:54
* 用户卡片点击情况表
*/
@Entity
public class UserCard {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer usercardId;
	private Integer userId;
	private Integer cardclick1;	
	private Integer cardclick2;
	private Integer cardclick3;
	private Integer cardclick4;
	public Integer getUsercardId() {
		return usercardId;
	}
	public void setUsercardId(Integer usercardId) {
		this.usercardId = usercardId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getCardclick1() {
		return cardclick1;
	}
	public void setCardclick1(Integer cardclick1) {
		this.cardclick1 = cardclick1;
	}
	public Integer getCardclick2() {
		return cardclick2;
	}
	public void setCardclick2(Integer cardclick2) {
		this.cardclick2 = cardclick2;
	}
	public Integer getCardclick3() {
		return cardclick3;
	}
	public void setCardclick3(Integer cardclick3) {
		this.cardclick3 = cardclick3;
	}
	public Integer getCardclick4() {
		return cardclick4;
	}
	public void setCardclick4(Integer cardclick4) {
		this.cardclick4 = cardclick4;
	}
	@Override
	public String toString() {
		return "UserCard [usercardId=" + usercardId + ", userId=" + userId + ", cardclick1=" + cardclick1
				+ ", cardclick2=" + cardclick2 + ", cardclick3=" + cardclick3 + ", cardclick4=" + cardclick4 + "]";
	}
	
}
