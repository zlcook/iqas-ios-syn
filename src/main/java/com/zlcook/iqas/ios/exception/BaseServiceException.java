package com.zlcook.iqas.ios.exception;

import com.zlcook.iqas.ios.enums.ResponseStateEnum;

/**
* @author 周亮 
* @version 创建时间：2017年3月10日 下午3:30:05
* 
*/
public class BaseServiceException extends RuntimeException {

	/**
	 * 错误状态描述
	 */
	private ResponseStateEnum status;

	public BaseServiceException(ResponseStateEnum status) {
		super(status.getMessage());
		this.status = status;
		
	}

	public BaseServiceException(ResponseStateEnum status,String arg0, Throwable arg1) {
		super(arg0, arg1);
		this.status = status;
	}

	public BaseServiceException(ResponseStateEnum status,String arg0) {
		super(arg0);
		this.status = status;
	}

	public ResponseStateEnum getStatus() {
		return status;
	}

	
}
