package com.yuantongchn.dao;

import com.yuantongchn.pojo.User;
import com.yuantongchn.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void getUserList() {
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //执行SQL
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();

        for(User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSeession
        sqlSession.close();
    }

    @Test
    public void getUserById() {
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //执行SQL
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUserById(2);

        System.out.println(user);

        //关闭SqlSeession
        sqlSession.close();
    }

    @Test
    public void addUser() {
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //执行SQL
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int res = userMapper.addUser(new User(5, "李治", "123456"));

        if (res > 0) {
            System.out.println("插入成功");
        }

        //关闭SqlSeession
        sqlSession.commit();//提交事务，增删改需要
        sqlSession.close();
    }
}


























