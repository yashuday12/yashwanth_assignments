package com.example.restcrud2.admincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restcrud2.entities.UserInfo;
import com.example.restcrud2.services.IUserService;

@RestController
@RequestMapping("/api/user")
public class UserCintroller {
    @Autowired
    IUserService service;
	@PostMapping("/add")
	public String adduser(@RequestBody UserInfo userInfo ) {
		return service.addUser(userInfo);
	}
	
	
}
