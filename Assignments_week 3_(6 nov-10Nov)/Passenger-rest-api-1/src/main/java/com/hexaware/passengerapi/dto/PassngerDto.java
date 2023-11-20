package com.hexaware.passengerapi.dto;

public class PassngerDto {
	private int passenegerId;
	private String passengerName;
	private int passengerAge;
	private String passengerSeat;
	private int ticketId;
	public  PassngerDto() {
			super();
		}
		public PassngerDto(int passenegerId, String passengerName, int passengerAge, String passengerSeat, int ticketId) {
			super();
			this.passenegerId = passenegerId;
			this.passengerName = passengerName;
			this.passengerAge = passengerAge;
			this.passengerSeat = passengerSeat;
			this.ticketId = ticketId;
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
		public int getTicketId() {
			return ticketId;
		}
		public void setTicket(int ticketId) {
			this.ticketId = ticketId;
		}
	 
	

}
