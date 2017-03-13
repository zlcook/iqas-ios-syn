package com.zlcook.iqas.ios.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.zlcook.iqas.ios.bean.SynState;
import com.zlcook.iqas.ios.bean.User;
import com.zlcook.iqas.ios.dao.SynStateDao;
import com.zlcook.iqas.ios.service.TokenService;
import com.zlcook.iqas.ios.unitl.TokenUtils;

/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午2:39:08
* 
*/
@Service
public class TokenServiceImpl implements TokenService {
	
	private Logger logger = LoggerFactory.getLogger(TokenServiceImpl.class);
	/**
	 * 操作redis的服务类
	 */
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	/**
	 * 操作用户的数据访问接口
	 */
	@Autowired
	private SynStateDao synStateDao;
	
	@Override
	public boolean isVaild(String token) {
		
		Integer userId = getUserIdFromToken(token);
		if( userId ==null )
			return false;
		try {
			Object tokenValue =stringRedisTemplate.opsForHash().get(TokenService.REDIS_HASHKEY_USER_TOKEN, userId+"");
			if( tokenValue !=null){
				String value = (String)tokenValue;
				return token.equals(value);
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("校验token值是否有效时访问redis出现异常:"+e.getMessage(),e);
			//throw new RedisException("校验token值是否有效时访问redis出现异常");
			
			//绕过redis直接获取mysql数据库中的信息进行校验
			SynState state =synStateDao.getById(userId);
			if( state !=null && token.equals(state.getToken()))
				return true;
			
			return false;
		}
	}
	
    
	@Override
	public Integer  getUserIdFromToken(String token) {
		if( token == null || "".equals(token.trim()) || !token.contains(":"))
			return null;
		//获取userId
		String userId = token.split(":")[0];
		
		return Integer.parseInt(userId);
	}
	
	
	@Override
	public String generatorToken4User(Integer userId){
		String tokenValue =userId+":"+TokenUtils.generatorToken();
		try {
			stringRedisTemplate.opsForHash().put(TokenService.REDIS_HASHKEY_USER_TOKEN,userId+"", tokenValue);
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("将生成的token值保存redis数据库中出现异常:"+e.getMessage(),e);
			//throw new RedisException("将生成的token值保存redis数据库中出错");
		}
		return tokenValue;
	}

	public StringRedisTemplate getStringRedisTemplate() {
		return stringRedisTemplate;
	}
	public void setStringRedisTemplate(StringRedisTemplate stringRedisTemplate) {
		this.stringRedisTemplate = stringRedisTemplate;
	}


}
