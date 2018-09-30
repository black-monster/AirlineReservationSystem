package com.nissan.training.airline_project.dao;

import com.nissan.training.airline_project.pojo.Flight;

public interface IFlightDAO {

	abstract int addFlight(Flight f);
	abstract int showFlight(int flightId);
	abstract int showAllFlight();
	abstract int updateFlight(int flightId);
	abstract int deleteFlight(int flightId);
}
