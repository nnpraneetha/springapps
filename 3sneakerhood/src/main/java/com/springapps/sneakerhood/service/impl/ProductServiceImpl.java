package com.springapps.sneakerhood.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.sneakerhood.dao.ProductDao;
import com.springapps.sneakerhood.entity.Product;
import com.springapps.sneakerhood.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao userDao;

	

	@Override
	public List<Product> getProducts() {
		List<Product> products=userDao.findProducts();
		return products;
	}



	
	
	
}
