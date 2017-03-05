package com.zlcook.iqas.ios.controller;


import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.zlcook.iqas.ios.dto.LoginDTO;
import com.zlcook.iqas.ios.enums.ResponseStateEnum;
import com.zlcook.iqas.ios.form.RegisterForm;
import com.zlcook.iqas.ios.service.UserService;
import com.zlcook.iqas.ios.vo.BaseStatusVO;
import com.zlcook.iqas.ios.vo.LoginVO;

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
	public  BaseStatusVO register( @Valid RegisterForm form,BindingResult bindingResult){
		
		BaseStatusVO status=new BaseStatusVO(ResponseStateEnum.SUCCESS);
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
	/**
	 * User登录，并返回json数据
	 * @param loginName 登录名
	 * @param password 密码
	 * @return
	 * 将BaseStatusVO<LoginVO>对象的所有属性以json格式返回
	 * 
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public BaseStatusVO<LoginVO> login(@RequestParam(required=true)String loginName,@RequestParam(required=true)String password){
		
		BaseStatusVO<LoginVO> status=new BaseStatusVO<LoginVO>(ResponseStateEnum.SUCCESS);
		
		LoginDTO loginDTO =userService.login(loginName, password);
		if( loginDTO.getStatus() != 1){
			status.setStatuEnum(ResponseStateEnum.USER_LOGING_PARROR_ERROR);
			return status;
		}
		
		LoginVO loginVO = new LoginVO();
		BeanUtils.copyProperties(loginDTO, loginVO);
		status.setData(loginVO);
		return status;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
