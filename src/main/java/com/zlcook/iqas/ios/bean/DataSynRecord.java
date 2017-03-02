package com.zlcook.iqas.ios.bean;

public class DataSynRecord {
    private Integer synId;

    private Long lastModTime;

    private Long lastSynTime;

    private Long size;

    private String synTable;

    private Integer userId;

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

    public String getSynTable() {
        return synTable;
    }

    public void setSynTable(String synTable) {
        this.synTable = synTable == null ? null : synTable.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}