package com.nissan.training.airline_project.dao;

import com.nissan.training.airline_project.pojo.Ticket;

public interface ITicketDAO {
	
	abstract int addTicket(Ticket t);
	abstract int showTicket(int ticketId);
	abstract int showAllTicket();
	abstract int updateTicket(int ticketID);
	abstract int delete(int ticketID);
}
