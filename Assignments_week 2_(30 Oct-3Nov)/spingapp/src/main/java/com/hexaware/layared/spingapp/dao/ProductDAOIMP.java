package com.hexaware.layared.spingapp.dao;

import org.springframework.stereotype.Repository;

import com.hexaware.layared.spingapp.bean.Product;

@Repository
public class ProductDAOIMP implements IProductDAO {

	@Override
	public Product getproduct() {
		// any DB connectivity logic jdbc,hibernate,jpa....//
		return new Product(101,"mobile",4500);
	}

}
