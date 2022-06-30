package com.springapps.springdatajpa;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.springapps.springdatajpa.entity.Product;
import com.springapps.springdatajpa.repos.ProductRepository;

@SpringBootTest
class ApplicationTests {

	@Autowired
	ApplicationContext context;
//	@Test
	void saveProduct() {
		ProductRepository repo=context.getBean(ProductRepository.class);
		Product product1=new Product(2,"bat","cricket bat",500);
		Product product2=new Product(3,"ball","tennis ball",50);
		repo.save(product1);
		repo.save(product2);
		
	}
	
//	@Test
	void readProduct() {
		ProductRepository repo=context.getBean(ProductRepository.class);
		Optional<Product> optionalProduct=repo.findById(1);
		Product product=null;
		if(optionalProduct.isPresent()) {
			product=optionalProduct.get();
		}
		System.out.println(product);
	}
//	@Test
	void updateProduct() {
		ProductRepository repo=context.getBean(ProductRepository.class);
		Product product=new Product(3,"ball","tennis ball",70);
		repo.save(product);
	} 
//	@Test
	void readAllProducts() {
		ProductRepository repo=context.getBean(ProductRepository.class);
		List<Product> products=(List<Product>) repo.findAll();
		System.out.println(products);
	}
//	@Test
	void findByName() {
		ProductRepository repo=context.getBean(ProductRepository.class);
		List<Product> products=(List<Product>) repo.findByName("bat");
		System.out.println(products);
	}
//	@Test
	void findByPrice() {
		ProductRepository repo=context.getBean(ProductRepository.class);
		List<Product> products=(List<Product>) repo.findByPrice(70);
		System.out.println(products);
	}
//	@Test
	void findByNameAndPrice() {
		ProductRepository repo=context.getBean(ProductRepository.class);
		List<Product> products=(List<Product>) repo.findByNameAndPrice("ball",70d);
		System.out.println(products);
	}
	@Test
	void findByPriceGreaterThan() {
		ProductRepository repo=context.getBean(ProductRepository.class);
		List<Product> products=(List<Product>) repo.findByPriceGreaterThan(75);
		System.out.println(products);
	}
}
