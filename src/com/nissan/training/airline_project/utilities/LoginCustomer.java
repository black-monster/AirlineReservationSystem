package com.nissan.training.airline_project.utilities;

import com.nissan.training.airline_project.dao.CustomerDAOImplementation;
import com.nissan.training.airline_project.pojo.Customer;

public class LoginCustomer extends Login{

	@Override
	public boolean Verify() {
		// TODO Auto-generated method stub
		
		String name =getName();
		String password = getPassword();

		
		CustomerDAOImplementation custDaoImp = new CustomerDAOImplementation();
//		System.out.println("");
		Customer customer = custDaoImp.getCustomer(name,password);
		
		//System.out.println(customer.getName()+" "+customer.getPassword());
		return(customer!=null);
		
		
		
	}
	
		public Customer getDetails() {
			String name =getName();
			String password = getPassword();

		
			CustomerDAOImplementation custDaoImp = new CustomerDAOImplementation();
			//		System.out.println("");
			Customer customer = custDaoImp.getCustomer(name,password);
		
			//System.out.println(customer.getName()+" "+customer.getPassword());
			return(customer);
	}

}
