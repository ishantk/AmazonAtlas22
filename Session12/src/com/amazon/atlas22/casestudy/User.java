package com.amazon.atlas22.casestudy;

public class User {
	
	String name;
	String phone;
	String email;
	
	public User() {
		
	}
	
	public User(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
	
}
