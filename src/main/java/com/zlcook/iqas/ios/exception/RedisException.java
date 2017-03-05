package com.zlcook.iqas.ios.exception;
/**
* @author 周亮 
* @version 创建时间：2017年3月5日 下午1:35:26
* Redis操作异常，该系统中对用户token值的生成和获取会产生对redis的访问操作。
*/
public class RedisException extends RuntimeException {

	public RedisException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RedisException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RedisException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RedisException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RedisException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
