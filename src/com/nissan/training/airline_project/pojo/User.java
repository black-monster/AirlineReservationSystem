package com.nissan.training.airline_project.pojo;

abstract public class User {
	private int id;
	private String name;
	private String email;
	private String Password;
	private String dob;
	private String contact;
	
	public User() {
		
	}
	public User(int id, String name, String email, String password, String dob, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		Password = password;
		this.dob = dob;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
}
