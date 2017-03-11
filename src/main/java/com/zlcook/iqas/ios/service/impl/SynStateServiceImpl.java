package com.zlcook.iqas.ios.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlcook.iqas.ios.dao.SynStateDao;
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
	public int getSynResult(Integer userId, String synDevice) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
