package com.hexaware.passengerapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.passengerapi.dto.PassngerDto;
import com.hexaware.passengerapi.entites.Passenger;
import com.hexaware.passengerapi.repository.IPassengerRepository;

@Service
public class PassengerServiceImp implements IPassengerService {

	@Autowired
	IPassengerRepository passengerRepo;
	
	

	@Override
	public Passenger getPassengerById(int passengerId) {
		
		return null;
	}

	@Override
	public List<Passenger> getAllPassenger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Passenger addPassenger(PassngerDto passengerDto) {
		Passenger passenger=new Passenger();
		passenger.setPassenegerId(passengerDto.getPassenegerId());
		passenger.setPassengerName(passengerDto.getPassengerName());
		passenger.setPassengerAge(passengerDto.getPassengerAge());
		passenger.setPassengerSeat(passengerDto.getPassengerSeat());
		passenger.setTicketId(passengerDto.getTicketId());
		return null;
	}

}
