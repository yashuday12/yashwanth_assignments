package com.hexaware.springjdbcpractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbcpractice.Dao.IPassengerDao;
import com.hexaware.springjdbcpractice.model.Passenger;
@Service
public class PassengerService implements IPassengerService {
	@Autowired
	IPassengerDao dao;

	@Override
	public int insertDetails(Passenger passenger) {
		// TODO Auto-generated method stub
		return dao.insertDetails(passenger);
	}

}
