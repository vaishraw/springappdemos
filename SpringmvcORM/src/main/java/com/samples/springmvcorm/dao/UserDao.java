package com.samples.springmvcorm.dao;

import java.util.List;

import com.samples.springmvcorm.entity.User;

public interface UserDao {
	
	 int create(User user);
	 
	 List<User> findUsers();

}
