package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.DynamicSqlMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DynamicSQLMapperTest {

    @Test
    public void  testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        List<Emp> list = mapper.getEmpByCondition(new Emp(null,null,null,null,null));
        System.out.println(list);
    }
}
