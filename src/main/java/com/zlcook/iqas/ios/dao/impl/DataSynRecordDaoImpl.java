package com.zlcook.iqas.ios.dao.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.bean.DataSynRecordExample;
import com.zlcook.iqas.ios.dao.AbstractBaseDao;
import com.zlcook.iqas.ios.dao.DataSynRecordDao;
import com.zlcook.iqas.ios.mapper.DataSynRecordMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 上午11:04:46
* 
*/
@Repository
public class DataSynRecordDaoImpl extends AbstractBaseDao<DataSynRecordMapper, DataSynRecord> implements DataSynRecordDao {

	public DataSynRecordDaoImpl(DataSynRecordMapper entityMapper) {
		super(entityMapper);
	}

	@Override
	public List<DataSynRecord> list(DataSynRecordExample example) {
		
		return entityMapper.selectByExample(example);
	}

	@Override
	public void updateSynTableMetaVersion(Integer userId, String tableName) {
		// TODO Auto-generated method stub
		entityMapper.updateSynTableMetaVersion(userId, tableName, System.currentTimeMillis());
		
	}

}
