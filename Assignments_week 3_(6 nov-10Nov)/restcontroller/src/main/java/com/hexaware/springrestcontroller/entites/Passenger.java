package com.hexaware.springrestcontroller.entites;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger implements Serializable{
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passenegerId;
	private String passengerName;
		private int passengerAge;
		private String passengerSeat;
	 
	public Passenger() {
		super();
	}
	public Passenger(int passenegerId, String passengerName, int passengerAge, String passengerSeat) {
		super();
		this.passenegerId = passenegerId;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerSeat = passengerSeat;
		
	}
	public int getPassenegerId() {
		return passenegerId;
	}
	public void setPassenegerId(int passenegerId) {
		this.passenegerId = passenegerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	public String getPassengerSeat() {
		return passengerSeat;
	}
	public void setPassengerSeat(String passengerSeat) {
		this.passengerSeat = passengerSeat;
	}
	@Override
	public String toString() {
		return "Passenger [passenegerId=" + passenegerId + ", passengerName=" + passengerName + ", passengerAge="
				+ passengerAge + ", passengerSeat=" + passengerSeat + "]";
	}
	
	
}
