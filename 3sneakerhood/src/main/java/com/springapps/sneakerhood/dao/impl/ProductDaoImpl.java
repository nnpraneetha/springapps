package com.springapps.sneakerhood.dao.impl;

import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.sneakerhood.dao.ProductDao;
import com.springapps.sneakerhood.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	private JdbcTemplate jdbcTemp;
	
	@Override
	public List<Product> findProducts() {
		
		return hibernateTemplate.loadAll(Product.class);
	}


	


	
}
