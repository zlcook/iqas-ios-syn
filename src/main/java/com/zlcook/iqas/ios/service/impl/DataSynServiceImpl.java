package com.zlcook.iqas.ios.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.bean.DataSynRecordExample;
import com.zlcook.iqas.ios.bean.User;
import com.zlcook.iqas.ios.bean.UserBehaviour;
import com.zlcook.iqas.ios.bean.UserCard;
import com.zlcook.iqas.ios.bean.UserCardExample;
import com.zlcook.iqas.ios.bean.UserExample;
import com.zlcook.iqas.ios.bean.UserLearningStyle;
import com.zlcook.iqas.ios.bean.UserLearningStyleExample;
import com.zlcook.iqas.ios.bean.UserLogin;
import com.zlcook.iqas.ios.bean.UserResource;
import com.zlcook.iqas.ios.bean.UserResourceExample;
import com.zlcook.iqas.ios.bean.UserTest;
import com.zlcook.iqas.ios.bean.UserTestCount;
import com.zlcook.iqas.ios.bean.UserTestCountExample;
import com.zlcook.iqas.ios.bean.UserTestExample;
import com.zlcook.iqas.ios.bean.UserWord;
import com.zlcook.iqas.ios.bean.UserWordExample;
import com.zlcook.iqas.ios.constant.TableNameConstant;
import com.zlcook.iqas.ios.dao.DataSynRecordDao;
import com.zlcook.iqas.ios.dao.UserBehaviourDao;
import com.zlcook.iqas.ios.dao.UserCardDao;
import com.zlcook.iqas.ios.dao.UserDao;
import com.zlcook.iqas.ios.dao.UserLearningStyleDao;
import com.zlcook.iqas.ios.dao.UserLoginDao;
import com.zlcook.iqas.ios.dao.UserResourceDao;
import com.zlcook.iqas.ios.dao.UserTestCountDao;
import com.zlcook.iqas.ios.dao.UserTestDao;
import com.zlcook.iqas.ios.dao.UserWordDao;
import com.zlcook.iqas.ios.dto.SynMetaDTO;
import com.zlcook.iqas.ios.dto.SynTableData;
import com.zlcook.iqas.ios.dto.SynTableName;
import com.zlcook.iqas.ios.dto.TrackTableData;
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
	private UserTestDao userTestDao;
	@Autowired
	private UserResourceDao userResourceDao;
	@Autowired
	private UserWordDao userWordDao;
	@Autowired
	private UserTestCountDao userTestCountDao;
	@Autowired
	private UserLoginDao userLoginDao;
	@Autowired
	private UserBehaviourDao userBehaviourDao;
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
		
		String[] synTableArray=new String[]{TableNameConstant.SYN_USERCARD,TableNameConstant.SYN_USERLEARNINGSTYLE,TableNameConstant.SYN_USER_TEST_COUNT,TableNameConstant.SYN_USERRESOURCE,TableNameConstant.SYN_USERTEST,TableNameConstant.SYN_USERWORD};
		//确保该用户没有初始化过
		DataSynRecordExample example = new DataSynRecordExample();
		example.createCriteria().andUserIdEqualTo(userId);
		List<DataSynRecord> list =dataSynRecordDao.list(example);
		if( list ==null || list.size() ==0){
			
			//用户元数据版本设置为1,时间为当前时间，因为用户已经注册过了，服务器端数据版本更新
			DataSynRecord usertable_meta=new DataSynRecord();
			usertable_meta.setUserId(userId);
			usertable_meta.setVersion(1);
			usertable_meta.setLastModTime(System.currentTimeMillis());
			usertable_meta.setSynTable(TableNameConstant.SYN_USER);
			dataSynRecordDao.save(usertable_meta);
			
			//其余元数据设为最初始状态
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
	
	@Override
	public SynMetaDTO getSynMeta(List<DataSynRecord> serverTableMetas, List<DataSynRecord> mobileTableMetas) {
		// TODO Auto-generated method stub
		
		int count = serverTableMetas.size();
		SynMetaDTO synMetaDTO = new SynMetaDTO();
		for(int i=0;i< count;i++ ){
			DataSynRecord serverDr = serverTableMetas.get(i);
			String tableName =serverDr.getSynTable();
			//获取移动端中名称相同的表
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
			if( tableName.equalsIgnoreCase(dr.getSynTable()))
				return dr;
		return null;
	}

	@Override
	public SynTableData getTableData(List<SynTableName> listTableName, Integer userId) {
		SynTableData synTableData = new SynTableData();
		if( listTableName !=null ){

			for(SynTableName tableName : listTableName ){
				String name =tableName.getSynTable();
				if(name ==null )
					continue;
				if( name.equalsIgnoreCase(TableNameConstant.SYN_USER) ){
					UserExample example = new UserExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<User> synTableDatas=userDao.list(example,UserExample.class);
					synTableData.setUser(synTableDatas);
					continue;
				}
				if( name.equalsIgnoreCase(TableNameConstant.SYN_USERCARD) ){
					UserCardExample example = new UserCardExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<UserCard> synTableDatas=userCardDao.list(example,UserCardExample.class);
					synTableData.setUserCard(synTableDatas);
					continue;
				}
				if( name.equalsIgnoreCase(TableNameConstant.SYN_USERLEARNINGSTYLE) ){
					UserLearningStyleExample example = new UserLearningStyleExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<UserLearningStyle> synTableDatas=userLearningStyleDao.list(example,UserLearningStyleExample.class);
					synTableData.setUserLearningStyle(synTableDatas);
					continue;
				}
				if( name.equalsIgnoreCase(TableNameConstant.SYN_USER_TEST_COUNT) ){
					UserTestCountExample example = new UserTestCountExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<UserTestCount> synTableDatas=userTestCountDao.list(example,UserTestCountExample.class);
					synTableData.setUserTestCount(synTableDatas);
					continue;
				}
				if( name.equalsIgnoreCase(TableNameConstant.SYN_USERRESOURCE) ){
					UserResourceExample example = new UserResourceExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<UserResource> synTableDatas=userResourceDao.list(example,UserResourceExample.class);
					synTableData.setUserResource(synTableDatas);
					continue;
				}
				if( name.equalsIgnoreCase(TableNameConstant.SYN_USERTEST) ){
					UserTestExample example = new UserTestExample();
					example.createCriteria().andUserIdEqualTo(userId);
					List<UserTest> synTableDatas=userTestDao.list(example,UserTestExample.class);
					synTableData.setUserTest(synTableDatas);
					continue;
				}
				if( name.equalsIgnoreCase(TableNameConstant.SYN_USERWORD) ){
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
				dataSynRecordDao.updateSynTableMetaVersion(userId, TableNameConstant.SYN_USER);
			}
			/**
			 * 以下三个表每个用户只有一条数据，所以采用根据userId进行更新
			 */
	        List<UserCard> listUserCard =tableData.getUserCard();
			if( listUserCard != null && listUserCard.size()>0 ){
				for(UserCard entity : listUserCard){
					userCardDao.saveOrUpdate(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, TableNameConstant.SYN_USERCARD);
			}
			List<UserLearningStyle> listUserLearningStyle = tableData.getUserLearningStyle();
			if( listUserLearningStyle != null  && listUserLearningStyle.size()>0){
				for(UserLearningStyle entity : listUserLearningStyle){
					userLearningStyleDao.saveOrUpdate(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, TableNameConstant.SYN_USERLEARNINGSTYLE);
			}
			List<UserTestCount> listUserTestCount = tableData.getUserTestCount();
			if( listUserTestCount != null  && listUserTestCount.size()>0){
				for(UserTestCount entity : listUserTestCount){
					userTestCountDao.saveOrUpdate(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, TableNameConstant.SYN_USER_TEST_COUNT);
			}
			/**
			 * 以下三个表的数据同步采取删除-添加方法，即：每次先删除用户旧的数据，在插入新的数据。不在原来数据上修改。
			 * 
			 */
			List<UserResource> listUserResource =tableData.getUserResource();
			if( listUserResource != null  && listUserResource.size()>0){
				//删除之前的数据
				userResourceDao.deleteByUserId(userId);
				//插入新的数据
				for(UserResource entity : listUserResource){
					//让其id自动生成
					entity.setUserResourceId(null);
					userResourceDao.save(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, TableNameConstant.SYN_USERRESOURCE);
			}
			List<UserTest> listUserTest =tableData.getUserTest();
			if( listUserTest != null  && listUserTest.size()>0){
				//删除之前的数据
				userTestDao.deleteByUserId(userId);
				//插入新的数据
				for(UserTest entity : listUserTest){
					//让其id自动生成
					entity.setUsertestId(null);
					userTestDao.save(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, TableNameConstant.SYN_USERTEST);
			}
			List<UserWord> listUserWord =tableData.getUserWord();
			if( listUserWord != null  && listUserWord.size()>0){
				//删除之前的数据
				userWordDao.deleteByUserId(userId);
				//插入新的数据
				for(UserWord entity : listUserWord){
					//让其id自动生成
					entity.setUserWordId(null);
					userWordDao.save(entity);
				}
				dataSynRecordDao.updateSynTableMetaVersion(userId, TableNameConstant.SYN_USERWORD);
			}
		}catch(Exception e){
			logger.error("数据向上同步失败", e);
			return false;
			//throw new ServiceException(ResponseStateEnum.SERVER_EXCEPTION.setMessage("数据向上同步异常"));
		}

		return true;
	}

	@Override
	public boolean saveTrackTable(TrackTableData trackData, Integer userId) {
		try{
			if( trackData == null )
				return true;
			 List<UserBehaviour> listUserBehaviour = trackData.getUserBehaviour();
			 if( listUserBehaviour != null  && listUserBehaviour.size()>0){
					//插入新的数据
					for(UserBehaviour entity : listUserBehaviour){
						//让其id自动生成
						entity.setUserBehaviourId(null);
						userBehaviourDao.save(entity);
					}
			 }
			 List<UserLogin> listLoginData = trackData.getUserLogin();
			 if( listLoginData != null  && listLoginData.size()>0){
					//插入新的数据
					for(UserLogin entity : listLoginData){
						//让其id自动生成
						entity.setUserLoginId(null);
						userLoginDao.save(entity);
					}
			 }
			 
		}catch(Exception e){
			logger.error("轨迹数据上传失败失败", e);
			return false;
			//throw new ServiceException(ResponseStateEnum.SERVER_EXCEPTION.setMessage("数据向上同步异常"));
		}

		return true;
	}

}
