package com.springapps.sportshoes.dao.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springapps.sportshoes.dao.ProductDao;
import com.springapps.sportshoes.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	@Override
	public List<Product> findProducts() {
		
		return hibernateTemplate.loadAll(Product.class);
	}


	@Override
	@Transactional
	public int create(Product product) {
		return (int) hibernateTemplate.save(product);
	
	}


	@Override
	public void delete(Product product) {
		hibernateTemplate.delete(product);
		
	}




	


	
}
