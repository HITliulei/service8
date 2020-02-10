package com.test.service8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Service8Application {

    public static void main(String[] args) {
        SpringApplication.run(Service8Application.class, args);
    }

}
