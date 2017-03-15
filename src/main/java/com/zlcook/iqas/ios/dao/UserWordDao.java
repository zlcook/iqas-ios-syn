package com.zlcook.iqas.ios.dao;

import com.zlcook.iqas.ios.bean.UserWord;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 下午3:04:17
* 
*/
public interface UserWordDao extends BaseDao<UserWord> {

	/**
	 * 根据用户id删除数据
	 * @param userId
	 * @return
	 * 返回删除的条数
	 */
	int deleteByUserId(Integer userId);

}
