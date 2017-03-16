package com.zlcook.iqas.ios.dao.impl;


import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.UserBehaviour;
import com.zlcook.iqas.ios.dao.AbstractBaseDao;
import com.zlcook.iqas.ios.dao.UserBehaviourDao;
import com.zlcook.iqas.ios.mapper.UserBehaviourMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月16日 上午9:16:48
* 
*/
@Repository
public class UserBehaviourDaoImpl extends AbstractBaseDao<UserBehaviourMapper, UserBehaviour>
		implements UserBehaviourDao {

	public UserBehaviourDaoImpl(UserBehaviourMapper entityMapper) {
		super(entityMapper);
		// TODO Auto-generated constructor stub
	}

}
