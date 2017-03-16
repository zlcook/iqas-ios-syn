package com.zlcook.iqas.ios.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.UserCard;
import com.zlcook.iqas.ios.bean.UserCardExample;
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


	@Override
	public void saveOrUpdate(UserCard userCard) {
		UserCardExample example = new UserCardExample();
		example.createCriteria().andUserIdEqualTo(userCard.getUserId());
		List<UserCard> list =entityMapper.selectByExample(example);
		UserCard existUserCard = null;
		if( list != null && list.size() >0 ){
			existUserCard = list.get(0);
		}
		if( existUserCard != null ){
			userCard.setUsercardId(existUserCard.getUsercardId());
			entityMapper.updateByPrimaryKey(userCard);
		}else{
			//让其id自增
			userCard.setUsercardId(null);
		    entityMapper.insert(userCard);
		}
	}

}
