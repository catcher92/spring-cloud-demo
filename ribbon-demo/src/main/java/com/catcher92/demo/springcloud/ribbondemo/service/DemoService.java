package com.catcher92.demo.springcloud.ribbondemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHello(String name) {
        return restTemplate.getForObject("http://eureka-client-1/hello?name=" + name, String.class);
    }
}
