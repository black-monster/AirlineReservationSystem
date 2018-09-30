package com.nissan.training.airline_project.utilities;

import java.util.Scanner;

import com.nissan.training.airline_project.pojo.Admin;

public class AdminView {

public void display(Admin c) {
		
		System.out.println("WELCOME,");
		System.out.println(c.getName());
		System.out.println("Press 1.To Add a Flight \n 2.To Cancel a Flight "
				+ "3. To Reschedule a Flight \n 4.To Show All Previous Booking  "
				+ "\n5. Logout");
		
		while(true)
		{
			
			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
			CustomerViewUtility viewUtility = new  CustomerViewUtility();
			switch(option) {
			
				case 1: viewUtility.bookFlight();
					break;
				case 2: viewUtility.cancelFlight();
					break;
				case 3: viewUtility.rescheduleFlight();
					break;
				case 4:
					viewUtility.showBooking();
					break;
				case 5: System.out.println("Thank You");
					break;
			}
		}
		
		
	}
}
