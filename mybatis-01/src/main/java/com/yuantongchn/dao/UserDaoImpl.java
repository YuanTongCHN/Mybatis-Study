package com.yuantongchn.dao;

import com.yuantongchn.pojo.User;

import java.util.List;

public class UserDaoImpl implements UserDao{

    @Override
    public List<User> getUserList() {

        //执行SQL
        String sql = "select * from mybatis.user";
        //结果集

        return null;
    }
}
