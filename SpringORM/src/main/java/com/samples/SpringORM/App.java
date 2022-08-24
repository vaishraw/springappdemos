package com.samples.SpringORM;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.SpringORM.Dao.ProductDao;
import com.samples.SpringORM.entity.Product;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/SpringORM/SpringConfig.xml");

		ProductDao productDAO = (ProductDao) springContainer.getBean("productdao");

		Product product = new Product();
		product.setId(1);
		product.setName("Furniture");
		product.setDescription("rose wood");
		product.setPrice(10000);

		productDAO.create(product);
	}
}
