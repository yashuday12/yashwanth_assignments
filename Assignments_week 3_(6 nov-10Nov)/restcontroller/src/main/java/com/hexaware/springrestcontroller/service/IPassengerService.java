package com.hexaware.springrestcontroller.service;

import java.util.List;


import com.hexaware.springrestcontroller.entites.Passenger;

public interface IPassengerService {

	public Passenger insertPassenger(Passenger passenger);
	public Passenger updatePassenger(Passenger passenger);
	public void deletePassenger(int passengerId);
	public Passenger getByPassengerId(int passengerId);
	public List<Passenger> getAllPassenger();
	
}
