package com.zlcook.iqas.ios.form;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import com.sun.istack.internal.NotNull;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午8:48:05
* 用户注册表单
*/
public class RegisterForm {
	
	@NotBlank(message="登录名不能为空")
	@Length(max=20,min=3,message="登录名长度在3-20之间")
	private String loginName;	
	@NotBlank(message="密码不能为空")
	@Length(max=20,min=3,message="密码长度在3-20之间")
	private String password	;
	@NotBlank(message="真实姓名不能为空")
	@Length(max=20,min=2,message="真实姓名长度在2-20之间")
	private String realName;
	@Range(max=1,min=0)
	private Integer sex	;
	@NotBlank(message="学校不能为空")
	private String school;
	@NotBlank(message="班级不能为空")
	private String grade;
	@Range(max=6,min=1,message="年级值为1-6")
	private Integer classNum;
	@Range(max=200,min=1,message="英语分数为1-200")
	@NotNull
	private Integer englishscore;
	
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
	public Integer getEnglishscore() {
		return englishscore;
	}
	public void setEnglishscore(Integer englishscore) {
		this.englishscore = englishscore;
	}
	
}
