package com.samples.userdetails.dao;

import com.samples.userdetails.entity.User;

public interface UserDao {
	
	int create(User user);
	
	void update(User user);
	
	User find(int id);

}
