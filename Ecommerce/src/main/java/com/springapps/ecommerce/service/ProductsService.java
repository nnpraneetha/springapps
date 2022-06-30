package com.springapps.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springapps.ecommerce.entity.Products;


public interface ProductsService {

	List<Products> getProducts();
}
