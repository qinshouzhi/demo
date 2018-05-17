package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@Autowired
	BeanInject bean;
	
	@Autowired
	RedisSettings  redis;
	
	@Autowired
	MyConfig config;
	
    @RequestMapping("/hello")
    String home() {
    	System.out.println("==bean===:"+bean.getAnother());
    	System.out.println("==redis==:"+redis.getHost());
    	System.out.println("==config==:"+config.getServers().get(0));
        return "Hello World!";
    }
}