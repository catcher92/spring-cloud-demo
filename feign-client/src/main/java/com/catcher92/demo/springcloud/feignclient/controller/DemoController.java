package com.catcher92.demo.springcloud.feignclient.controller;


import com.catcher92.demo.springcloud.feignclient.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/hello")
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
