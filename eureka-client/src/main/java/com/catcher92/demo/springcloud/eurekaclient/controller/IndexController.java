package com.catcher92.demo.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private Environment environment;

    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello " + name + ", I am from port " + environment.getProperty("server.port");
    }
}
