package com.zlcook.iqas.ios.bean;
/**
* @author 周亮 
* @version 创建时间：2017年3月11日 下午5:26:29
* 同步情况表
* 该表记录了用户的同步情况，
* 为了防止用户在同一台设备上同时联网操作，设置了token字段，用户每次登陆后都会生成一个新的token。
*/
public class SynState {

	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 * 登陆标识,用户每次联网登录后都会生成一个新的token值，这样就防止了用户在不同设备上同时联网操作。因为用户每次联网操作都需要携带该值，除了登录、注册等操作。
	 */
	private String token;
	
	/**
	 * 同步标识
	 * 防止同一批数据多次同步。用户在正式开始同步前，会向服务端获取同步元数据，这时服务端会生成一个新的同步标识，并包含在元数据中发送给移动端。
	 * 移动端开始同步时会携带该标识过来，服务端将移动端标识和服务存放的比较，如果相同则进行同步。
	 * 
	 */
	private String synToken;
	/**
	 * 同步设备
	 */
	private String synDevice;
	/**
	 * 同步结果，如果同步失败该结果为false,用户登录后检查到该标识为false，则需要提醒用户上一次登录后有数据没有同步成功
	 */
	private Boolean synResult;
	/**
	 * 同步次数，标识用户在同一个token下同步的次数，如果下次登录后，发现该值小于2，则提示用户上一次有可能有数据没同步
	 */
	private Integer synCount;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getSynDevice() {
		return synDevice;
	}
	public void setSynDevice(String synDevice) {
		this.synDevice = synDevice;
	}
	public Boolean getSynResult() {
		return synResult;
	}
	public void setSynResult(Boolean synResult) {
		this.synResult = synResult;
	}
	public Integer getSynCount() {
		return synCount;
	}
	public void setSynCount(Integer synCount) {
		this.synCount = synCount;
	}
	public String getSynToken() {
		return synToken;
	}
	public void setSynToken(String synToken) {
		this.synToken = synToken;
	}
	
}
