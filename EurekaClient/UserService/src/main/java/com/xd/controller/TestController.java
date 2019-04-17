package com.xd.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xd.entity.User;
import com.xd.service.UserService;

@RestController
@RequestMapping("user")
public class TestController {
	@Resource
	UserService userService;

	@RequestMapping("showname/{name}")
	public List<User> getUserByName(@PathVariable("name") String name) {
		return userService.selectByName(name);
	}

	@RequestMapping("test")
	public String test() {
		return "hello";
	}
}
