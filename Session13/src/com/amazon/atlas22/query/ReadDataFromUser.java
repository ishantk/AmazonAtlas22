package com.amazon.atlas22.query;

import java.util.Scanner;

class Student{
	
	int roll;
	String name;
	String email;
	
	Student(){
		
	}

	public Student(int roll, String name, String email) {
		this.roll = roll;
		this.name = name;
		this.email = email;
	}
	
	void readData() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Roll Number: ");
		roll = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter Name: ");
		name = scanner.nextLine();
		
		System.out.println("Enter Email: ");
		email = scanner.nextLine();
		
		scanner.close();
		
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + "]";
	}
	
	
}

public class ReadDataFromUser {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("s1 is: "+s1);
		
		Student s2 = new Student(101, "John", "john@example.com");
		System.out.println("s2 is: "+s2);
		
		Student s3 = new Student();
		s3.readData();
		System.out.println("s3 is: "+s3);
		

	}

}
