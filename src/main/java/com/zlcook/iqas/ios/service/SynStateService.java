package com.zlcook.iqas.ios.service;

import com.zlcook.iqas.ios.bean.SynState;
import com.zlcook.iqas.ios.enums.SynStateEnum;

/**
* @author 周亮 
* @version 创建时间：2017年3月11日 下午9:36:04
* 
*/
public interface SynStateService {

	/**
	 * 根据同步状态获取同步结果，该方法不会对参数进行校验
	 * @param synState 同步状态，不可以为null，该方法不会对参数进行校验
	 * @param synDevice  the identify of device 
	 * @return
	 * 移动端数据同步状态
	 */
	SynStateEnum getSynResult(SynState synState,String synDevice);
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
	/**
	 * 保存
	 * @param synState
	 */
	void save(SynState synState);
	/**
	 * 获取用户同步状态
	 * @param userId
	 * @return
	 */
	SynState getById(Integer userId);
}
