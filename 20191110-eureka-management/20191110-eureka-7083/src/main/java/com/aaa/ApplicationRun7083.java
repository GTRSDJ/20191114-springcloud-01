package com.aaa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7083 {


    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7083.class,args);
    }


}
