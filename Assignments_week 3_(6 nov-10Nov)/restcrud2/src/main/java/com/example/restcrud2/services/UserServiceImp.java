package com.example.restcrud2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.restcrud2.entities.UserInfo;
import com.example.restcrud2.repository.UserRepository;
@Service
public class UserServiceImp implements IUserService {
	    @Autowired
	    private UserRepository repository;

	    @Autowired
	    private PasswordEncoder passwordEncoder;
		
	@Override
	public String addUser(UserInfo userInfo) {
		// TODO Auto-generated method stub
		userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "user added to system ";
	}

}
