package com.aaa.mapper;

import com.aaa.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User user);

     User selectByPrimaryKey(String id);

    List<User> selectAll();

    int updateByPrimaryKey(User user);
}