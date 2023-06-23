package com.ritesh.URLHit_Counter.controller;

import com.ritesh.URLHit_Counter.model.User;
import com.ritesh.URLHit_Counter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlHitController {
    @Autowired
    UrlHitService urlHitService;

    @RequestMapping(value = "/user/{userName}" , method = RequestMethod.GET)
    public String UrlHit(@PathVariable String userName){
        return urlHitService.CountHit(userName);
    }
}
