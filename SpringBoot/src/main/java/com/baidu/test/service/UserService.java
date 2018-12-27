package com.baidu.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baidu.test.entity.User;
import com.baidu.test.mapper.UserMapper;

@Service
@Transactional
public class UserService {	
	@Autowired
	private UserMapper mapper;
	
	public List<User> findAll(){
		System.out.println("≤‚ ‘+++++");
		return mapper.findAll();
	}
	
	public User select(Integer id){
		return mapper.selectById(id);
	}
}
