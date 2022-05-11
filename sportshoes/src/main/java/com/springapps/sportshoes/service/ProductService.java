package com.springapps.sportshoes.service;

import java.util.List;

import com.springapps.sportshoes.entity.Product;

public interface ProductService {

	int save(Product product);
	List<Product> getProducts();
	void delete(Product product);
	
}
