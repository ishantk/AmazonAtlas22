package com.amazon.atlas22.railwaycrossingapp.model;

import java.io.Serializable;

public class User implements Serializable{

	String name;
	String email;
	String password;
	int userType;	// 1 for End User, 2 for Admin, 3 for InCharge
	
	public User() {
		name = "";
		email = "";
		password = "";
		userType = 0;
	}

	public User(String name, String email, String password, int userType) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.userType = userType;
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
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", userType=" + userType + "]";
	}
	
	public boolean validate() {
		return !email.isEmpty() && !password.isEmpty();
	}
	
}
