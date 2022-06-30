package com.springapps.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.ecommerce.dao.ProductsDao;
import com.springapps.ecommerce.entity.Products;
import com.springapps.ecommerce.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsDao productsDao;
	
	@Override
	public List<Products> getProducts() {
		
		return productsDao.findProducts();
	}

}
