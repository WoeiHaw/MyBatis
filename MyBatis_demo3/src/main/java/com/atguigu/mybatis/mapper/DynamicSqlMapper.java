package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSqlMapper {

    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    int deleteMoreByArray(@Param("eids") Integer[] eids);

    int insertMoreByList(@Param("emps")List<Emp> emps);
}
