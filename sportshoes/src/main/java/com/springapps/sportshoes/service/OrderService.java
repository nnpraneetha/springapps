package com.springapps.sportshoes.service;

import java.util.List;

import com.springapps.sportshoes.entity.Order;

public interface OrderService {

	List<Order> getOrders();
	void save(Order order);
	
}
