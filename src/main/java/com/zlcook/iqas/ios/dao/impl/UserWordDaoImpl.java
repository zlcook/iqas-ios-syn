package com.zlcook.iqas.ios.dao.impl;

import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.UserWord;
import com.zlcook.iqas.ios.dao.AbstractBaseDao;
import com.zlcook.iqas.ios.dao.UserWordDao;
import com.zlcook.iqas.ios.mapper.UserWordMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 下午3:05:10
* 
*/
@Repository
public class UserWordDaoImpl extends AbstractBaseDao<UserWordMapper, UserWord>implements UserWordDao {

	public UserWordDaoImpl(UserWordMapper entityMapper) {
		super(entityMapper);
	}

}
