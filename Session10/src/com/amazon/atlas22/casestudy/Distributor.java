package com.amazon.atlas22.casestudy;

public class Distributor {
	
	String name;
	String phone;
	String email;
	
	Distributor left;
	Distributor right;
	
	public Distributor() {
		this("NA", "NA", "NA");
	}
	
	public Distributor(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public void showDistributor() {
		System.out.println("Distributor [name=" + name + ", phone=" + phone + ", email=" + email + ", left=" + left + ", right="
				+ right + "]");
	}
	
}
