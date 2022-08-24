package com.samples.SpringORM.Dao;

import java.util.List;

import com.samples.SpringORM.entity.Product;

public interface ProductDao {
	
	int create(Product product);
	
	void update(Product product);
	
	void delete(Product product);
	
	Product find(int id);
	
	List<Product> findAll();

}
