package com.zlcook.iqas.ios.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.UserLearningStyle;
import com.zlcook.iqas.ios.bean.UserLearningStyleExample;
import com.zlcook.iqas.ios.dao.AbstractBaseDao;
import com.zlcook.iqas.ios.dao.UserLearningStyleDao;
import com.zlcook.iqas.ios.mapper.UserLearningStyleMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 下午2:45:45
* 
*/
@Repository
public class UserLearingStyleDaoImpl extends AbstractBaseDao<UserLearningStyleMapper, UserLearningStyle>
		implements UserLearningStyleDao {

	public UserLearingStyleDaoImpl(UserLearningStyleMapper entityMapper) {
		super(entityMapper);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveOrUpdate(UserLearningStyle userLearningStyle) {
		// TODO Auto-generated method stub
		UserLearningStyleExample example = new UserLearningStyleExample();
		example.createCriteria().andUserIdEqualTo(userLearningStyle.getUserId());
		List<UserLearningStyle> list =entityMapper.selectByExample(example);
		UserLearningStyle existuserLearningStyle = null;
		if( list != null && list.size() >0 ){
			existuserLearningStyle = list.get(0);
		}
		if( existuserLearningStyle != null ){	
			userLearningStyle.setUserlearningstyleId(existuserLearningStyle.getUserlearningstyleId());
			entityMapper.updateByPrimaryKey(userLearningStyle);
		}else{
			//让其id自增
			userLearningStyle.setUserlearningstyleId(null);
		    entityMapper.insert(userLearningStyle);
		}
	}

}
