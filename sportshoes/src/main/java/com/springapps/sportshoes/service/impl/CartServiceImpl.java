package com.springapps.sportshoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.sportshoes.dao.CartDao;
import com.springapps.sportshoes.entity.Cart;
import com.springapps.sportshoes.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;

	@Override
	@Transactional
	public int save(Cart cart) {
		 return	cartDao.create(cart);
	}

	@Override
	public List<Cart> getCart() {
		List<Cart> cart=cartDao.findCart();
		return cart;
	}

	@Override
	@Transactional
	public void delete(Cart cart) {
		cartDao.delete(cart);
		
	}

	

	

	
	
	
}
