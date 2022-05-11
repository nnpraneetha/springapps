package com.springapps.sportshoes.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.sportshoes.dao.CartDao;
import com.springapps.sportshoes.entity.Cart;


@Repository
public class CartDaoImpl implements CartDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;


	@Override
	@Transactional
	public int create(Cart cart) {
		return (int) hibernateTemplate.save(cart);
	}


	@Override
	public List<Cart> findCart() {
		return hibernateTemplate.loadAll(Cart.class);
	}


	@Override
	public void delete(Cart cart) {
		 hibernateTemplate.delete(cart);
		
	}

	


	


	
}
