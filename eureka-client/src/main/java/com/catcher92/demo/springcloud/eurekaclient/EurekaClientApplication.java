package com.catcher92.demo.springcloud.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(String name) {
		return "Hello " + name + ", I am from port " + port;
	}
}
