package com.catcher92.demo.springcloud.bootadminserver;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class BootAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootAdminServerApplication.class, args);
    }
}
