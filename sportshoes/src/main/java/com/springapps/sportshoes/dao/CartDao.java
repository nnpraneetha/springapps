package com.springapps.sportshoes.dao;


import java.util.List;

import com.springapps.sportshoes.entity.Cart;


public interface CartDao {

	int create(Cart cart);
	 List<Cart> findCart();
	 void delete(Cart cart);


}
