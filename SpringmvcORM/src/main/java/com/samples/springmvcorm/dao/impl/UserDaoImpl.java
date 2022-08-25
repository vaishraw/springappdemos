package com.samples.springmvcorm.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.samples.springmvcorm.dao.UserDao;
import com.samples.springmvcorm.entity.User;

@Component
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int create(User user) {
		return (int) hibernateTemplate.save(user);
	}

}
