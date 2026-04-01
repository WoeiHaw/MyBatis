package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.SqlMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.*;
import java.util.List;

public class SqlMapperTest {

    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper sqlMapper = sqlSession.getMapper(SqlMapper.class);
        List<User>  list = sqlMapper.getUserByLike("a");

        System.out.println(list);
    }

    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper sqlMapper = sqlSession.getMapper(SqlMapper.class);
       int result =  sqlMapper.deleteMore("1,2,3");
        System.out.println(result);

    }

    @Test
    public void testGetUserByTableName(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper sqlMapper = sqlSession.getMapper(SqlMapper.class);
        List<User> users = sqlMapper.getUserByTableName("t_user");
        System.out.println(users);

    }

    @Test
    public void testJdbc() throws Exception {
        Class.forName("");
        Connection connection = DriverManager.getConnection("","","");
        PreparedStatement ps = connection.prepareStatement("insert", Statement.RETURN_GENERATED_KEYS);
        ps.executeUpdate();
        ResultSet resultSet = ps.getGeneratedKeys();
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper sqlMapper = sqlSession.getMapper(SqlMapper.class);
        User user = new User(null,"王五","123",23,"男","123@163.com");
        sqlMapper.insertUser(user);
        System.out.println(user);

    }
}
