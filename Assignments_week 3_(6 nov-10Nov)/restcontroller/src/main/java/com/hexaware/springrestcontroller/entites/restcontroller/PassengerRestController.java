package com.hexaware.springrestcontroller.entites.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestcontroller.entites.Passenger;
import com.hexaware.springrestcontroller.service.IPassengerService;

@RestController
@RequestMapping("/api/passengers")
public class PassengerRestController {
	
	@Autowired
	IPassengerService service;
	
	@PostMapping("/add")
	public Passenger insertPassenger(Passenger passenger) {
		return service.insertPassenger(passenger);
		
	}

	@DeleteMapping("/delete/{passengerId}")
	public String deleteById(@PathVariable Integer passengerId) {
		
		service.deletePassenger(passengerId);
		return "record deleted";
		
	}
	
	@GetMapping(value="/update/{passengerId}")
	public Passenger addEmployee(@PathVariable Integer passengerId)
	{
		return service.getByPassengerId(passengerId);
		
	}
	
	@GetMapping(value="/getall",produces="application/json")
	public List<Passenger>getAll()
	{
		return service.getAllPassenger();
		
	}

}
