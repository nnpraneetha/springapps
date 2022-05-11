package com.springapps.sportshoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.sportshoes.dao.UserDao;
import com.springapps.sportshoes.entity.User;
import com.springapps.sportshoes.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUsers() {
		List<User> users=userDao.findUsers();
		return users;
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User findByName(String username) {
		User user = userDao.findByName(username);
		return user;
		
	}

	@Override
	public void save(User user) {
		userDao.create(user);
	}

//	@Override
//	public User findByNameAndPassword(String username, String password) {
//		User user = userDao.findByNameAndPassword(username,password);
//		return user;
//	}
	

}
