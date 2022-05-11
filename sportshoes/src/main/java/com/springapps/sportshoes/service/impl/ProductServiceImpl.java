package com.springapps.sportshoes.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.sportshoes.dao.ProductDao;
import com.springapps.sportshoes.entity.Product;
import com.springapps.sportshoes.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	

	@Override
	public List<Product> getProducts() {
		List<Product> products=productDao.findProducts();
		return products;
	}



	@Override
	@Transactional
	public int save(Product product) {
	 return	productDao.create(product);
		
	}



	@Override
	@Transactional
	public void delete(Product product) {
		productDao.delete(product);
		
	}

	

	

	
	
	
}
