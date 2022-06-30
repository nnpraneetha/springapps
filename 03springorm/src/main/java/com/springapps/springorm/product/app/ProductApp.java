package com.springapps.springorm.product.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springapps.springorm.product.dao.ProductDao;
import com.springapps.springorm.product.entity.Product;

public class ProductApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springapps/springorm/product/config/config.xml");
		ProductDao productdao = (ProductDao) context.getBean("productDaoImpl");
//		createProduct(productdao);
//		updateProduct(productdao);
//		deleteProduct(productdao);
//		createProduct(productdao, 1, "headphones", "noise cancelling", 250);
//		createProduct(productdao, 2, "smartphone", "Android phone", 8000);
//		createProduct(productdao, 3, "smartwatch", "big display", 15000);
//		findProduct(productdao,2);		
		findAllProducts(productdao);
	}

	private static void findAllProducts(ProductDao productdao) {
		List<Product> products = productdao.findall();
		System.out.println(products);
	}

	private static void findProduct(ProductDao productdao, int id) {
		Product product = productdao.find(id);
		System.out.println(product);

	}

	private static void updateProduct(ProductDao productdao) {
		Product pro = new Product();
		pro.setId(1);
		pro.setName("iphone");
		pro.setDescription("phone");
		pro.setPrice(27384);
		productdao.update(pro);
		System.out.println("row updated ");

	}

	private static void deleteProduct(ProductDao productdao) {

		Product pro = new Product();
		pro.setId(1);
		productdao.delete(pro);
		System.out.println("deleted");
	}

	private static void createProduct(ProductDao productdao, int id, String name, String desc, double price) {

		Product pro = new Product();
		pro.setId(id);
		pro.setName(name);
		pro.setDescription(desc);
		pro.setPrice(price);
		int result = productdao.create(pro);
		System.out.println("row created =" + result);

	}
}
