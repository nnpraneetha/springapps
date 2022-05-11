package com.springapps.sportshoes.dao;

import java.util.List;

import com.springapps.sportshoes.entity.Order;



public interface OrderDao {

	List<Order> findOrders();
	void create(Order order);
}
