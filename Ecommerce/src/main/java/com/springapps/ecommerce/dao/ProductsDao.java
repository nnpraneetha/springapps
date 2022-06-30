package com.springapps.ecommerce.dao;

import java.util.List;

import com.springapps.ecommerce.entity.Products;



public interface ProductsDao {

	List<Products> findProducts();
}
