package com.catcher92.demo.springcloud.feignclient.service.impl;

import com.catcher92.demo.springcloud.feignclient.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceFallbackImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hi " + name + ",there is some error!";
    }
}
