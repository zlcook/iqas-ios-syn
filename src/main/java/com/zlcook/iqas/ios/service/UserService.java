package com.zlcook.iqas.ios.service;

import com.zlcook.iqas.ios.form.RegisterForm;
import com.zlcook.iqas.ios.model.User;

/**
* @author 周亮 
* @version 创建时间：2017年2月26日 下午10:08:45
* 
*/
public interface UserService {

	public User getByUserId(Integer id);
	
	public User getByLoginName(String loginName);
	
	public boolean existUser(String loginName);
	
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
}
