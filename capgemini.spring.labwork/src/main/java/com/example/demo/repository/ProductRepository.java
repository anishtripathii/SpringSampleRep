package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

	@Query(value="select prod_price from Product_table where prod_name=?1",nativeQuery=true)
	public double getProductPrice(String prodName);
	
	@Query(value="select prod_id from Product_table where prod_name=?1",nativeQuery=true)
	public int getProductId(String prodName);
	
	@Query(value="select exists(select 1 from Product_table where prod_name=?1)",nativeQuery=true)
	public boolean prodExists(String prodName);
}
