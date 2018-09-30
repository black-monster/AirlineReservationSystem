package com.nissan.training.airline_project.pojo;

public class Flight {
	private int flightId;
	private String arrivalTime;
	private String departureTime;
	private String origin;
	private String destination;
	private String company;
	private int flight_number;
	private int seatsAvailable;
	private String status;
	private String type;
	
	
	public Flight(int flightId, String arrivalTime, String departureTime, String origin, String company,
			String destination,int flight_number, int seatsAvailable, String status, String type) {
		super();
		this.flightId = flightId;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.origin = origin;
		this.destination = destination;
		this.company = company;
		this.flight_number = flight_number;
		this.seatsAvailable = seatsAvailable;
		this.status = status;
		this.type = type;
	}
	
	public Flight(int flightId2, String string, String string2, String string3, String string4, String string5,
			int int1, int int2) {
		// TODO Auto-generated constructor stub
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(int flight_number) {
		this.flight_number = flight_number;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	

	public int getNumberOfSeats() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
