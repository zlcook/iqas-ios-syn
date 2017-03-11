package com.zlcook.iqas.ios.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.zlcook.iqas.ios.bean.User;
import com.zlcook.iqas.ios.bean.UserExample;
import com.zlcook.iqas.ios.dao.AbstractBaseDao;
import com.zlcook.iqas.ios.dao.UserDao;
import com.zlcook.iqas.ios.mapper.UserMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月2日 下午7:26:15
* UserDao的实现类
*/
@Repository("userDao")
public class UserDaoImpl extends AbstractBaseDao<UserMapper, User> implements UserDao{
	
	
	public UserDaoImpl(UserMapper entityMapper) {
		super(entityMapper);
	}
    
	@Override
	public User getByLoginName(String loginName) {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andLoginNameEqualTo(loginName);
		List<User> listUser =entityMapper.selectByExample(userExample);
		
		if( listUser !=null && listUser.size()> 0)
			return listUser.get(0);
		return null;
	}


}
