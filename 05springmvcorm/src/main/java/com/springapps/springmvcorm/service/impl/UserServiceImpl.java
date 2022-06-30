package com.springapps.springmvcorm.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.springmvcorm.dao.UserDao;
import com.springapps.springmvcorm.entity.User;
import com.springapps.springmvcorm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public int save(User user) {
		
		return userDao.create(user);
	}

	@Override
	public List<User> getUsers() {
		List<User> users=userDao.findUsers();
		Collections.sort(users);
		return users;
	}
	
	
}
