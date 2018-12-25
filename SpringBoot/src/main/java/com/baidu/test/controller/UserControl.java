package com.baidu.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.test.entity.User;
import com.baidu.test.service.UserService;

@RestController
public class UserControl {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/findAll")
	public List<User> findAll(){
		return userService.findAll();
	}
}
