package com.springapps.springmvcorm.service;

import java.util.List;

import com.springapps.springmvcorm.entity.User;

public interface UserService {

	int save(User user);

	List<User> getUsers();
}
