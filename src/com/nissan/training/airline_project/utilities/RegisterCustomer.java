package com.nissan.training.airline_project.utilities;


import com.nissan.training.airline_project.dao.CustomerDAOImplementation;

import com.nissan.training.airline_project.pojo.Customer;

public class RegisterCustomer extends Register{

	@Override
	public int register() {
		// TODO Auto-generated method stub
		Customer customer = new Customer(getName(),getEmail(),getPassword(),getDob(),getContact());
		CustomerDAOImplementation customerDao = new CustomerDAOImplementation();
		customerDao.addCustomer(customer);
		return 0;
	}

	
}
