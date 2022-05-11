package com.springapps.sportshoes.dao;

import java.util.List;

import com.springapps.sportshoes.entity.User;

public interface UserDao {
 List<User> findUsers();
 void update(User user);
 User findByName(String username);
 void create(User user);
// User findByNameAndPassword(String username,String password);
}
