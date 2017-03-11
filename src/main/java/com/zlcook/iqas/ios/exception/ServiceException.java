package com.zlcook.iqas.ios.exception;

import com.zlcook.iqas.ios.enums.ResponseStateEnum;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 下午3:30:05
* 
*/
public class ServiceException extends RuntimeException {

	/**
	 * 错误状态描述
	 */
	private ResponseStateEnum status;

	public ServiceException(ResponseStateEnum status) {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceException(ResponseStateEnum status,String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(ResponseStateEnum status,String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	
}
