package com.zlcook.iqas.ios.bean;

import java.util.Date;

public class UserBehaviour {
    private Integer userBehaviourId;

    private String dowhat;

    private Date dowhen;

    private String dowhere;

    private Integer userId;

    public Integer getUserBehaviourId() {
        return userBehaviourId;
    }

    public void setUserBehaviourId(Integer userBehaviourId) {
        this.userBehaviourId = userBehaviourId;
    }

    public String getDowhat() {
        return dowhat;
    }

    public void setDowhat(String dowhat) {
        this.dowhat = dowhat == null ? null : dowhat.trim();
    }

    public Date getDowhen() {
        return dowhen;
    }

    public void setDowhen(Date dowhen) {
        this.dowhen = dowhen;
    }

    public String getDowhere() {
        return dowhere;
    }

    public void setDowhere(String dowhere) {
        this.dowhere = dowhere == null ? null : dowhere.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}