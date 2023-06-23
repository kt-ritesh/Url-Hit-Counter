package com.ritesh.URLHit_Counter.service;

import com.ritesh.URLHit_Counter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService {
    @Autowired
    User user;

    Map<String, Integer> map = new HashMap<>();
    public String CountHit(String name){
        Integer tmp = map.get(name);
        if(tmp == null){
            map.put(name,1);
            return name+" "+map.get(name);
        }
        map.put(name, tmp+1);
        return name+" "+map.get(name);
    }
}
