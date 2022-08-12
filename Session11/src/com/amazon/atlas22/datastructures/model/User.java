package com.amazon.atlas22.datastructures.model;

public class User implements Comparable<User>{
	
	String name;
	String email;
	String phone;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

	@Override
	public int compareTo(User user) {
		return name.compareTo(user.name);
	}

}
