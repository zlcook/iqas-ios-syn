package com.zlcook.iqas.ios.redis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
* @author 周亮 
* @version 创建时间：2017年3月4日 下午9:28:55
* Redis相关操作测试
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	
	@Test
	public void test() throws Exception {
		// 保存字符串
		stringRedisTemplate.opsForValue().set("name", "liang");
		String keyValue = stringRedisTemplate.opsForValue().get("name");
		System.out.println(keyValue);
		Assert.assertEquals("liang",keyValue);
    }
}
