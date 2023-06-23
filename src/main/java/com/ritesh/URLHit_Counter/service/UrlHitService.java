package com.ritesh.URLHit_Counter.service;

import com.ritesh.URLHit_Counter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {
    @Autowired
    User user;

    public User CountHit(String useName){
        user.setUserName(useName);
        int count=user.getHitCount();

        user.setHitCount(++count);

        return user;
    }
}
