package com.zlcook.iqas.ios.bean;

public class UserWord {
    private Integer userWordId;

    private Integer topic;

    private Integer userId;

    private String word;

    private Integer wordlearn;

    private Integer wordtest;

    private Integer wrongtesttimes;

    public Integer getUserWordId() {
        return userWordId;
    }

    public void setUserWordId(Integer userWordId) {
        this.userWordId = userWordId;
    }

    public Integer getTopic() {
        return topic;
    }

    public void setTopic(Integer topic) {
        this.topic = topic;
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

    public Integer getWordlearn() {
        return wordlearn;
    }

    public void setWordlearn(Integer wordlearn) {
        this.wordlearn = wordlearn;
    }

    public Integer getWordtest() {
        return wordtest;
    }

    public void setWordtest(Integer wordtest) {
        this.wordtest = wordtest;
    }

    public Integer getWrongtesttimes() {
        return wrongtesttimes;
    }

    public void setWrongtesttimes(Integer wrongtesttimes) {
        this.wrongtesttimes = wrongtesttimes;
    }
}