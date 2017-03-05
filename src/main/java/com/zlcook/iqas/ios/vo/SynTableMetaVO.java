package com.zlcook.iqas.ios.vo;
/**
* @author 周亮 
* @version 创建时间：2017年3月3日 下午1:28:38
* 同步表的元数据
*/
public class SynTableMetaVO {

    private String synTable; 

	private Integer userId;
	
	private Integer synId;

	private Long lastModTime;

	private Long lastSynTime;

	private Long size;
	

	public String getSynTable() {
		return synTable;
	}

	public void setSynTable(String synTable) {
		this.synTable = synTable;
	}

	public Integer getSynId() {
		return synId;
	}

	public void setSynId(Integer synId) {
		this.synId = synId;
	}

	public Long getLastModTime() {
		return lastModTime;
	}

	public void setLastModTime(Long lastModTime) {
		this.lastModTime = lastModTime;
	}

	public Long getLastSynTime() {
		return lastSynTime;
	}

	public void setLastSynTime(Long lastSynTime) {
		this.lastSynTime = lastSynTime;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "SynTableMetaVO [synTable=" + synTable + ", synId=" + synId + ", lastModTime=" + lastModTime
				+ ", lastSynTime=" + lastSynTime + ", size=" + size + ", userId=" + userId + "]";
	}

}
