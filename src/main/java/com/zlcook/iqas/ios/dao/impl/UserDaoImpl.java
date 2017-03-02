package com.zlcook.iqas.ios.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.User;
import com.zlcook.iqas.ios.bean.UserExample;
import com.zlcook.iqas.ios.dao.UserDao;
import com.zlcook.iqas.ios.mapper.UserMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月2日 下午7:26:15
* UserDao的实现类
*/
@Repository("userDao")
public class UserDaoImpl implements UserDao{

	/**
	 * 引入userMapper数据访问类，该类是mybatis提供了操作数据库的user映射类
	 */
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> list() {
		return userMapper.selectByExample(null);
	}

	@Override
	public int save(User entity) {
		// TODO Auto-generated method stub
		return userMapper.insert(entity);
	}

	@Override
	public int update(User entity) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(entity);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return userMapper.countByExample(null);
	}

	@Override
	public User getByLoginName(String loginName) {
		// TODO Auto-generated method stub
		UserExample userExample = new UserExample();
		userExample.createCriteria().andLoginNameEqualTo(loginName);
		List<User> listUser =userMapper.selectByExample(userExample);
		if( listUser !=null && listUser.size()> 0)
			return listUser.get(0);
		return null;
	}

}
