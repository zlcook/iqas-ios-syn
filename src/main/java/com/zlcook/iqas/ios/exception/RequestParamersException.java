package com.zlcook.iqas.ios.exception;
/**
* @author 周亮 
* @version 创建时间：2017年3月9日 下午6:24:13
* 请求参数异常：参数不存在,参数不满足要求
*/
public class RequestParamersException extends RuntimeException {

	public RequestParamersException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestParamersException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public RequestParamersException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public RequestParamersException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public RequestParamersException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
