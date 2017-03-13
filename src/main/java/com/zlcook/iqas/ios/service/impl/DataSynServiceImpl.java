package com.zlcook.iqas.ios.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.bean.DataSynRecordExample;
import com.zlcook.iqas.ios.bean.User;
import com.zlcook.iqas.ios.bean.UserCard;
import com.zlcook.iqas.ios.bean.UserCardExample;
import com.zlcook.iqas.ios.bean.UserExample;
import com.zlcook.iqas.ios.bean.UserLearningStyle;
import com.zlcook.iqas.ios.bean.UserLearningStyleExample;
import com.zlcook.iqas.ios.bean.UserResource;
import com.zlcook.iqas.ios.bean.UserResourceExample;
import com.zlcook.iqas.ios.bean.UserTestCount;
import com.zlcook.iqas.ios.bean.UserTestCountExample;
import com.zlcook.iqas.ios.bean.UserWord;
import com.zlcook.iqas.ios.bean.UserWordExample;
import com.zlcook.iqas.ios.dao.DataSynRecordDao;
import com.zlcook.iqas.ios.dao.UserCardDao;
import com.zlcook.iqas.ios.dao.UserDao;
import com.zlcook.iqas.ios.dao.UserLearningStyleDao;
import com.zlcook.iqas.ios.dao.UserResourceDao;
import com.zlcook.iqas.ios.dao.UserTestCountDao;
import com.zlcook.iqas.ios.dao.UserWordDao;
import com.zlcook.iqas.ios.dto.SynMetaDTO;
import com.zlcook.iqas.ios.dto.SynTableData;
import com.zlcook.iqas.ios.dto.SynTableName;
import com.zlcook.iqas.ios.service.DataSynService;
import com.zlcook.iqas.ios.service.SynStateService;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午1:41:26
* 
*/
@Service
public class DataSynServiceImpl implements DataSynService {

	private final static Logger logger = LoggerFactory.getLogger(DataSynServiceImpl.class);
	@Autowired
	private DataSynRecordDao dataSynRecordDao ;
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserCardDao userCardDao;
	@Autowired
	private UserLearningStyleDao userLearningStyleDao;
	@Autowired
	private UserTestCountDao userTestCountDao;
	@Autowired
	private UserResourceDao userResourceDao;
	@Autowired
	private UserWordDao userWordDao;
	@Autowired
	private SynStateService synStateService;
	
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

	@Override
	public boolean updateSynTable(SynTableData tableData,Integer userId) {
		try{
			if( tableData == null )
				return true;
		    List<User> listUser =tableData.getUser();
			if( listUser != null && listUser.size()>0){
				for(User entity : listUser){
					userDao.update(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, DataSynService.SYN_USER);
			}
	        List<UserCard> listUserCard =tableData.getUserCard();
			if( listUserCard != null && listUserCard.size()>0 ){
				for(UserCard entity : listUserCard){
					userCardDao.update(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, DataSynService.SYN_USERCARD);
			}
			List<UserLearningStyle> listUserLearningStyle = tableData.getUserLearningStyle();
			if( listUserLearningStyle != null  && listUserLearningStyle.size()>0){
				for(UserLearningStyle entity : listUserLearningStyle){
					userLearningStyleDao.update(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, DataSynService.SYN_USERLEARNINGSTYLE);
			}
			List<UserResource> listUserResource =tableData.getUserResource();
			if( listUserResource != null  && listUserResource.size()>0){
				for(UserResource entity : listUserResource){
					userResourceDao.update(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, DataSynService.SYN_USERRESOURCE);
			}
			List<UserTestCount> listUserTestCount =tableData.getUserTestCount();
			if( listUserTestCount != null  && listUserTestCount.size()>0){
				for(UserTestCount entity : listUserTestCount){
					userTestCountDao.update(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, DataSynService.SYN_USERTESTCOUNT);
			}
			List<UserWord> listUserWord =tableData.getUserWord();
			if( listUserWord != null  && listUserWord.size()>0){
				for(UserWord entity : listUserWord){
					userWordDao.update(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, DataSynService.SYN_USERWORD);
			}
		}catch(Exception e){
			logger.error("数据向上同步失败", e);
			return false;
			//throw new ServiceException(ResponseStateEnum.SERVER_EXCEPTION.setMessage("数据向上同步异常"));
		}

		return true;
	}

	@Override
	public SynTableData getTableData(List<SynTableName> listTableName, Integer userId) {
		SynTableData synTableData = new SynTableData();
		if( listTableName !=null ){
			for(SynTableName tableName : listTableName ){
				String name =tableName.getSynTable();
				if(name ==null )
					continue;
				if( name.equals(DataSynService.SYN_USER) ){
					UserExample example = new UserExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<User> synTableDatas=userDao.list(example,UserExample.class);
					synTableData.setUser(synTableDatas);
					continue;
				}
				if( name.equals(DataSynService.SYN_USERCARD) ){
					UserCardExample example = new UserCardExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<UserCard> synTableDatas=userCardDao.list(example,UserCardExample.class);
					synTableData.setUserCard(synTableDatas);
					continue;
				}
				if( name.equals(DataSynService.SYN_USERLEARNINGSTYLE) ){
					UserLearningStyleExample example = new UserLearningStyleExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<UserLearningStyle> synTableDatas=userLearningStyleDao.list(example,UserLearningStyleExample.class);
					synTableData.setUserLearningStyle(synTableDatas);
					continue;
				}
				if( name.equals(DataSynService.SYN_USERRESOURCE) ){
					UserResourceExample example = new UserResourceExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<UserResource> synTableDatas=userResourceDao.list(example,UserResourceExample.class);
					synTableData.setUserResource(synTableDatas);
					continue;
				}
				if( name.equals(DataSynService.SYN_USERTESTCOUNT) ){
					UserTestCountExample example = new UserTestCountExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<UserTestCount> synTableDatas=userTestCountDao.list(example,UserTestCountExample.class);
					synTableData.setUserTestCount(synTableDatas);
					continue;
				}
				if( name.equals(DataSynService.SYN_USERWORD) ){
					UserWordExample example = new UserWordExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<UserWord> synTableDatas=userWordDao.list(example,UserWordExample.class);
					synTableData.setUserWord(synTableDatas);
					continue;
				}
			}
		}
		return synTableData;
	}

}
