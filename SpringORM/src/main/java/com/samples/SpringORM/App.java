package com.samples.SpringORM;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.SpringORM.Dao.ProductDao;
import com.samples.SpringORM.entity.Product;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/SpringORM/SpringConfig.xml");

		ProductDao productDAO = (ProductDao) springContainer.getBean("productdao");

		//create(productDAO);
		//update(productDAO);
		//delete(productDAO);
		//find(productDAO,1);
		findall(productDAO);
	}

	private static void findall(ProductDao productDAO) {
		List<Product> products=productDAO.findAll();
		System.out.println(products);
		
	}

	private static void find(ProductDao productDAO, int id) {
		Product product=productDAO.find(id);
		System.out.println(product);
		
	}

	private static void delete(ProductDao productDAO) {
		Product product = new Product();
		product.setId(1);
		product.setName("Furniture");
		product.setDescription("rose wood");
		product.setPrice(5500);

		productDAO.delete(product);
		
	}

	private static void update(ProductDao productDAO) {
		Product product = new Product();
		product.setId(1);
		product.setName("Furniture");
		product.setDescription("rose wood");
		product.setPrice(5500);

		productDAO.update(product);
		
	}

	private static void create(ProductDao productDAO) {
		Product product = new Product();
		product.setId(2);
		product.setName("Phone");
		product.setDescription("Samsung Phone");
		product.setPrice(12500);

		productDAO.create(product);
	}
}
