package com.amazon.atlas.interfaces;

abstract class Payment{
	
	int numberOfPayments;
	
	// Even you cannot create an object of abstract class, but you can still create a constructor inside it
	// Constructors are Allowed :)
	Payment(){
		System.out.println("[Payment] Constructed");
		numberOfPayments = 5;
	}
	
	abstract void pay();
}

interface Notification{
	
	// Interfaces cannot have Constructors -> 
	/*Notification(){
		
	}*/
	
	// public static final message = "Welcome to App :)";
	String message="Welcome to App :)";
	
	// By Default -> public abstract void notifyUser();
	void notifyUser();
}

// MyApp is Child and Payment is Parent :)
class MyApp extends Payment{
	
	MyApp(){
		System.out.println("[MyApp] Constructed");
	}
	
	void pay() {
		System.out.println("Payment Processed");
	}
}

// YourApp is not the Child of Notification :)
class YourApp implements Notification{
	
	public void notifyUser() {
		System.out.println("Notification Received");
	}
}

public class InterfaceApp {

	public static void main(String[] args) {
		
		// Both Abstract Class and Interfaces cannot be instantiated :) 
		//Payment pay = new Payment();
		//Notification notification = new Notification();
		
		MyApp app = new MyApp();
		
		System.out.println("MESSAGE: "+Notification.message);

	}

}
