package com.yuantongchn.dao;

import com.yuantongchn.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
    //根据ID查询用户
    User getUserById(int id);
    //insert一个用户
    int addUser(User user);
}
