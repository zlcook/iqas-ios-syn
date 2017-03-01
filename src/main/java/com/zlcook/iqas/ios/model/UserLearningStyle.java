package com.zlcook.iqas.ios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午2:35:38
* 用户学习风格表：记录用户学习风格
* 
*/
@Entity
public class UserLearningStyle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userlearningstyleId;
	private Integer userId;
	private Integer style1;
	private Integer style2;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getStyle1() {
		return style1;
	}
	public void setStyle1(Integer style1) {
		this.style1 = style1;
	}
	public Integer getStyle2() {
		return style2;
	}
	public void setStyle2(Integer style2) {
		this.style2 = style2;
	}
	@Override
	public String toString() {
		return "UserLearningStyle [userId=" + userId + ", style1=" + style1 + ", style2=" + style2 + "]";
	}
	


}
