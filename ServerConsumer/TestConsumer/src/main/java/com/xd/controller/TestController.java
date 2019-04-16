package com.xd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/info")
    public String getInfo() {
        return this.restTemplate.getForEntity("http://UserService/info", String.class).getBody();
    }
    
    @GetMapping("/aaa")
    public String test1() {
    	return this.restTemplate.getForEntity("http://UserService/hello", String.class).getBody();
    }
}
