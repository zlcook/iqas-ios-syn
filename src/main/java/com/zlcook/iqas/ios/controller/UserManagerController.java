package com.zlcook.iqas.ios.controller;


import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zlcook.iqas.ios.enums.ResponseStateEnum;
import com.zlcook.iqas.ios.form.RegisterForm;
import com.zlcook.iqas.ios.model.User;
import com.zlcook.iqas.ios.service.UserService;
import com.zlcook.iqas.ios.vo.BaseStatus;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午4:31:48
* 用户管理控制类，负责处理和用户信息相关的请求，比如登录、注册、找回密码、修改密码等。
*/
@RequestMapping("/datasyn/user")
@RestController
public class UserManagerController {
	//日志类
	private final Logger logger = org.apache.log4j.LogManager.getLogger(UserManagerController.class);
		
	
	/**
	 * User服务类
	 */
	@Autowired
	private UserService userService;
	/**
	 * User注册方法
	 * @param form User注册填写的信息
	 * @param bindingResult 校验form产生的错误信息
	 * @return  json格式字符串
	 */
	@RequestMapping(value="/register",produces="application/json; charset=UTF-8", method=RequestMethod.POST)
	public  BaseStatus register( @Valid RegisterForm form,BindingResult bindingResult){
		
		BaseStatus status=new BaseStatus(ResponseStateEnum.SUCCESS);
		if( bindingResult.hasErrors()){
			status.setStatuEnum(ResponseStateEnum.PARAM_ERROR);
			return status;
		}
		int regResult =userService.register(form);
		
		if(regResult ==1)
			return status;
		
		status.setStatuEnum(ResponseStateEnum.USER_EXIST);
		return status;
	}

	
	public BaseStatus login(@PathVariable(required=true)String loginName,@PathVariable(required=true)String password){
		
		
		return null;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
