package com.zlcook.iqas.ios.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import com.zlcook.iqas.ios.bean.User;
import com.zlcook.iqas.ios.dao.UserDao;
import com.zlcook.iqas.ios.exception.RedisException;
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
	private UserDao useDao;
	
	@Override
	public boolean isVaild(String token) {
		
		System.out.println("token:"+token);
		String loginName = getLoginNameFromToken(token);
		if( loginName ==null )
			return false;
		try {
			Object tokenValue =stringRedisTemplate.opsForHash().get(TokenService.REDIS_HASHKEY_USER_TOKEN, loginName);
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
			User user =useDao.getByLoginName(loginName);
			if( user ==null || !token.equals(user.getToken()) )
				return false;
			return true;
		}
	}
	
    
	@Override
	public String  getLoginNameFromToken(String token) {
		if( token == null || "".equals(token.trim()) || !token.contains(":"))
			return null;
		//获取loginName
		String loginName = token.split(":")[0];
		
		return loginName;
	}
	
	
	@Override
	public String generatorToken4User(String loginName){
		String tokenValue =loginName+":"+TokenUtils.generatorToken();
		try {
		stringRedisTemplate.opsForHash().put(TokenService.REDIS_HASHKEY_USER_TOKEN, loginName, tokenValue);
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
