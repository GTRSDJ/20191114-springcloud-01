package com.aaa.controller;

import com.aaa.model.User;
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
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @RequestMapping("/all")
    public List<User> selectAllBooks() {

        return restTemplate.getForObject("http://BOOK-PROVIDER/all", List.class);
    }

    @GetMapping("/allB")
    public List<User> selectUserLoadBalance(){
        ServiceInstance choose = loadBalancerClient.choose("book-provider");
        String host = choose.getHost();
        System.out.println("kkkkkkkkkkkkkk"+host);
        int port = choose.getPort();

        return  restTemplate.getForObject("http://"+host+":"+port+"/all", List.class);

    }



}
