package com.aaa.service;

import com.aaa.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@FeignClient("BOOK-PROVIDER")
public interface ISpringCloudService {


    @RequestMapping("/all")
    List<User> selectAllBooks ();



}
