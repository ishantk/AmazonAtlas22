package com.amazon.atlas22.grasp.model;

public class User {
	
	String name;
	String email;
	String password;
	
	public User() {
		
	}

	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
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

	public void viewAllCrossings() {
		RailwayCrossingService service = RailwayCrossingService.getInstance();
		service.getAllCrossings().forEach((crossing)->System.out.println(crossing));
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
}
