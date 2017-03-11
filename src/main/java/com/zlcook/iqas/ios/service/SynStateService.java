package com.zlcook.iqas.ios.service;
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
	 * 1：同步成功，没有遗留数据。说明用户上一次登录后的操作产生的数据都进行了同步。
	 * 0：有可能有数据遗留在上次操作的设备上。
	 * -1：上一次设备上有未同步的数据，上一次登录的设备和当前设备相同
	 * -2：在上一次设备上数据同步失败。
	 */
	int getSynResult(Integer userId,String synDevice);
}
