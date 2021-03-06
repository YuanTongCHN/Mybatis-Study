package com.yuantongchn.dao;

import com.yuantongchn.pojo.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
    //模糊查询
    List<User> getUserLike(String value);
    //根据ID查询用户
    User getUserById(int id);
    //insert一个用户
    int addUser(User user);
    //修改用户
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
}
