package com.nissan.training.airline_project.dao;

import com.nissan.training.airline_project.pojo.Ticket;

public interface ITicketDAO {
	
	abstract int addCustomer(Ticket t);
	abstract int showCustomer(int ticketId);
	abstract int showAllCustomer();
	abstract int updateCustomer(int ticketID);
	abstract int delete(int ticketID);
}
