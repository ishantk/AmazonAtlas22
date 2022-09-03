package com.amazon.atlas22.java8features;

import java.util.Date;

interface Notification{
	// Single Abstract Method -> Hence, Notification is a Functional Interface
	void notifyUser();	// No Parameter Method
}

class User implements Notification{

	public void notifyUser() {
		System.out.println("A New Notification Received at "+ new Date());
	}
}

@FunctionalInterface
interface Payment{
	String pay(int amount);
}

public class LambdaExpressionSingleParameterApp {

	public static void main(String[] args) {
		
		Notification notification1 = new User();
		notification1.notifyUser();
		
		// Implement Notification Interface using Anonymous Class
		Notification notification2 = new Notification() {
			public void notifyUser() {
				System.out.println("``````````````````````````````");
				System.out.println("Anonymous Class Implementation");
				System.out.println("A New Notification Received at "+ new Date());
				System.out.println("``````````````````````````````");
			}
			
		};
		
		notification2.notifyUser();
		
		// Lambda Expression
		// 1. It Works with Functional Interfaces i.e. to have only 1 single method
		// 2. To Define the method use arrow operator
		
		Notification notification3 = ()->{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Lambda Expression Implementation");
			System.out.println("A New Notification Received at "+ new Date());
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		};
		
		notification3.notifyUser();
		
		/*Payment payment = (int amount)->{
			System.out.println("Processing Payment for amount: "+amount);
			System.out.println("Payment Successfully Received");
			return "Payment Process Finished";
		};*/
		
		Payment payment = (parameter)->{
			System.out.println("Processing Payment for amount: "+parameter);
			System.out.println("Payment Successfully Received");
			return "Payment Process Finished";
		};
		
		String response = payment.pay(3000);
		System.out.println("Response is: "+response);
	}

}
