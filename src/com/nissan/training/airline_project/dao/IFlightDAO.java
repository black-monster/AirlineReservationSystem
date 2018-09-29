package com.nissan.training.airline_project.dao;

import com.nissan.training.airline_project.pojo.Flight;

public interface IFlightDAO {

	abstract int addCustomer(Flight f);
	abstract int showCustomer(int flightId);
	abstract int showAllCustomer();
	abstract int updateCustomer(int flightId);
	abstract int delete(int flightId);
}
