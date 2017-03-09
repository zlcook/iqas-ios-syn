package com.zlcook.iqas.ios.vo;

import java.util.List;

import com.zlcook.iqas.ios.dto.SynMetaDTO.KeyValue;

/**
* @author 周亮 
* @version 创建时间：2017年3月9日 下午5:04:14
* 返回给移动端的同步元数据，指明这次同步的信息。同步元数据和同步表的元数据DataSynRecord不一样.
*/
public class SynMetaVO {
	/**
	 * 用户id
	 */
	private Integer userId;
	/**
	 *  需要进行同步的表的数量，等于向上同步和向下同步的数据表之和
	 */
	private int synTableCount;
	/**
	 * upsyntable:移动端->服务端，移动端需要上传的数据表的名称集合：通过比较得出，移动端拥有该数据表的最新数据，所以要上传到服务端。
	 */
	private List<KeyValue> upsyntable;
	/**
	 * downsyntable:：服务端->移动端，移动端需要接收的数据表的名称集合：通过比较得出，服务端拥有该数据表的最新数据，所以移动端需要接收最新的数据。
	 */
	private List<KeyValue> downsyntable;
	
	public SynMetaVO(Integer userId, List<KeyValue> upsyntable, List<KeyValue> downsyntable) {
		super();
		this.userId = userId;
		this.upsyntable = upsyntable;
		this.downsyntable = downsyntable;
		this.synTableCount= this.upsyntable.size()+this.downsyntable.size();
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public int getSynTableCount() {
		return synTableCount;
	}
	
	public List<KeyValue> getUpsyntable() {
		return upsyntable;
	}
	public void setUpsyntable(List<KeyValue> upsyntable) {
		this.upsyntable = upsyntable;
	}
	public List<KeyValue> getDownsyntable() {
		return downsyntable;
	}
	public void setDownsyntable(List<KeyValue> downsyntable) {
		this.downsyntable = downsyntable;
	}
	
	
}
