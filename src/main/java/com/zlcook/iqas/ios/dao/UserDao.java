package com.zlcook.iqas.ios.dao;


import com.zlcook.iqas.ios.bean.User;

/**
* @author 周亮 
* @version 创建时间：2017年2月26日 下午10:06:18
* User实体类操作接口，接口封装了操作User实体了的方法。
*/
public interface UserDao extends BaseDao<User>{
	/**
	 * 根据User名和密码查找用户，找不到返回null,方法不会对参数进行校验
	 * @param loginName 用户名
	 * @return
	 * 返回查找到的user,否则返回null
	 */
	 User getByLoginName(String loginName);
	
	
}
