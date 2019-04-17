package com.xd.service.impl;

import com.xd.dao.UserMapper;
import com.xd.entity.User;
import com.xd.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public List<User> selectByName(String aa) {
        return userMapper.selectByName(aa);
    }

  
}