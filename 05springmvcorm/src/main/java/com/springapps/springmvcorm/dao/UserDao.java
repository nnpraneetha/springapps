package com.springapps.springmvcorm.dao;

import java.util.List;

import com.springapps.springmvcorm.entity.User;

public interface UserDao {

	int create (User user);

	List<User> findUsers();
}
