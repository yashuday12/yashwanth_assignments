package com.hexaware.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.hexaware.springsecurity.entity.UserEntity;
import com.hexaware.springsecurity.repository.UserRepository;

public class MyUserDetailsService implements UserDetailsService {

	@Autowired 
	UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserEntity user= repo.findByUserName(username);
		if(user==null) {
			
		}
		return null;
	}

	
}
