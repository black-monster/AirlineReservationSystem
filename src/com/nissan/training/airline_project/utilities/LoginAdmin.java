package com.nissan.training.airline_project.utilities;

import com.nissan.training.airline_project.dao.AdminDAOImplementation;
import com.nissan.training.airline_project.dao.CustomerDAOImplementation;
import com.nissan.training.airline_project.pojo.Admin;
import com.nissan.training.airline_project.pojo.Customer;

public class LoginAdmin extends Login{

	@Override
	public boolean Verify() {
		// TODO Auto-generated method stub
		String name =getName();
		String password = getPassword();

		
		AdminDAOImplementation adminDaoImp = new AdminDAOImplementation();
//		System.out.println("");
		Admin admin = adminDaoImp.getAdmin(name,password);
		
		//System.out.println(customer.getName()+" "+customer.getPassword());
		return(admin!=null);
	}

	public Admin getDetails() {
		String name =getName();
		String password = getPassword();

	
		AdminDAOImplementation adminDaoImp = new AdminDAOImplementation();
		//		System.out.println("");
		Admin admin = adminDaoImp.getAdmin(name,password);
	
		//System.out.println(customer.getName()+" "+customer.getPassword());
		return(admin);
		// TODO Auto-generated method stub

	}

	
}
