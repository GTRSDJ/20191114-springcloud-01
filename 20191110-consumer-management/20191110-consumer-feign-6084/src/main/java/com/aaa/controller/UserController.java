package com.aaa.controller;

import com.aaa.model.User;
import com.aaa.service.ISpringCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private ISpringCloudService springCloudService;


    @RequestMapping("/all")
    public List<User> selectAllBooks() {

        return springCloudService.selectAllBooks();
    }



}
