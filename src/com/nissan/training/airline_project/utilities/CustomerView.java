package com.nissan.training.airline_project.utilities;

import java.util.Scanner;

import com.nissan.training.airline_project.pojo.Customer;

public class CustomerView {

	public void display(Customer c) {
		
		System.out.println("WELCOME,");
		System.out.println(c.getName());
		System.out.println("Press 1.To Book a Flight \n 2.To Cancel a Flight "
				+ "\n3. To Reschedule a Flight \n 4.To Show previous Booking  "
				+ "\n5. Logout");
		
		while(true)
		{
			
			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
			CustomerViewUtility viewUtility = new  CustomerViewUtility();
			switch(option) {
			
				case 1: viewUtility.bookFlight(c);
					break;
				case 2: viewUtility.cancelFlight(c);
					break;
				case 3: viewUtility.resheduleFlight(c);
					break;
				case 4:
					viewUtility.showBooking(c);
					break;
				case 5: System.out.println("Thank You");
					break;
			}
		}
		
		
	}
}
