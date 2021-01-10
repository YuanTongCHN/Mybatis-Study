package com.yuantongchn.dao;

import com.yuantongchn.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void taet() {
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL
        sqlSession.getMapper(UserDao.class);
    }
}
