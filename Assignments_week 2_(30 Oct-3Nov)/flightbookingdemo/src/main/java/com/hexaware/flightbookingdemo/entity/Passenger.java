package com.hexaware.flightbookingdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passenger {
	@Id
	private int passengerId;
	private int passengerAge;
	private String passengername;
	private String seatNumber;
	public Passenger() {
		super();
	}
	public Passenger(int passengerId, int passengerAge, String passengername, String seatNumber) {
		super();
		this.passengerId = passengerId;
		this.passengerAge = passengerAge;
		this.passengername = passengername;
		this.seatNumber = seatNumber;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengername() {
		return passengername;
	}
	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerAge=" + passengerAge + ", passengername="
				+ passengername + ", seatNumber=" + seatNumber + "]";
	}
	

}
