package com.zlcook.iqas.ios.service;

import java.util.List;

import com.zlcook.iqas.ios.bean.DataSynRecord;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午1:16:25
* 
*/
public interface DataSynService {

	/**
	 * 获取用户所有数据表的同步情况
	 * @param userId 用户id
	 * @return
	 * 同步记录集合
	 */
	List<DataSynRecord> listTableSynRecord(Integer userId);
	
	
}
