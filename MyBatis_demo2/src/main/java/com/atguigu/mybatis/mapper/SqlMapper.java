package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SqlMapper {

    List<User> getUserByLike(@Param("username") String username);

    int deleteMore(@Param("ids") String ids);

    List<User> getUserByTableName(@Param("tableName") String tableNem);

    void insertUser(User user);
}
