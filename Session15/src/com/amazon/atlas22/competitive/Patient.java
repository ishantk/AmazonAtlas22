package com.amazon.atlas22.competitive;

public class Patient {

	String name;
	int age;
	String gender;
	
	public Patient() {
		
	}
	
	public Patient(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
