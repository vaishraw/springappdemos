package com.samples.springmvcorm.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.springmvcorm.dao.UserDao;
import com.samples.springmvcorm.entity.User;
import com.samples.springmvcorm.service.UserService;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userdao;

	@Override
	@Transactional
	public int save(User user) {
		
		return userdao.create(user);
	}

}
