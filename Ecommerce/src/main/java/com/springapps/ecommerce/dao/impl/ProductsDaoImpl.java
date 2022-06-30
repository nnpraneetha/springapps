package com.springapps.ecommerce.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.ecommerce.dao.ProductsDao;
import com.springapps.ecommerce.entity.Products;

@Repository
public class ProductsDaoImpl implements ProductsDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Products> findProducts() {

		return hibernateTemplate.loadAll(Products.class);
	}

}
