package com.zlcook.iqas.ios.dao.impl;

import org.springframework.stereotype.Repository;
import com.zlcook.iqas.ios.bean.UserResource;
import com.zlcook.iqas.ios.dao.AbstractBaseDao;
import com.zlcook.iqas.ios.dao.UserResourceDao;
import com.zlcook.iqas.ios.mapper.UserResourceMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 下午2:47:10
* 
*/
@Repository
public class UserResourceDaoImpl extends AbstractBaseDao<UserResourceMapper, UserResource>implements UserResourceDao {

	public UserResourceDaoImpl(UserResourceMapper entityMapper) {
		super(entityMapper);
		// TODO Auto-generated constructor stub
	}

}
