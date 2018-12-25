package com.baidu.test.mapper;

import java.util.List;

import com.baidu.test.entity.User;

public interface UserMapper {
	public List<User> findAll();
	
	public User selectById(Integer id);
}
