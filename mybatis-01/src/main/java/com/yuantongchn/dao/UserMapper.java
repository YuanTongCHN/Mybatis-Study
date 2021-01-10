package com.yuantongchn.dao;

import com.yuantongchn.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUserById(int id);
}
