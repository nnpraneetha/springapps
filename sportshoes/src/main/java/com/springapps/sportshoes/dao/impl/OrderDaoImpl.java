package com.springapps.sportshoes.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.sportshoes.dao.OrderDao;
import com.springapps.sportshoes.entity.Order;

@Repository
public class OrderDaoImpl implements OrderDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Order> findOrders() {
		
		return hibernateTemplate.loadAll(Order.class);
	}

	@Override
	@Transactional
	public void create(Order order) {
		 hibernateTemplate.save(order);
	}

	
}
