package com.zlcook.iqas.ios.dto;


/**
* @author 周亮 
* @version 创建时间：2017年3月2日 下午3:49:40
* 用户登录的返回对象
*/
public class LoginDTO extends BaseServiceDTO{
	/**
	 * 用户登录状态标识，1：登录成功；-1：登录失败；0：token值设置失败
	 */
	private Integer status;
	private Integer userId;
	private String loginName;	
	private String realName;
	private Integer sex	;
	private String school;
	private String grade;
	private Integer classNum;
	
	private String token;

	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
