package com.nissan.training.airline_project.test;

import java.util.Scanner;

import com.nissan.training.airline_project.pojo.Admin;
import com.nissan.training.airline_project.pojo.Customer;
import com.nissan.training.airline_project.utilities.AdminView;
import com.nissan.training.airline_project.utilities.CustomerView;
import com.nissan.training.airline_project.utilities.LoginAdmin;
import com.nissan.training.airline_project.utilities.LoginCustomer;
import com.nissan.training.airline_project.utilities.RegisterAdmin;
import com.nissan.training.airline_project.utilities.RegisterCustomer;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
	
		while(true) {
			
			System.out.println("WELCOME TO AIRLINE RESERVATION SYSTEM");
		System.out.println("PRESS \n 1.REGISTER \n 2.LOGIN \n 3.EXIT");
			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
			
			
			// code for register
			if(option==1) {
				System.out.println("REGISTER");
				System.out.println("PRESS \n 1.User \n 2.Admin \n 3.EXIT");
				int option_register = input.nextInt();
				if(option_register==1) {
					RegisterCustomer registerUser = new RegisterCustomer();
					registerUser.inputDetails();
					registerUser.register();
				}
				if(option_register==2) {
					RegisterAdmin registerAdmin = new RegisterAdmin();
					registerAdmin.inputDetails();
					registerAdmin.register();
				}
				if(option_register==3) {
					break;
				}
				
			}
			
			
			// code for login
			if(option==2) {
				
				System.out.println("PRESS \n 1.User \n 2.Admin \n 3.EXIT");
				int option_login = input.nextInt();
				
				if(option_login==1) {
						while(true) {
							LoginCustomer user = new LoginCustomer();
							user.inputDetails();
					
							if( user.Verify()==true){
								Customer customer = user.getDetails();
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
							LoginAdmin loginAdmin = new LoginAdmin();
						
							loginAdmin.inputDetails();							
							if( loginAdmin.Verify()==true){
								Admin admin1 = loginAdmin.getDetails();
								AdminView view = new AdminView();
								view.display(admin1);
							}
							
							if(loginAdmin.Verify()==false){
								System.out.println("IncorrectDetails");
							}
						}
				}
				
			
			
				if(option_login==3) {
					System.out.println("Thank you");
					break;
			
				}
			}
			if(option==3) {
			
				System.out.println("Thank you");
				break;
			}
		
	}
}
}
	
		
