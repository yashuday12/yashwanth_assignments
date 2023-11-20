package com.hexaware.springboot5.service;



import java.util.List;

import com.hexaware.springboot5.model.Admin;

public interface IAdminServices {

	public int InsertDeatils(Admin admin);
	public List<Admin> getAll(Admin admin);
	
}
