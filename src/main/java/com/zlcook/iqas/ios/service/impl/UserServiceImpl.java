package com.zlcook.iqas.ios.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlcook.iqas.ios.bean.SynState;
import com.zlcook.iqas.ios.bean.User;
import com.zlcook.iqas.ios.dao.DataSynRecordDao;
import com.zlcook.iqas.ios.dao.SynStateDao;
import com.zlcook.iqas.ios.dao.UserDao;
import com.zlcook.iqas.ios.dto.LoginDTO;
import com.zlcook.iqas.ios.form.RegisterForm;
import com.zlcook.iqas.ios.service.DataSynService;
import com.zlcook.iqas.ios.service.TokenService;
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
	@Autowired
	private TokenService tokenService;
	@Autowired
	private DataSynService dataSynService;
	
	@Autowired
	private SynStateDao synStateDao;
	
	@Override
	public int register(RegisterForm form) {
		User user = new User();
		BeanUtils.copyProperties(form, user);
		
		User existUser =getByLoginName(form.getLoginName());
		if( existUser !=null )
			return -1;
		try{
			//初始化一些信息
			user.setAdaptive(1);
			user.setLearningstyle2(0);
			user.setLearningstyle2(0);
			user.setLearningstyle3(0);;
			user.setLearningtyle4(0);
			user.setScore(0);
			user.setLoginTimes(0);
			user.setTopiccount1(0);
			user.setTopiccount2(0);
			user.setWordcount(0);
			user.setWordcount1(0);
			user.setWorkcount(0);
			user.setWorkcount1(0);
			user.setWorkcount2(0);
			user.setWorkcount3(0);
			user.setResourcecount1(0);
			user.setResourcecount2(0);
			user.setResourcecount3(0);
			user.setResourcecount4(0);
			user.setPresentgrade(0);
			userDao.save(user);

			//初始化用户关于同步数据表的元数据表
			User savedUser =getByLoginName(user.getLoginName());
			dataSynService.init4User(savedUser.getUserId());
			
			return 1;
		}catch(Exception e)
		{
			logger.error("注册用户失败:"+e.getMessage());
			return -1;
		}
	}

	@Override
	public LoginDTO login(String loginName, String password) {
		
		LoginDTO loginDTO =new LoginDTO();
		if(loginName==null || "".equals(loginName.trim()) || password==null ||"".equals(password.trim())){
			loginDTO.setStatus(-1);
			return loginDTO;
		}
		
		User existUser =userDao.getByLoginName(loginName);
		if( existUser==null || !password.equals(existUser.getPassword()) ){
			loginDTO.setStatus(-1);
			return loginDTO;
		}
		Integer userId = existUser.getUserId();
		//生成新的token值
		String token =tokenService.generatorToken4User(userId);
		SynState synState = synStateDao.getById(userId);
		if( synState == null ){
			synState = new SynState();
			synState.setUserId(userId);
			synState.setToken(token);
			synStateDao.save(synState);
		}else{
			synState.setToken(token);
			synStateDao.update(synState);
		}
		
		loginDTO.setToken(token);
		loginDTO.setUserId(userId);
		loginDTO.setStatus(1);
		return loginDTO;
	}

	@Override
	public User getByLoginName(String loginName) {
		// TODO Auto-generated method stub
		if( loginName ==null || "".equals(loginName.trim()))
			return null;
		User existUser =userDao.getByLoginName(loginName.trim());
		return existUser;
	}
	

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public TokenService getTokenService() {
		return tokenService;
	}
	public void setTokenService(TokenService tokenService) {
		this.tokenService = tokenService;
	}

}
