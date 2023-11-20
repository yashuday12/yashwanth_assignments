package com.hexaware.flightbookingdemo.service;


import java.util.List;

import com.hexaware.flightbookingdemo.dao.PassengerDaoImp;
import com.hexaware.flightbookingdemo.entity.Passenger;

public class PassengerServices implements IPassengerService {
	PassengerDaoImp dao=new PassengerDaoImp();

	@Override
	public int insertPassengerDetails(Passenger passenger) {
		// TODO Auto-generated method stub
		dao.insertPassengerDetails(passenger);
		return 1;
	}

	@Override
	public int deletePassengerDetails(Passenger passenger) {
		// TODO Auto-generated method stub
		dao.deletePassengerDetails(passenger);
		return 1;
	}

	@Override
	public int updatePassengerDetails(Passenger passenger) {
		// TODO Auto-generated method stub
		dao.updatePassengerDetails(passenger);
		return 1;
	}

	@Override
	public Passenger getPassengerDetailsById(int passengerId) {
		// TODO Auto-generated method stub
		
		return dao.getPassengerDetailsById(passengerId);
	}

	@Override
	public List<Passenger> getAllPassengerDetails() {
		// TODO Auto-generated method stub
		 dao.getAllPassengerDetails();
		
		return dao.getAllPassengerDetails();
	}

}
