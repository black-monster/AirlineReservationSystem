package com.nissan.training.airline_project.pojo;

abstract public class User {
	private int user_id;
	private String name;
	private String email;
	private String Password;
	private String dob;
	private int contact;
	public User(int user_id, String name, String email, String password, String dob, int contact) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		Password = password;
		this.dob = dob;
		this.contact = contact;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
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
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	
}
