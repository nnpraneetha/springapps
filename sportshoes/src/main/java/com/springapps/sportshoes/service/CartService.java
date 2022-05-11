package com.springapps.sportshoes.service;

import java.util.List;

import com.springapps.sportshoes.entity.Cart;

public interface CartService {

	int save(Cart cart);
	List<Cart> getCart();
	void delete(Cart cart);
	
}
