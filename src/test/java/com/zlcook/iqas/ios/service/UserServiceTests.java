package com.zlcook.iqas.ios.service;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zlcook.iqas.ios.form.RegisterForm;
import com.zlcook.iqas.ios.model.User;


/**
* @author 周亮 
* @version 创建时间：2017年2月26日 下午10:14:31
* 
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {
	private Logger logger = LogManager.getLogger(UserServiceTests.class);
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		
	}
	
	@Test
	public void TestService(){
		User user = new User();
		user.setUserId(1);
		user.setLoginName("liang");
		user.setRealName("周亮");
		user.setPassword("123");
		RegisterForm form =new RegisterForm();
		BeanUtils.copyProperties(user, form);
		int regResult =userService.register(form);
		if( regResult ==1)
		{
			logger.info("注册成功："+user.getLoginName());
			return ;
		}

		logger.info("用户已存在："+user.getLoginName());
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
