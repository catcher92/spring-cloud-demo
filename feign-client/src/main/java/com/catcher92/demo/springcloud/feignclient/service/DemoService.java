package com.catcher92.demo.springcloud.feignclient.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient("eureka-client-1")
public interface DemoService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello(@RequestParam("name") String name);
}
