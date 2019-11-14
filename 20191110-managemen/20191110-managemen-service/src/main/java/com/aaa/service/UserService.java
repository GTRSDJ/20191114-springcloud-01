package com.aaa.service;

import com.aaa.mapper.UserMapper;
import com.aaa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public List<User> selectAll() {
        return userMapper.selectAll();
    }

}
