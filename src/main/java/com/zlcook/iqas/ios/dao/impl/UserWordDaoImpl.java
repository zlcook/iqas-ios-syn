package com.zlcook.iqas.ios.dao.impl;

import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.UserWord;
import com.zlcook.iqas.ios.bean.UserWordExample;
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

	@Override
	public int deleteByUserId(Integer userId) {
		// TODO Auto-generated method stub
		UserWordExample example = new UserWordExample();
		example.createCriteria().andUserIdEqualTo(userId);
		return entityMapper.deleteByExample(example);
	}

}
