package com.zlcook.iqas.ios.dao;

import com.zlcook.iqas.ios.bean.UserTest;

/**
* @author 周亮 
* @version 创建时间：2017年3月14日 上午11:05:07
* 
*/
public interface UserTestDao extends BaseDao<UserTest> {

	/**
	 * 根据用户id删除数据
	 * @param userId
	 * @return
	 * 返回删除的条数
	 */
	int deleteByUserId(Integer userId);

}
