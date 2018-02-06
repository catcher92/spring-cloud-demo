package com.catcher92.demo.springcloud.ribbondemo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemoService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayHelloFallback")
    public String sayHello(String name) {
        return restTemplate.getForObject("http://eureka-client-1/hello?name=" + name, String.class);
    }

    public String sayHelloFallback(String name) {
        return "hi " + name + ",there is some error!";
    }
}
