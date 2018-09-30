package com.nissan.training.airline_project.dao;

import com.nissan.training.airline_project.pojo.Flight;

public interface IFlightDAO {

	public void addFlight(String arrivalTime, String departureTime, String source,
			String destination, String airline, int numOfSeats, int status) ;
	abstract void showAllFlight();
	abstract void deleteFlight(int flightId);
	public Flight showFlight(int flightId);
	public void updateFlight(int flightId, String arrivalTime, String departureTime, String source,
			String destination, String airline, int numOfSeats, int status);
}
