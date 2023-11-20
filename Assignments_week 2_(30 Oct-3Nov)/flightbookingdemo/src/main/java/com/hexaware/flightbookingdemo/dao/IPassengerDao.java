package com.hexaware.flightbookingdemo.dao;

import java.util.List;

import com.hexaware.flightbookingdemo.entity.Passenger;

public interface IPassengerDao {
	public int insertPassengerDetails(Passenger passenger);
	public int deletePassengerDetails(Passenger passenger);
	public int updatePassengerDetails(Passenger passenger);
	public Passenger getPassengerDetailsById(int passengerId);
	public List<Passenger> getAllPassengerDetails();
	

}
