package com.zlcook.iqas.ios.service;

import com.zlcook.iqas.ios.enums.SynStateEnum;

/**
* @author 周亮 
* @version 创建时间：2017年3月11日 下午9:36:04
* 
*/
public interface SynStateService {

	/**
	 * 判断用户在前一次登录的设备上的同步情况，结果有3个
	 * @param userId   the id of user 
	 * @param synDevice   the identify of device 
	 * @return
	 * 移动端数据同步状态
	 */
	SynStateEnum getSynResult(Integer userId,String synDevice);
	/**
	 * 设置开启本次同步
	 * @param userId 
	 */
	void startSynFlage(Integer userId);
	/**
	 * 结束本次同步
	 * @param userId
	 */
	void stopSynFlage(Integer userId);
	/**
	 * 忽略同步提醒
	 * @param userId 用户id
	 * @param synDevice 设备标识
	 */
	void ignoreSynRemind(Integer userId,String synDevice) ;
}
