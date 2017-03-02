package com.zlcook.iqas.ios.bean;

import java.util.Date;

public class UserTest {
    private Integer usertestId;

    private Integer answertimes;

    private Integer righttimes;

    private Date testinTime;

    private Date testoutTime;

    private Integer testtype;

    private Integer userId;

    private String word;

    private Integer wrongtimes;

    public Integer getUsertestId() {
        return usertestId;
    }

    public void setUsertestId(Integer usertestId) {
        this.usertestId = usertestId;
    }

    public Integer getAnswertimes() {
        return answertimes;
    }

    public void setAnswertimes(Integer answertimes) {
        this.answertimes = answertimes;
    }

    public Integer getRighttimes() {
        return righttimes;
    }

    public void setRighttimes(Integer righttimes) {
        this.righttimes = righttimes;
    }

    public Date getTestinTime() {
        return testinTime;
    }

    public void setTestinTime(Date testinTime) {
        this.testinTime = testinTime;
    }

    public Date getTestoutTime() {
        return testoutTime;
    }

    public void setTestoutTime(Date testoutTime) {
        this.testoutTime = testoutTime;
    }

    public Integer getTesttype() {
        return testtype;
    }

    public void setTesttype(Integer testtype) {
        this.testtype = testtype;
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

    public Integer getWrongtimes() {
        return wrongtimes;
    }

    public void setWrongtimes(Integer wrongtimes) {
        this.wrongtimes = wrongtimes;
    }
}