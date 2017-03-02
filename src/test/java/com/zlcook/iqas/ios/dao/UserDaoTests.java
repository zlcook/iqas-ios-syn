package com.zlcook.iqas.ios.dao;

import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zlcook.iqas.ios.bean.User;

/**
* @author 周亮 
* @version 创建时间：2017年3月2日 下午6:13:34
* UserMapper类测试，测试了查询方法
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTests {
	@Autowired
	private UserDao userDao;
	/**
	 * 查找，根据用户名查找用户
	 */
	@Test
	public void getLoginName(){
		User user =userDao.getByLoginName("liang");
		if(user != null)
		  System.out.println(user.getLoginName()+" "+user.toString());	
	}
	/**
	 * 查找，根据id查找
	 */
	@Test
	public void getById(){
		User user =userDao.getById(1);
		if( user !=null )
		   System.out.println(user.getLoginName()+" "+user.toString());	
	}
	/**
	 * 查找，集合
	 */
	@Test
	public void list(){
		List<User> list =userDao.list();
		if( list !=null )
			for( User user : list)
				System.out.println(user.getLoginName()+" "+user.toString());
	}
	
	/**
	 * 保存
	 */
	@Test
	public void save(){
		User user = new User();
		int r =new Random().nextInt(1000);
		String userName ="zhangsan"+r;
		user.setLoginName("zhangsan"+r);
		user.setPassword("123");
		user.setRealName("张三");
		user.setSex(1);
		user.setClassNum(4);
		int saveResult =userDao.save(user);
		if( saveResult ==1 )
			System.out.println(userName+":保存成功");
		else
			System.out.println(userName+":保存失败");
	}
	
	/**
	 * 更新
	 */
	@Test
	public void update(){
		User user = new User();
		int r =new Random().nextInt(1000);
		String userName ="zhangsan"+r;
		user.setLoginName("zhangsan"+r);
		user.setPassword("123");
		user.setRealName("张三");
		user.setSex(1);
		user.setClassNum(4);
		int updateResult =userDao.update(user);
		if( updateResult ==1 )
			System.out.println(userName+":更新成功");
		else
			System.out.println(userName+":更新失败");
			
	}
	/**
	 * 更新
	 */
	@Test
	public void count(){
		long count = userDao.count();
		System.out.println("用户总记录数："+count);
	}
	
}
