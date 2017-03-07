package com.zlcook.iqas.ios.service;

import com.zlcook.iqas.ios.bean.User;
import com.zlcook.iqas.ios.dto.LoginDTO;
import com.zlcook.iqas.ios.form.RegisterForm;

/**
* @author 周亮 
* @version 创建时间：2017年2月26日 下午10:08:45
* 
*/
public interface UserService {

	
	/**
	 * User注册方法，根据form进行注册，并返回状态码。
	 * 
	 * @param form 注册用户填写的表单信息。
	 * 所以需要在调用register方法之前对form中进行校验，register方法中不会对form中的信息进行校验。
	 * @return 注册状态码
	 * 1：注册成功
	 * -1：注册用户已存在
	 */
	public int register(RegisterForm form);
	
	/**
	 * User登录，并返回登录信息，该方法中会对参数进行校验。
	 * @param loginName  登录名
	 * @param password 登录密码
	 * @return
	 * 登录信息
	 */
	public LoginDTO login(String loginName,String password);
	/**
	 * 通过用户名查找用户
	 * @param loginName ,如果该参数不为null，会去掉两端的空格再使用
	 * @return
	 * 返回查找到的用户，找不到返回null
	 */
	public User getByLoginName(String loginName);
	
}
