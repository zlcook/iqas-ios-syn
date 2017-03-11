package com.zlcook.iqas.ios.dao.impl;

import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.UserTestCount;
import com.zlcook.iqas.ios.dao.AbstractBaseDao;
import com.zlcook.iqas.ios.dao.UserTestCountDao;
import com.zlcook.iqas.ios.mapper.UserTestCountMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 下午2:48:35
* 
*/
@Repository
public class UserTestCountDaoImpl extends AbstractBaseDao<UserTestCountMapper, UserTestCount>
		implements UserTestCountDao {

	public UserTestCountDaoImpl(UserTestCountMapper entityMapper) {
		super(entityMapper);
	}

}
