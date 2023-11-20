package com.hexaware.springboot5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springboot5.Dao.IAdminDao;
import com.hexaware.springboot5.model.Admin;
@Service
public class AdminServices implements IAdminServices{
	@Autowired
	IAdminDao dao;
	@Override
	public int InsertDeatils(Admin admin) {
		// TODO Auto-generated method stub
		return dao.InsertDeatils( admin);
	}
	@Override
	public List<Admin> getAll(Admin admin) {
		// TODO Auto-generated method stub
		return dao.getAll(admin);
	}

	

}
