package com.zlcook.iqas.ios.enums;
/**
* @author 周亮 
* @version 创建时间：2017年3月12日 上午10:54:58
* 表示移动端上上数据同步情况
*/
public enum SynStateEnum {

	/**
	 * 同步成功，没有遗留数据。
	 */
	SYN_SUCCESS(1,"同步成功"),
	/**
	 * 有可能有数据遗留在上次操作的设备上。
	 */
	SYN_LAST_DEVICE_DATA_LEAVE(2,"有可能有数据遗留在上次操作的设备上"),
	/**
	 * 在上次登录操作的设备上数据同步失败
	 */
	SYN_LAST_DEVICE_FAILURE(3,"在上次登录操作的设备上数据同步失败"),
	/**
	 * 有可能有数据遗留在当前的设备上。
	 */
	SYN_CURR_DEVICE_DATA_LEAVE(4,"有可能有数据遗留在当前的设备上"),
	/**
	 * 当前设备上数据同步失败
	 */
	SYN_CURR_DEVICE_FAILURE(5,"上次在当前设备上数据同步失败");
	
	private Integer synFlage;
	private String message;
	private SynStateEnum(Integer synFlage, String message) {
		this.synFlage = synFlage;
		this.message = message;
	}
	public Integer getSynFlage() {
		return synFlage;
	}
	public String getMessage() {
		return message;
	}
	
	
}
