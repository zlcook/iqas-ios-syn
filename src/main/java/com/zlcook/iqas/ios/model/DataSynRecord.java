package com.zlcook.iqas.ios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @author 周亮 
* @version 创建时间：2017年2月28日 下午4:23:28
* 数据同步表：存放用户在涉及的相关数据表的同步情况
*/
@Entity
public class DataSynRecord {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer synId;
	//同步表名称
	private String synTable;
	//用户id
	private Integer userId;
	//最后一次同步时间，单位毫秒
	private long lastSynTime;
	//该表的最后一次修改时间
	private long lastModTime;
	//同步的数据量
	private long size;
	public Integer getSynId() {
		return synId;
	}
	public void setSynId(Integer synId) {
		this.synId = synId;
	}
	public String getSynTable() {
		return synTable;
	}
	public void setSynTable(String synTable) {
		this.synTable = synTable;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public long getLastSynTime() {
		return lastSynTime;
	}
	public void setLastSynTime(long lastSynTime) {
		this.lastSynTime = lastSynTime;
	}
	public long getLastModTime() {
		return lastModTime;
	}
	public void setLastModTime(long lastModTime) {
		this.lastModTime = lastModTime;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	
}
