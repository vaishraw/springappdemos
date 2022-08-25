package com.samples.userdetails.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import com.samples.userdetails.dao.UserDao;
import com.samples.userdetails.entity.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int create(User user) {

		return (int) hibernateTemplate.save(user);
	}

	@Override
	public void update(User user) {
		hibernateTemplate.update(user);

	}

	@Override
	public User find(int id) {

		return hibernateTemplate.get(User.class, id);
	}

}
