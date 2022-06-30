package com.springapps.springdatajpa.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springapps.springdatajpa.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Integer> {

	List<Product> findByName(String name);
	List<Product> findByPrice(double price);
	List<Product> findByNameAndPrice(String name,double price);
	List<Product> findByPriceGreaterThan(double price);
}
