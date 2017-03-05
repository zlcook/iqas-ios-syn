package com.zlcook.iqas.ios.service;
/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午2:28:48
* Token服务接口，封装了操作token的相关方法。
*/
public interface TokenService {
	/**
	 * redis中存放用户token信息的hash类型的键名
	 */
	public final static String REDIS_HASHKEY_USER_TOKEN="user:token";
	/**
	 * token是否有效，有效返回true,否则返回false,该方法会对参数进行校验
	 * @param token 需要被验证的token
	 * @return 有效返回true,否则返回false
	 */
	boolean isVaild(String token);

	/**
	 * 根据loginName生成token值。生成的token值格式必须符合*:*格式，
	 * 即token值的前部分是参数loginName的值，后部分是冒号（:）加上字符串。
	 * 生成的token值会同时保存在redis中，
	 * 在redis中使用hash类型存储用户的token值。
	 * hash的键名：user:token ; 字段：参数loginName的值 ;字段值:生成的token值。
	 * @param loginName 用户登录名，该方法不会对loginName进行校验，所以调用方法应该对该参数进行校验
	 * @return
	 * 返回生成的token值，符合格式lognName:*
	 */
	String generatorToken4User(String loginName);
	/**
	 * 从token中获取loginName
	 * @param token token值，应该满足generatorToken4User(String loginName)方法生成的格式。
	 * @return
	 * 返回loginName的值，不存在则返回null
	 */
	String  getLoginNameFromToken(String token);
}
