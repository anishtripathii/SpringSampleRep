package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public double getProductPrice(String prodName);
	public Product enterProduct(Product prod);
	public int getProductId(String prodName);
	
}
