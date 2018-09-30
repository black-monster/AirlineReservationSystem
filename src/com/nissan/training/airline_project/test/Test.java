package com.nissan.training.airline_project.test;

import java.util.Scanner;

import com.nissan.training.airline_project.pojo.Admin;
import com.nissan.training.airline_project.pojo.Customer;
import com.nissan.training.airline_project.utilities.CustomerView;
import com.nissan.training.airline_project.utilities.LoginAdmin;
import com.nissan.training.airline_project.utilities.LoginCustomer;

public class Test {

	public static void main(String args[]) {
	
		while(true) {
			
			System.out.println("WELCOME TO AIRLINE RESERVATION SYSTEM");
			System.out.println("PRESS \n 1.REGISTER \n 2.LOGIN \n 3.EXIT");
			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
			
			if(option==1) {
				
				System.out.println("PRESS \n 1.User \n 2.Admin \n 3.EXIT");
				int option_register = input.nextInt();
				if(option_register==1) {
					while(true) {
//					LoginCustomer user = new LoginCustomer();
				
					}
				}
				if(option_register==2) {
					
				}
				if(option_register==3) {
					break;
				}
				
			}
			
			if(option==2) {
				
				System.out.println("PRESS \n 1.User \n 2.Admin \n 3.EXIT");
				int option_login = input.nextInt();
				
				if(option_login==1) {
						while(true) {
							LoginCustomer user = new LoginCustomer();
							user.inputDetails();
					
							if( user.Verify()==true){
								Customer customer = new Customer();
								CustomerView view = new CustomerView();
								view.display(customer);
							}
							
							if(user.Verify()==false){
								System.out.println("IncorrectDetails");
							}
					}
				}  
				if(option_login==2) {
					
						while(true) {
							LoginAdmin admin = new LoginAdmin();
						
							admin.inputDetails();
							if( admin.Verify()==true){
								Admin admin1 = new Admin(0, null, null, null, null, null);
								//AdminView view = new AdminView(admin1);
								// view.display();
							} 
							if(admin.Verify()==false){
								System.out.println("IncorrectDetails");
							}
						}
				}
				
			
			
				if(option_login==3) {
					System.out.println("Thank you");
					break;
			
				}
			if(option==3) {
			
				System.out.println("Thank you");
				break;
			}
		}
	}
}
}
	
		
