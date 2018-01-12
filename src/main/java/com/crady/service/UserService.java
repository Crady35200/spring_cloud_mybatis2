package com.crady.service;

import java.util.List;

import com.crady.bean.User;

public interface UserService {

	public List<User> listAll();
	
	public List<User> queryUsers(User user);
}
