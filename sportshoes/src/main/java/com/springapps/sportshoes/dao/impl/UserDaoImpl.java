package com.springapps.sportshoes.dao.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.sportshoes.dao.UserDao;
import com.springapps.sportshoes.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	

	@Override
	public List<User> findUsers() {
		
		return hibernateTemplate.loadAll(User.class);
	}

	@Override
	@Transactional
	public void update(User user) {
		hibernateTemplate.update(user);
		
	}

	@Override
	public User findByName(String username) {
		User user  = (User) hibernateTemplate.get(User.class,username);
		return user;
	}

	@Override
	@Transactional
	public void create(User user) {
		hibernateTemplate.save(user);
		
	}

//	@Override
//	public User findByNameAndPassword(String username, String password) {
//		String query="from User u where u.username=? and u.password=?";
//		User user  = (User) hibernateTemplate.find(query,username,password);
//		return user;
//	}
}
