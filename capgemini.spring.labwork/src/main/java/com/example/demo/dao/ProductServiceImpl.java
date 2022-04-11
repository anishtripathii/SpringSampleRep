package com.example.demo.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
@Autowired
ProductRepository prodrepos;
	
	@Override
	public List<Product> getAllProducts() {
		return prodrepos.findAll();
	}

	@Override
	public double getProductPrice(String prodName) {
		
		if(prodrepos.prodExists(prodName)) {
			return prodrepos.getProductPrice(prodName);
		}
		
		return 0;
	}

	@Override
	public Product enterProduct(Product prod) {
		// TODO Auto-generated method stub
		return prodrepos.save(prod);
	}

	@Override
	public int getProductId(String prodName) {
		
		return prodrepos.getProductId(prodName);
	}


}
