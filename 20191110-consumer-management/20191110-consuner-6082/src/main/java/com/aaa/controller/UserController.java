package com.aaa.controller;

import com.aaa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.awt.print.Book;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;


   @RequestMapping("/all")
    public String selectAllUser( ){

       restTemplate.getForObject("http://localhost:8081", List.class);
       System.out.println(restTemplate.getForObject("http://localhost:8081", List.class));

       return null;

   }



}
