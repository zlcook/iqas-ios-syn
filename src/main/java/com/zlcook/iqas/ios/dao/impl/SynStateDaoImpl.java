package com.zlcook.iqas.ios.dao.impl;

import org.springframework.stereotype.Repository;

import com.zlcook.iqas.ios.bean.SynState;
import com.zlcook.iqas.ios.dao.AbstractBaseDao;
import com.zlcook.iqas.ios.dao.SynStateDao;
import com.zlcook.iqas.ios.mapper.SynStateMapper;

/**
* @author 周亮 
* @version 创建时间：2017年3月11日 下午9:27:30
* 
*/
@Repository
public class SynStateDaoImpl extends AbstractBaseDao<SynStateMapper, SynState> implements SynStateDao {

	public SynStateDaoImpl(SynStateMapper entityMapper) {
		super(entityMapper);
	}

}
