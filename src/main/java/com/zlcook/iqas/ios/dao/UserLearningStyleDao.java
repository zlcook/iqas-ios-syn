package com.zlcook.iqas.ios.dao;

import com.zlcook.iqas.ios.bean.UserLearningStyle;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 下午2:27:11
* 
*/
public interface UserLearningStyleDao extends BaseDao<UserLearningStyle> {

	/**
	 * 如果数据库中不存在则保存，存在则根据userId进行更新。
	 * @param userLearningStyle
	 */
	void saveOrUpdate(UserLearningStyle userLearningStyle);
}
