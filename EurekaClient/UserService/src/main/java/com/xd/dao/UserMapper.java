package com.xd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xd.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    @Select("select * from user where name=#{aa}")
    List<User> selectByName(String aa);
}