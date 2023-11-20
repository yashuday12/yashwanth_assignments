package com.hexaware.springrestcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestcontroller.entites.Passenger;
import com.hexaware.springrestcontroller.repository.IPassengerRepository;
@Service
public class PassengerServiceImp implements IPassengerService {

	@Autowired
	IPassengerRepository repo;
	
	@Override
	public Passenger insertPassenger(Passenger passenger) {
		
		return repo.save(passenger);
	}

	@Override
	public Passenger updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return repo.save(passenger);
	}

	@Override
	public void deletePassenger(int passengerId) {
		// TODO Auto-generated method stub
		repo.deleteById(passengerId);
	}

	@Override
	public Passenger getByPassengerId(int passengerId) {
		// TODO Auto-generated method stub
		return repo.findById(passengerId).orElse(null);
	}

	@Override
	public List<Passenger> getAllPassenger() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
