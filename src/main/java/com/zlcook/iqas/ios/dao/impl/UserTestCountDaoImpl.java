package com.zlcook.iqas.ios.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.UserTestCount;
import com.zlcook.iqas.ios.bean.UserTestCountExample;
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

	@Override
	public void saveOrUpdate(UserTestCount userTestCount) {
		// TODO Auto-generated method stub
		UserTestCountExample example = new UserTestCountExample();
		example.createCriteria().andUserIdEqualTo(userTestCount.getUserId());
		List<UserTestCount> list =entityMapper.selectByExample(example);
		UserTestCount existuserTestCount = null;
		if( list != null && list.size() >0 ){
			existuserTestCount = list.get(0);
		}
		if( existuserTestCount != null ){	
			userTestCount.setUsertestcountId(existuserTestCount.getUsertestcountId());
			entityMapper.updateByPrimaryKey(userTestCount);
		}else{
			//让其id自增
			userTestCount.setUsertestcountId(null);
		    entityMapper.insert(userTestCount);
		}
	}

}
