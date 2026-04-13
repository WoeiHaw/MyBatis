package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;

import java.util.List;

public interface DynamicSqlMapper {

    List<Emp> getEmpByCondition(Emp emp);
}
