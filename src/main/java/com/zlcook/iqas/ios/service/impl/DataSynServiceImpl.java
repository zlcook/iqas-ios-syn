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
	
	@Override
	public void init4User(Integer userId) {
		if( userId ==null )
		   return ;
		
		String[] synTableArray=new String[]{"user","usercard","userlearningstyle","userresource","usertestcount","userword"};
		//确保该用户没有初始化过
		DataSynRecordExample example = new DataSynRecordExample();
		example.createCriteria().andUserIdEqualTo(userId);
		List<DataSynRecord> list =dataSynRecordDao.list(example);
		if( list ==null || list.size() ==0){
			for( String tableName : synTableArray){
				DataSynRecord table_meta=new DataSynRecord();
				table_meta.setUserId(userId);
				table_meta.setVersion(0);
				table_meta.setLastModTime(null);
				table_meta.setSynTable(tableName);
				dataSynRecordDao.save(table_meta);
			}
		}
	}

}
