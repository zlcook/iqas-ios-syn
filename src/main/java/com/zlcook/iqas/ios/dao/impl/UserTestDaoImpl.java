package com.zlcook.iqas.ios.dao.impl;


import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.UserTest;
import com.zlcook.iqas.ios.dao.AbstractBaseDao;
import com.zlcook.iqas.ios.dao.UserTestDao;
import com.zlcook.iqas.ios.mapper.UserTestMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月14日 上午11:05:54
* 
*/
@Repository
public class UserTestDaoImpl extends AbstractBaseDao<UserTestMapper, UserTest>implements UserTestDao {

	public UserTestDaoImpl(UserTestMapper entityMapper) {
		super(entityMapper);
		// TODO Auto-generated constructor stub
	}

}
