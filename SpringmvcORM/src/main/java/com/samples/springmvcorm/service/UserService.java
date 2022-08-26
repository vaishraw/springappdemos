package com.samples.springmvcorm.service;

import java.util.List;

import com.samples.springmvcorm.entity.User;

public interface UserService {
	
	int save(User user);
	
	List<User> getusers();

}
