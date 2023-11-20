package com.example.restcrud2.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restcrud2.entities.UserInfo;
@Repository
public interface UserRepository extends JpaRepository<UserInfo,Integer> {
	 Optional<UserInfo> findByName(String username);
}
