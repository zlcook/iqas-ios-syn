package com.zlcook.iqas.ios.dao;

import com.zlcook.iqas.ios.bean.UserResource;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 下午2:24:52
* 
*/
public interface UserResourceDao extends BaseDao<UserResource> {

	/**
	 * 根据用户id删除数据
	 * @param userId
	 * @return
	 * 返回删除的条数
	 */
	int deleteByUserId(Integer userId);
}
