package com.samples.userdetails.service;

import com.samples.userdetails.entity.User;

public interface UserService {
	int save(User user);
	
	void updation(User user);
	
	User read(int id);
}
