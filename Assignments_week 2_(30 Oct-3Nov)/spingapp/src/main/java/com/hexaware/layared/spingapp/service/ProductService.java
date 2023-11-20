package com.hexaware.layared.spingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.layared.spingapp.bean.Product;
import com.hexaware.layared.spingapp.dao.IProductDAO;
@Service
public class ProductService implements IProductService {
	@Autowired
	IProductDAO dao;

	@Override
	public Product getProduct() {
		// Bussiness logics and Input validations
		// we call dao methods 
		
		return dao.getproduct();
	}

}
