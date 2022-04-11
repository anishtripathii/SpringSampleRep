package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProductServiceImpl;
import com.example.demo.model.Product;

@RestController
public class ProductController {
@Autowired
ProductServiceImpl psi;

@GetMapping(path= "/getAllProducts")
public List<Product> getAllProducts(){
	return psi.getAllProducts();
}

@GetMapping(path= "/getProductPrice/{prodName}")
public String getProductPrice(@PathVariable String prodName) {
	if(psi.getProductPrice(prodName)!=0.0) {
		
	
	return String.valueOf(psi.getProductPrice(prodName));
	}
	else {
		return "Product not found";
	}
}

@PostMapping(path= "/addProduct")
public Product addProduct(@RequestBody Product prod) {
	return psi.enterProduct(prod);
}
@GetMapping(path="/getProductId/{prodName}")
public int getProductId(@PathVariable String prodName) {
	return psi.getProductId(prodName);
}
}
