package com.zlcook.iqas.ios.bean;

public class UserLearningStyle {
    private Integer userlearningstyleId;

    private Integer style1;

    private Integer style2;

    private Integer userId;

    public Integer getUserlearningstyleId() {
        return userlearningstyleId;
    }

    public void setUserlearningstyleId(Integer userlearningstyleId) {
        this.userlearningstyleId = userlearningstyleId;
    }

    public Integer getStyle1() {
        return style1;
    }

    public void setStyle1(Integer style1) {
        this.style1 = style1;
    }

    public Integer getStyle2() {
        return style2;
    }

    public void setStyle2(Integer style2) {
        this.style2 = style2;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

	@Override
	public String toString() {
		return "UserLearningStyle [userlearningstyleId=" + userlearningstyleId + ", style1=" + style1 + ", style2="
				+ style2 + ", userId=" + userId + "]";
	}
    
}