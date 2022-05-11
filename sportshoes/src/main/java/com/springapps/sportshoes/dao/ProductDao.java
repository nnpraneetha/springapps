package com.springapps.sportshoes.dao;


import java.util.List;

import com.springapps.sportshoes.entity.Product;

public interface ProductDao {

	int create(Product product);
	
	List<Product> findProducts();
	void delete( Product product);

}
