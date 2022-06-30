package com.springapps.sneakerhood.dao;

import java.sql.Blob;
import java.util.List;

import com.springapps.sneakerhood.entity.Product;

public interface ProductDao {

	List<Product> findProducts();

}
