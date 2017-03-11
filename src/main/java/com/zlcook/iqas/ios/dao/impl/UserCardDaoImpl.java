package com.zlcook.iqas.ios.dao.impl;

import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.UserCard;
import com.zlcook.iqas.ios.dao.AbstractBaseDao;
import com.zlcook.iqas.ios.dao.UserCardDao;
import com.zlcook.iqas.ios.mapper.UserCardMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 下午2:28:07
* 
*/
@Repository
public class UserCardDaoImpl extends AbstractBaseDao<UserCardMapper, UserCard> implements UserCardDao {

	public UserCardDaoImpl(UserCardMapper entityMapper) {
		super(entityMapper);
	}

}
