package com.hexaware.springrestcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hexaware.springrestcontroller.entites.Passenger;

@Repository
public interface IPassengerRepository extends JpaRepository<Passenger ,Integer>{

	
	
	
}
