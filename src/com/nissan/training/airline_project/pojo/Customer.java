package com.nissan.training.airline_project.pojo;

public class Customer extends User{

public Customer() {
		
	}
	public Customer(String name,String email,String password,String dob,String contact) {
		super(name,email,password,dob,contact);
		// TODO Auto-generated constructor stub
	}
	public Customer(int int1, String name, String email, String password, String dob, String contact) {
		// TODO Auto-generated constructor stub
		setId(int1);
		setName(name);
		setEmail(email);
		setPassword(password);
		setDob(dob);
		setContact(contact);
	}
	

}
