package com.zlcook.iqas.ios.exception;
/**
* @author 周亮 
* @version 创建时间：2017年3月9日 下午3:28:28
* 移动端给后台传输json数据，如果后端根据json数据解析成对象的过程中出现错误，则抛出该异常，造成异常原因：1.传过来的json数据格式不对。2.json数据中不满足类型要求
*/
public class JSONDataParseException extends RuntimeException {

	public JSONDataParseException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JSONDataParseException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public JSONDataParseException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public JSONDataParseException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public JSONDataParseException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
