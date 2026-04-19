package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DynamicSqlMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicSQLMapperTest {

    @Test
    public void  testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> list = mapper.getEmpByCondition(new Emp(null,"张三",23,null,null));
        System.out.println(list);
    }

    @Test
    public  void testGestEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> list = mapper.getEmpByChoose(new Emp(null,"张三",23,"男","123@qq.com"));
        System.out.println(list);
    }

    @Test
    public  void testDeleteMoreByArray(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        int result = mapper.deleteMoreByArray(new Integer[]{6,7,8});
        System.out.println(result);
    }

    @Test
    public  void testInserMoreByList(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        Emp emp1 = new Emp(null,"a",23,"男","123@qq.com");
        Emp emp2 = new Emp(null,"a",23,"男","123@qq.com");
        Emp emp3 = new Emp(null,"a",23,"男","123@qq.com");
        List<Emp> list = Arrays.asList(emp1,emp2,emp3);
        System.out.println(mapper.insertMoreByList(list));


    }
}
