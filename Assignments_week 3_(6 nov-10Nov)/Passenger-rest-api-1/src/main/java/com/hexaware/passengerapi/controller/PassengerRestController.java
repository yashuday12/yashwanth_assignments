package com.hexaware.passengerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.passengerapi.dto.PassngerDto;
import com.hexaware.passengerapi.entites.Passenger;
import com.hexaware.passengerapi.services.IPassengerService;

@RestController
@RequestMapping("/api/passenger")
public class PassengerRestController {
	@Autowired
	IPassengerService service;
	
	@PostMapping(value="add")
	public Passenger addPassenger(@RequestBody PassngerDto passengerDto) 
	{
		return service.addPassenger(passengerDto);
		
	}
	@GetMapping(value="/get/{passengerId}")
	public Passenger getPassengerById(@PathVariable int passengerId) {
		return service.getPassengerById(passengerId);
		
	}
	public List<Passenger> getAll(){
		return service.getAllPassenger();
		
	}

}
