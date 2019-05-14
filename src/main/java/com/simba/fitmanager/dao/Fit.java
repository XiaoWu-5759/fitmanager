package com.simba.fitmanager.dao;

import java.util.Date;

public class Fit {
    private Long fitId;

    private String fitNum;

    private String state;

    private Date creacteTime;

    private Date activeTime;

    public Long getFitId() {
        return fitId;
    }

    public void setFitId(Long fitId) {
        this.fitId = fitId;
    }

    public String getFitNum() {
        return fitNum;
    }

    public void setFitNum(String fitNum) {
        this.fitNum = fitNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreacteTime() {
        return creacteTime;
    }

    public void setCreacteTime(Date creacteTime) {
        this.creacteTime = creacteTime;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    @Override
    public String toString() {
        return "Fit{" +
                "fitId=" + fitId +
                ", fitNum='" + fitNum + '\'' +
                ", state='" + state + '\'' +
                ", creacteTime=" + creacteTime +
                ", activeTime=" + activeTime +
                '}';
    }
}