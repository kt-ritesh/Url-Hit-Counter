package com.ritesh.URLHit_Counter.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String userName;
    private int hitCount = 0;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}
