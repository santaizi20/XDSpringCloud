package com.xd.service;

import com.xd.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectByName(String aa);
}