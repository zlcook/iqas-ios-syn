package com.zlcook.iqas.ios.bean;

public class DataSynRecord {
    private Integer synId;

    private String synTable;

    private Integer userId;

    private Long lastModTime;

    private Integer version;

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
        this.synTable = synTable == null ? null : synTable.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getLastModTime() {
        return lastModTime;
    }

    public void setLastModTime(Long lastModTime) {
        this.lastModTime = lastModTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}