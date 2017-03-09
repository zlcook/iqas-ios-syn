package com.zlcook.iqas.ios.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.bean.DataSynRecordExample;
import com.zlcook.iqas.ios.dao.DataSynRecordDao;
import com.zlcook.iqas.ios.dto.SynMetaDTO;
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
		
		String[] synTableArray=new String[]{DataSynService.SYN_USER,DataSynService.SYN_USERCARD,DataSynService.SYN_USERLEARNINGSTYLE,DataSynService.SYN_USERRESOURCE,DataSynService.SYN_USERTESTCOUNT,DataSynService.SYN_USERWORD};
		//确保该用户没有初始化过
		DataSynRecordExample example = new DataSynRecordExample();
		example.createCriteria().andUserIdEqualTo(userId);
		List<DataSynRecord> list =dataSynRecordDao.list(example);
		if( list ==null || list.size() ==0){
			for( String tableName : synTableArray){
				DataSynRecord table_meta=new DataSynRecord();
				table_meta.setUserId(userId);
				table_meta.setVersion(0);
				table_meta.setLastModTime(0L);
				table_meta.setSynTable(tableName);
				dataSynRecordDao.save(table_meta);
			}
		}
	}
	
	@Override
	public SynMetaDTO getSynMeta(List<DataSynRecord> serverTableMetas, List<DataSynRecord> mobileTableMetas) {
		// TODO Auto-generated method stub
		
		int count = serverTableMetas.size();
		SynMetaDTO synMetaDTO = new SynMetaDTO();
		for(int i=0;i< count;i++ ){
			DataSynRecord serverDr = serverTableMetas.get(i);
			String tableName =serverDr.getSynTable();
			DataSynRecord mobileDr =getTargetFromList(mobileTableMetas,tableName);
			
			if( mobileDr ==null ||  serverDr.getVersion() != mobileDr.getVersion()){
				synMetaDTO.putDownSynTableName(tableName);
				continue;
			}
			if(serverDr.getLastModTime()==null ){
				serverDr.setLastModTime(0L);
			}
			if(mobileDr.getLastModTime()==null ){
				mobileDr.setLastModTime(0L);
			}
			
			if( mobileDr.getLastModTime()>serverDr.getLastModTime())
				synMetaDTO.putUpSynTableName(tableName);
			
		}
		
		return synMetaDTO;
	}

	/**
	 *从tableMetas集合中寻找synTable值为tableName的实体类，找不到返回null
	 * @param tableMetas
	 * @param tableName 不可为null
	 * @return
	 */
	private DataSynRecord getTargetFromList(List<DataSynRecord> tableMetas,String tableName){
		if( tableMetas ==null || tableMetas.size()<=0)
		   return null;
		for( DataSynRecord dr : tableMetas)
			if( tableName.equals(dr.getSynTable()))
				return dr;
		return null;
	}
}
