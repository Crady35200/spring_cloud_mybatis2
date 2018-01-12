package com.crady.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crady.bean.User;
import com.crady.dao.UserMapper;
import com.crady.service.UserService;

/**
description:
2017年12月18日 下午10:31:04
author: crady
**/
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<User> listAll() {
		return userMapper.selectByExample(null);
	}

	@Override
	public List<User> queryUsers(User user) {
		return null;
	}

}
