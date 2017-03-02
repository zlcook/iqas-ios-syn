package com.zlcook.iqas.ios.vo;

import com.zlcook.iqas.ios.enums.ResponseStateEnum;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午8:45:29
* 
*/
public class BaseStatusVO<T> {
	/**
	 * 返回值元数据，用于指示此次请求的状态
	 */
	private Meta meta;
	/**
	 * 返回数据
	 */
	private T data;
	
	
	public BaseStatusVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BaseStatusVO(ResponseStateEnum status) {
		super();
		meta = new Meta(status);
	}
	public void setStatuEnum(ResponseStateEnum status){
		meta = new Meta(status);
	}
	
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}

	public class Meta{
		/**
		 * 返回状态标识，该值来源于ResponseStateEnum中枚举值的status属性值
		 */
		private int status;
		/**
		 * 返回状态标识说明，该值来源于ResponseStateEnum中枚举的message属性值
		 */
		private String message;
		
		public Meta(ResponseStateEnum status) {
			this.status = status.getStatus();
			this.message = status.getMessage();
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		
	}
}
