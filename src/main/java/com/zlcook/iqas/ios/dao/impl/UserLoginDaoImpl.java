package com.zlcook.iqas.ios.dao.impl;

import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.UserLogin;
import com.zlcook.iqas.ios.dao.AbstractBaseDao;
import com.zlcook.iqas.ios.dao.UserLoginDao;
import com.zlcook.iqas.ios.mapper.UserLoginMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月16日 上午9:19:02
* 
*/
@Repository
public class UserLoginDaoImpl extends AbstractBaseDao<UserLoginMapper, UserLogin>implements UserLoginDao {

	public UserLoginDaoImpl(UserLoginMapper entityMapper) {
		super(entityMapper);
		// TODO Auto-generated constructor stub
	}

}
