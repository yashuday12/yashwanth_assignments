package com.hexaware.springboot5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot5.model.Admin;
import com.hexaware.springboot5.service.AdminServices;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminServices service;

	@RequestMapping(path = "/openform", method = RequestMethod.GET)
	public String openForm() {

		return "admin";
	}
	
	@RequestMapping(path = "/add", method = RequestMethod.POST)
	 @ResponseBody 
	 public String Admindetails(@RequestParam int adminId,@RequestParam String adminName,@RequestParam int adminAge ) {
	 
	 Admin admin = new Admin(adminId, adminName, adminAge);
	 
	 	 int a=service.InsertDeatils(admin);
	 
	 return "<h1 style ='color:green'>"+admin.toString()+"<h1>";
	}
	@RequestMapping(path = "/getall", method = RequestMethod.GET)
	@ResponseBody
	public List<Admin>  getAll(@RequestParam int adminId,@RequestParam String adminName,@RequestParam int adminAge) {
		Admin admin = new Admin(adminId, adminName, adminAge);
		List<Admin> list=service.getAll(admin);
		return list;
		
		
		
	}	
}