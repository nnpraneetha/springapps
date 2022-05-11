package com.springapps.sportshoes.service;

import java.util.List;

import com.springapps.sportshoes.entity.User;

public interface UserService {

	List<User> getUsers();
	void update(User user);
	User findByName(String username);
	void save(User user);
//	User findByNameAndPassword(String username,String password);
}
