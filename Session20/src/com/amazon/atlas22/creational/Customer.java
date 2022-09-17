package com.amazon.atlas22.creational;

public class Customer{
	
	String name;
	String phone;
	String email;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
}