package com.catcher92.demo.springcloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello " + name + ", I am from port " + port;
    }
}
