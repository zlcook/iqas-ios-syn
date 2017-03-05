package com.zlcook.iqas.ios.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zlcook.iqas.ios.bean.DataSynRecord;
import com.zlcook.iqas.ios.bean.User;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午12:24:31
* 
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSynRecordDaoTests {
	@Autowired
	private DataSynRecordDao dataSynRecordDao;
	
	/**
	 * 查找，根据id查找
	 */
	@Test
	public void getById(){
		DataSynRecord entity  =dataSynRecordDao.getById(1);
		if( entity !=null )
		   System.out.println(entity.getSynTable()+" "+entity.toString());	
	}
}
