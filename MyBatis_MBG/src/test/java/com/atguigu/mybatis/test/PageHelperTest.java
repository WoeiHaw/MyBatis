package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class PageHelperTest {

    @Test
    public void testPageHelper(){
        try{
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);

            EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
//            Page<Object> page = PageHelper.startPage(2,4);
            PageHelper.startPage(2,4);

            List<Emp> list = empMapper.selectByExample(null);
            PageInfo<Emp> pageInfo = new PageInfo<>(list,5);
            list.forEach(System.out::println);
//            System.out.println(page);
            System.out.println(pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
