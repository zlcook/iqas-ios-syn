package com.zlcook.iqas.ios.bean;

import java.util.Date;

public class UserResource {
    private Integer userResourceId;

    private Integer learncount;

    private Integer learntimenow;

    private Integer learntimes;

    private Integer rType;

    private Integer resourceId;

    private Date rloginTime;

    private Date rlogoutTime;

    private Integer userId;

    private String word;

    public Integer getUserResourceId() {
        return userResourceId;
    }

    public void setUserResourceId(Integer userResourceId) {
        this.userResourceId = userResourceId;
    }

    public Integer getLearncount() {
        return learncount;
    }

    public void setLearncount(Integer learncount) {
        this.learncount = learncount;
    }

    public Integer getLearntimenow() {
        return learntimenow;
    }

    public void setLearntimenow(Integer learntimenow) {
        this.learntimenow = learntimenow;
    }

    public Integer getLearntimes() {
        return learntimes;
    }

    public void setLearntimes(Integer learntimes) {
        this.learntimes = learntimes;
    }

    public Integer getrType() {
        return rType;
    }

    public void setrType(Integer rType) {
        this.rType = rType;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Date getRloginTime() {
        return rloginTime;
    }

    public void setRloginTime(Date rloginTime) {
        this.rloginTime = rloginTime;
    }

    public Date getRlogoutTime() {
        return rlogoutTime;
    }

    public void setRlogoutTime(Date rlogoutTime) {
        this.rlogoutTime = rlogoutTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }
}