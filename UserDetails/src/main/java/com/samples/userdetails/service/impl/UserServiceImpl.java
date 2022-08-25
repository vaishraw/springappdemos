package com.samples.userdetails.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.userdetails.dao.UserDao;
import com.samples.userdetails.entity.User;
import com.samples.userdetails.service.UserService;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userdao;

	@Override
	@Transactional
	public int save(User user) {
		
		return userdao.create(user);
	}

	@Override
	@Transactional
	public void updation(User user) {
		userdao.update(user);
		
	}

	@Override
	@Transactional
	public User read(int id) {
		
		return userdao.find(id);
	}

}
