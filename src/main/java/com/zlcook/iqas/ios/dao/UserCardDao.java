package com.zlcook.iqas.ios.dao;

import com.zlcook.iqas.ios.bean.UserCard;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 下午2:23:44
* 
*/
public interface UserCardDao  extends BaseDao<UserCard>{

	/**
	 * 如果数据库中不存在则保存，存在则根据userId进行更新。
	 * @param userCard
	 */
	void saveOrUpdate(UserCard userCard);
}
