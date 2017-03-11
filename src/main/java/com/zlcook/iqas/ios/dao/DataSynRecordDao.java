package com.zlcook.iqas.ios.dao;

import java.util.List;

import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.bean.DataSynRecordExample;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 上午11:02:44
* 用户同步记录数据操作类，该接口定义了操作DatSynRecord实体了对应数据表的相关操作。
*/
public interface DataSynRecordDao extends BaseDao<DataSynRecord>{
	
	/**
	 * 查询元数据表集合
	 * @param example 查询条件
	 * @return 集合
	 */
	List<DataSynRecord> list(DataSynRecordExample example);
	
	/**
	 * 更新同步表元数据表的版本，版本加1，同时最后修改时间为当前时间
	 * @param userId  the id of User
	 * @param tableName  the name of the modified meta table 
	 */
	void updateSynTableMetaVersion(Integer userId,String tableName);
}
