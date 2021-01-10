package com.yuantongchn.dao;

import com.yuantongchn.pojo.User;
import com.yuantongchn.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //执行SQL
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();

        for(User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSeession
        sqlSession.close();
    }
}
