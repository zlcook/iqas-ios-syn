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
	 * 保存
	 */
	@Test
	public void save(){
		DataSynRecord entity = new DataSynRecord();
		entity.setSynId(1);
		entity.setUserId(1);
		entity.setSynTable("user");
		entity.setLastModTime(10L);
		entity.setLastSynTime(9L);
		entity.setSize(1000L);
		
		int saveResult =dataSynRecordDao.save(entity);
		if( saveResult ==1 )
			System.out.println("保存成功");
		else
			System.out.println("保存失败");
	}
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
