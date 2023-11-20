package com.hexaware.passengerapi.services;

import java.util.List;

import com.hexaware.passengerapi.dto.PassngerDto;
import com.hexaware.passengerapi.entites.Passenger;

public interface IPassengerService {
	public  Passenger addPassenger(PassngerDto passengerDto);
	public Passenger getPassengerById(int passengerId);
	public List<Passenger> getAllPassenger();
	

}
