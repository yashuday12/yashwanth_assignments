package com.hexaware.flightbookingdemo.service;

import java.util.List;

import com.hexaware.flightbookingdemo.entity.Passenger;



public interface IPassengerService {
	public int insertPassengerDetails(Passenger passenger);
	public int deletePassengerDetails(Passenger passenger);
	public int updatePassengerDetails(Passenger passenger);
	public Passenger getPassengerDetailsById(int passengerId);
	public List<Passenger> getAllPassengerDetails();

}
