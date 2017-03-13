package com.zlcook.iqas.ios.controller;


import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zlcook.iqas.ios.bean.SynState;
import com.zlcook.iqas.ios.bean.User;
import com.zlcook.iqas.ios.dto.LoginDTO;
import com.zlcook.iqas.ios.enums.ResponseStateEnum;
import com.zlcook.iqas.ios.enums.SynStateEnum;
import com.zlcook.iqas.ios.form.LoginForm;
import com.zlcook.iqas.ios.form.RegisterForm;
import com.zlcook.iqas.ios.service.SynStateService;
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
	@Autowired
	private SynStateService synStateService;
	/**
	 * User注册方法
	 * @param form User注册填写的信息
	 * @param bindingResult 校验form产生的错误信息
	 * @return  json格式字符串
	 */
	@RequestMapping(value="/register",produces="application/json; charset=UTF-8", method=RequestMethod.POST)
	public  BaseStatusVO<Map<String,Integer>> register( @Valid RegisterForm form,BindingResult bindingResult){
		
		BaseStatusVO<Map<String,Integer>> status=new BaseStatusVO<Map<String,Integer>>(ResponseStateEnum.SUCCESS);
		if( bindingResult.hasErrors()){
			status.setStatuEnum(ResponseStateEnum.PARAM_ERROR);
			return status;
		}
		int regResult =userService.register(form);
		
		if(regResult !=1)
		{
			status.setStatuEnum(ResponseStateEnum.USER_EXIST);
			return status;
		}
		User user= userService.getByLoginName(form.getLoginName());
		if(user!=null ){
			Map<String,Integer> userIdMap = new HashMap<>();
			userIdMap.put("userId", user.getUserId());
			status.setData(userIdMap);
		}
		else
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
	@RequestMapping(value="/login",produces="application/json; charset=UTF-8",method=RequestMethod.POST)
	public BaseStatusVO<LoginVO> login(@Valid LoginForm loginForm,BindingResult bindingResult){
		
		BaseStatusVO<LoginVO> status=new BaseStatusVO<LoginVO>(ResponseStateEnum.SUCCESS);
		if( bindingResult.hasErrors()){
			status.setStatuEnum(ResponseStateEnum.USER_LOGING_PARROR_ERROR);
			return status;
		}
		//1.登录
		LoginDTO loginDTO =userService.login(loginForm.getLoginName(), loginForm.getPassword());
		if( loginDTO.getStatus() != 1){
			status.setStatuEnum(ResponseStateEnum.USER_LOGING_PARROR_ERROR);
			return status;
		}
		//2.检查上一次登录后的同步情况
		SynState synState =synStateService.getById(loginDTO.getUserId());
		
		SynStateEnum synStateEnum =null;
		if( synState == null){
			synState.setSynCount(0);
			synState.setSynDevice(loginForm.getSynDevice());
			synState.setSynResult(true);
			synState.setUserId(loginDTO.getUserId());
			synState.setToken(loginDTO.getToken());
			synStateService.save(synState);
			
			synStateEnum= SynStateEnum.SYN_SUCCESS;
		}else{
			 synStateEnum = synStateService.getSynResult(synState, loginForm.getSynDevice());
		}
		LoginVO loginVO = new LoginVO();
		//3.返回同步结果
		loginVO.setSynState(synStateEnum);
		loginVO.setToken(loginDTO.getToken());
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
