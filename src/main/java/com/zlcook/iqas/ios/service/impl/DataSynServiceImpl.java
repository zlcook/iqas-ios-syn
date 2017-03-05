package com.zlcook.iqas.ios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.bean.DataSynRecordExample;
import com.zlcook.iqas.ios.dao.DataSynRecordDao;
import com.zlcook.iqas.ios.service.DataSynService;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午1:41:26
* 
*/
@Service
public class DataSynServiceImpl implements DataSynService {

	@Autowired
	private DataSynRecordDao dataSynRecordDao ;
	@Override
	public List<DataSynRecord> listTableSynRecord(Integer userId) {
		DataSynRecordExample example = new DataSynRecordExample();
		example.createCriteria().andUserIdEqualTo(userId);
		return dataSynRecordDao.list(example);
	}

}
