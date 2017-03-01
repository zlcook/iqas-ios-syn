package com.zlcook.iqas.ios.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.zlcook.iqas.ios.dao.UserDao;
import com.zlcook.iqas.ios.form.RegisterForm;
import com.zlcook.iqas.ios.model.User;
import com.zlcook.iqas.ios.service.UserService;

/**
* @author 周亮 
* @version 创建时间：2017年2月26日 下午10:09:08
* 
*/
@Service
public class UserServiceImpl implements UserService {
	//日志类
	private final Logger logger = org.apache.log4j.LogManager.getLogger(UserServiceImpl.class);
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public User getByUserId(Integer userId) {
		if( userId==null)
			throw new RuntimeException("id不能为空");
		return userDao.getOne(userId);
	}
	
	@Override
	public boolean existUser(String loginName){
		
		User exist =getByLoginName(loginName);
		if( exist ==null)
			return true;
		return false;
	}
	@Override
	public User getByLoginName(String loginName) {

		if( loginName==null || "".equals(loginName.trim()) )
			throw new RuntimeException("loginName不能为空");
		User user = new User();
		user.setLoginName(loginName);
		Example<User> example = Example.of(user);
 		List<User> list =userDao.findAll(example);
 		if( list !=null && list.size()>=1)
 			return list.get(0);
 		return null;
	}
	
	
	public User save(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}
	
	
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public int register(RegisterForm form) {
		User user = new User();
		BeanUtils.copyProperties(form, user);
		
		User userexample = new User();
		userexample.setLoginName(user.getLoginName());
		Example<User> example = Example.of(userexample);
		if(userDao.exists(example)){
			return -1;
		}
		
		try{
			userDao.save(user);
			return 1;
		}catch(Exception e)
		{
			logger.error("注册用户失败:"+e.getMessage());
			return -1;
		}
	}
	
	
}
