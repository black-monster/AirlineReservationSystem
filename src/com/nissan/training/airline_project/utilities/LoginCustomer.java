package com.nissan.training.airline_project.utilities;

public class LoginCustomer extends Login{

	@Override
	public boolean Verify() {
		// TODO Auto-generated method stub
		String user = new String();
		String pass = new String();
		String name =getName();
		String password = getPassword();

		
		if(user.equals(name) && pass.equals(password))
		{ return true;} 
		
		return false;
		
		
	}

}
