package com.springapps.sportshoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.sportshoes.dao.OrderDao;
import com.springapps.sportshoes.entity.Order;
import com.springapps.sportshoes.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	
	@Override
	public List<Order> getOrders() {
		List<Order> orders=orderDao.findOrders();
		return orders;
	}

	@Override
	@Transactional
	public void save(Order order) {
		orderDao.create(order);
		
	}

	
	

}
