package com.hexaware.springboot5.Dao;

import java.util.List;

import com.hexaware.springboot5.model.Admin;

public interface IAdminDao {
	public int InsertDeatils(Admin admin);
	public List<Admin> getAll(Admin admin);

	

}
