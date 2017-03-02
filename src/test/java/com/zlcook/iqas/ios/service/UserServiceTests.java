package com.zlcook.iqas.ios.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zlcook.iqas.ios.model.User;

/**
* @author 周亮 
* @version 创建时间：2017年2月26日 下午10:14:31
* 
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {
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
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
