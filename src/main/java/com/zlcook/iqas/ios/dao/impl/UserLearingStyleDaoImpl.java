package com.zlcook.iqas.ios.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.UserLearningStyle;
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

}
