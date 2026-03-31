package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SqlMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SqlMapperTest {

    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper sqlMapper = sqlSession.getMapper(SqlMapper.class);
        List<User>  list = sqlMapper.getUserByLike("a");

        System.out.println(list);
    }
}
