package com.nissan.training.airline_project.utilities;

import java.util.Scanner;

import com.nissan.training.airline_project.dao.FlightDAOImplementation;
import com.nissan.training.airline_project.dao.TicketDAOImplementation;
import com.nissan.training.airline_project.pojo.Customer;
import com.nissan.training.airline_project.pojo.Flight;

public class CustomerViewUtility {

	public void bookFlight(Customer c) {
		FlightDAOImplementation flightImpl = new FlightDAOImplementation();
		flightImpl.showAllFlight();
		System.out.println("Enter the flight id and the number of tickets to book to book");
		
		int id, numOfTickets;
		Scanner input = new Scanner(System.in);
		id = input.nextInt();
		Flight flight = flightImpl.showFlight(id);
		int availableTickets = flight.getNumberOfSeats();
		numOfTickets =input.nextInt();
		while(!(availableTickets - numOfTickets >= 0))
		{
			System.out.println("The number of seats available is less than"+numOfTickets);
			System.out.println("Please another number of tickets again");
			numOfTickets = input.nextInt();
		}
		TicketDAOImplementation ticket = new TicketDAOImplementation();
		
		for(int i = 1; i <= numOfTickets; i++)
		{
			System.out.println("Enter passener" + i +" name email dob and contact");
			System.out.println("Enter name");
			String name = input.next();
			System.out.println("Enter email");
			String email = input.next();
			System.out.println("Enter dob");
			String dob = input.next();
			System.out.println("Enter contact number");
			String contact = input.next();
			ticket.addTicket(id, c.getId(), name, email, dob, contact, 1);
		}
	}

	public void cancelFlight(Customer c) {
		showBooking(c);
		System.out.println("Please enter the ticket id you want to cancel");
		Scanner input = new Scanner(System.in);
		int ticketId = input.nextInt();
		TicketDAOImplementation tickImp = new TicketDAOImplementation();
		while(tickImp.verifyTicketId(c, ticketId) == false)
		{
			System.out.println("Please enter a valid ticket id");
			ticketId = input.nextInt();
		}
		tickImp.deleteTicket(ticketId);
		System.out.println("Ticket "+ticketId+ " deleted");
		
	}

	public void resheduleFlight(Customer c) {
		showBooking(c);
		System.out.println("Enter the ticket_id you want to reschedule");
	}

	public void showBooking(Customer c) {
		TicketDAOImplementation tickImp = new TicketDAOImplementation();
		System.out.println("Showing all previous bookings");
		tickImp.showAll(c);
	}

	
}
