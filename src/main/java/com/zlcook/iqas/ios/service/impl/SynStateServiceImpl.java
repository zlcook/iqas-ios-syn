package com.zlcook.iqas.ios.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlcook.iqas.ios.bean.SynState;
import com.zlcook.iqas.ios.dao.SynStateDao;
import com.zlcook.iqas.ios.enums.ResponseStateEnum;
import com.zlcook.iqas.ios.enums.SynStateEnum;
import com.zlcook.iqas.ios.exception.BaseServiceException;
import com.zlcook.iqas.ios.service.SynStateService;

/**
* @author 周亮 
* @version 创建时间：2017年3月11日 下午9:36:26
* 
*/
@Service
public class SynStateServiceImpl implements SynStateService {

	private final static Logger logger = LoggerFactory.getLogger(SynStateServiceImpl.class);
	@Autowired
	private SynStateDao synStateDao;
	
	@Override
	public SynStateEnum getSynResult(SynState synState,String synDevice) {
		// TODO Auto-generated method stub
		
		if(  synState.getSynDevice() == null ){
			initCurrentDeviceSynState(synState,synDevice);
			return  SynStateEnum.SYN_SUCCESS;
		}
		//当前设备
		if(  synState.getSynDevice().equals(synDevice) ){
			if( synState.getSynResult()!=null && !synState.getSynResult() ){
				return SynStateEnum.SYN_CURR_DEVICE_FAILURE;
			}
			if( synState.getSynCount()!=null && synState.getSynCount()< 2 ){
				return SynStateEnum.SYN_CURR_DEVICE_DATA_LEAVE;
			}
			
		}else{//检查上一次登录的设备
			if( synState.getSynResult()!=null && !synState.getSynResult() ){
				return SynStateEnum.SYN_LAST_DEVICE_FAILURE;
			}
			if( synState.getSynCount()!=null && synState.getSynCount()< 2 ){
				return SynStateEnum.SYN_LAST_DEVICE_DATA_LEAVE;
			}
		}
		
		initCurrentDeviceSynState(synState,synDevice);
		return  SynStateEnum.SYN_SUCCESS;
	}
	/**
	 * 初始化当前设备的同步信息，用户联网登录设备后，在操作之前对同步信息进行初始化。
	 * @param synState  保存之前同步信息的对象
	 * @param synDevice 当前设备标识
	 */
	private void initCurrentDeviceSynState(SynState synState,String synDevice){
		synState.setSynCount(0);
		synState.setSynDevice(synDevice);
		synState.setSynResult(true);
		synState.setSynToken(null);
		synStateDao.update(synState);
	}
	@Override
	public void startSynFlage(Integer userId) {
		// TODO Auto-generated method stub
		SynState synState = synStateDao.getById(userId);
		if( synState == null ){
			throw new BaseServiceException(ResponseStateEnum.USER_USERID_INVALID);
		}
		synState.setSynResult(false);
		synStateDao.update(synState);
	}
	@Override
	public void stopSynFlage(Integer userId) {
		// TODO Auto-generated method stub
		SynState synState = synStateDao.getById(userId);
		if( synState == null ){
			throw new BaseServiceException(ResponseStateEnum.USER_USERID_INVALID);
		}
		synState.setSynResult(true);
		Integer count = synState.getSynCount();
		count = (count == null)?1:count+1;
		synState.setSynCount(count);
		synStateDao.update(synState);
	}
	@Override
	public void ignoreSynRemind(Integer userId,String synDevice) {
		// TODO Auto-generated method stub
		SynState synState = synStateDao.getById(userId);
		if( synState == null ){
			throw new BaseServiceException(ResponseStateEnum.USER_USERID_INVALID);
		}
		synState.setSynResult(true);
		synState.setSynDevice(synDevice);
		synState.setSynCount(0);
		synStateDao.update(synState);
	}
	@Override
	public void save(SynState synState) {
		// TODO Auto-generated method stub
		synStateDao.save(synState);
	}
	@Override
	public SynState getById(Integer userId) {
		// TODO Auto-generated method stub
		return synStateDao.getById(userId);
	}
}
