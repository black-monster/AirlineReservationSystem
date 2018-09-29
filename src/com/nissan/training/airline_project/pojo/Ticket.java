package com.nissan.training.airline_project.pojo;

public class Ticket {
	private int ticketId;
	private int flightId;
	private int custId;
	private String bookingTime;
	private String passengerName;
	private String passengerDOB;
	private String passengerEmail;
	private String passengerContactNo;
	private String ticketStatus;
	public Ticket(int ticketId, int flightId, int custId, String bookingTime, String passengerName, String passengerDOB,
			String passengerEmail, String passengerContactNo, String ticketStatus) {
		super();
		this.ticketId = ticketId;
		this.flightId = flightId;
		this.custId = custId;
		this.bookingTime = bookingTime;
		this.passengerName = passengerName;
		this.passengerDOB = passengerDOB;
		this.passengerEmail = passengerEmail;
		this.passengerContactNo = passengerContactNo;
		this.ticketStatus = ticketStatus;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPassengerDOB() {
		return passengerDOB;
	}
	public void setPassengerDOB(String passengerDOB) {
		this.passengerDOB = passengerDOB;
	}
	public String getPassengerEmail() {
		return passengerEmail;
	}
	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}
	public String getPassengerContactNo() {
		return passengerContactNo;
	}
	public void setPassengerContactNo(String passengerContactNo) {
		this.passengerContactNo = passengerContactNo;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	
	
	
}
