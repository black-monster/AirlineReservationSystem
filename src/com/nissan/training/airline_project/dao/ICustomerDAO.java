package com.nissan.training.airline_project.dao;

import com.nissan.training.airline_project.pojo.Customer;

public interface ICustomerDAO {
	abstract int addCustomer(Customer c);
	abstract int showCustomer(int cust_id);
	abstract int showAllCustomer();
	abstract int updateCustomer(int cust_id);
	abstract int delete(int cust_id);
	
}
