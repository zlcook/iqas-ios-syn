package com.zlcook.iqas.ios.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zlcook.iqas.ios.bean.LoginRecord;


/**
* @author 周亮 
* @version 创建时间：2017年3月8日 下午9:45:05
* 
*/

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginRecordMapperTests {

	@Autowired
	private LoginRecordMapper loginRecordMapper;
	/**
	 * 查找，根据用户名查找用户
	 */
	@Test
	public void getLoginName(){
		LoginRecord record = loginRecordMapper.findByState(1);
		if(record != null)
		  System.out.println(record.getLoginName()+" "+record.toString());	
		else
			System.out.println("null");
	}
}
