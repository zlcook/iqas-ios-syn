package com.zlcook.iqas.ios.model;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午2:20:07
* 用户行为表,记录用户行为信息 
* 该表内容移动端只负责上传，服务端不会下传。
* 关系： 用户表:用户行为表 ->1:n
*/
@Entity
public class UserBehaviour {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userBehaviourId;
	private Integer userId;
	private Date dowhen;
	private String dowhere;
	private String dowhat;
	
	public Integer getUserBehaviourId() {
		return userBehaviourId;
	}
	public void setUserBehaviourId(Integer userBehaviourId) {
		this.userBehaviourId = userBehaviourId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getDowhen() {
		return dowhen;
	}
	public void setDowhen(Date dowhen) {
		this.dowhen = dowhen;
	}
	public String getDowhere() {
		return dowhere;
	}
	public void setDowhere(String dowhere) {
		this.dowhere = dowhere;
	}
	public String getDowhat() {
		return dowhat;
	}
	public void setDowhat(String dowhat) {
		this.dowhat = dowhat;
	}
	@Override
	public String toString() {
		return "UserBehaviour [userBehaviourId=" + userBehaviourId + ", userId=" + userId + ", dowhen=" + dowhen
				+ ", dowhere=" + dowhere + ", dowhat=" + dowhat + "]";
	}
			

}
