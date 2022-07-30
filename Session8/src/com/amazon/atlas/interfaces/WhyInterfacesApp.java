package com.amazon.atlas.interfaces;

import java.util.Scanner;

/*abstract class AmazonPayment{
	
	boolean isBankInterfaceUp = true;
	
	void pay(int amount) {
		
		System.out.println("[AmazonPayment] Processing Payment of \u20b9"+amount);
		
		if(isBankInterfaceUp) {
			System.out.println("[AmazonPayment] Payment Received");
		}else {
			System.out.println("[AmazonPayment] Payment Failed");
		}
	}
	
	abstract void onSuccess(String message);
	abstract void onFailure(int errorCode);
}

abstract class PayTMPayment{
	
	boolean isBankInterfaceUp = true;
	
	void payToPayTM(int amount) {
		
		System.out.println("[PayTMPayment] Processing Payment of \u20b9"+amount);
		
		if(isBankInterfaceUp) {
			System.out.println("[PayTMPayment] Payment Received");
		}else {
			System.out.println("[PayTMPayment] Payment Failed");
		}
	}
	
	abstract void onSuccessTransaction(String message);
	abstract void onFailureTransaction(int errorCode);
}

abstract class GooglePayment{
	
	boolean isBankInterfaceUp = true;
	
	void pay(int amount) {
		
		System.out.println("[PayTMPayment] Processing Payment of \u20b9"+amount);
		
		if(isBankInterfaceUp) {
			System.out.println("[PayTMPayment] Payment Received");
		}else {
			System.out.println("[PayTMPayment] Payment Failed");
		}
	}
	
	abstract void onPaymentSuccess(String message);
	abstract void onFailure(int errorCode);
}*/

// ERROR: Multiple Inheritance Not Supported
//class ZomatoPayment extends AmazonPayment, GooglePayment, PayTMPayment{
	
//}

interface AmazonPayment{
	
	boolean isBankInterfaceUp = true;
	
	// This method is accessible only by the object of class, which implements this interface :)
	default void pay(int amount) {
		
		System.out.println("[AmazonPayment] Processing Payment of \u20b9"+amount);
		
		if(isBankInterfaceUp) {
			System.out.println("[AmazonPayment] Payment Received");
			onSuccess("Amazon Received Payment Successfully");
		}else {
			System.out.println("[AmazonPayment] Payment Failed");
			onFailure(101);
		}
	}
	
	// By Default: public abstract void onSuccess(String message);
	void onSuccess(String message);
	void onFailure(int errorCode);
}


interface PayTMPayment{
	
	boolean isBankInterfaceUp = true;
	
	default void payToPayTM(int amount) {
		
		System.out.println("[PayTMPayment] Processing Payment of \u20b9"+amount);
		
		if(isBankInterfaceUp) {
			System.out.println("[PayTMPayment] Payment Received");
			onSuccessTransaction("PayTM Received Payment Successfully");
		}else {
			System.out.println("[PayTMPayment] Payment Failed");
			onFailureTransaction(201);
		}
	}
	
	void onSuccessTransaction(String message);
	void onFailureTransaction(int errorCode);
}


interface GooglePayment{
	
	boolean isBankInterfaceUp = false;
	
	default void payGoogle(int amount) {
		
		System.out.println("[GooglePayment] Processing Payment of \u20b9"+amount);
		
		if(isBankInterfaceUp) {
			System.out.println("[GooglePayment] Payment Received");
			onPaymentSuccess("Google Received Payment Successfully");
		}else {
			System.out.println("[GooglePayment] Payment Failed");
			onFailure(2191);
		}
	}
	
	void onPaymentSuccess(String message);
	void onFailure(int errorCode);
}

// Multiple Inheritance on Interfaces :)
interface PaymentMethod extends AmazonPayment, PayTMPayment, GooglePayment{
	
}

// Multiple Implementation and Not Multiple Inheritance
//class ZomatoPayment implements AmazonPayment, PayTMPayment, GooglePayment{

// Now, we implement just 1 interface which further is the Child of 3 interfaces :)
class ZomatoPayment implements PaymentMethod{

	public void onPaymentSuccess(String message) {
		System.out.println("[ZomatoPayment] [GooglePayment]: "+message);
		System.out.println("[ZomatoPayment] [GooglePayment]: Payment Received. Please Process Order");
	}

	public void onSuccessTransaction(String message) {
		System.out.println("[ZomatoPayment] [PayTMPayment]: "+message);
		System.out.println("[ZomatoPayment] [PayTMPayment]: Payment Received. Please Process Order");
	}

	public void onFailureTransaction(int errorCode) {
		System.out.println("[ZomatoPayment] [PayTMPayment]: "+errorCode);
		System.out.println("[ZomatoPayment] [PayTMPayment]: Payment Failed. Please Try Again");
	}

	public void onSuccess(String message) {
		System.out.println("[ZomatoPayment] [AmazonPayment]: "+message);
		System.out.println("[ZomatoPayment] [AmazonPayment]: Payment Received. Please Process Order");
	}

	public void onFailure(int errorCode) {
		
		if(errorCode == 101) {
			System.out.println("[ZomatoPayment] [AmazonPayment]: "+errorCode);
			System.out.println("[ZomatoPayment] [AmazonPayment]: Payment Failed. Please Try Again");
		}
		
		if(errorCode == 2191) {
			System.out.println("[ZomatoPayment] [GooglePayment]: "+errorCode);
			System.out.println("[ZomatoPayment] [GooglePayment]: Payment Failed. Please Try Again");
		}
	}
	
}

class ZomatoApp{
	
	void selectPaymentMethod(int option) {
		
		PaymentMethod method = new ZomatoPayment();
			
		if(option == 1) {
			//AmazonPayment payment = new ZomatoPayment();
			//payment.pay(2000);
			method.pay(2000);
		}else if(option == 2) {
			//PayTMPayment payment = new ZomatoPayment();
			//payment.payToPayTM(2000);
			method.payToPayTM(2000);
		}else if(option == 3) {
			//GooglePayment payment = new ZomatoPayment();
			//payment.payGoogle(2000);
			method.payGoogle(2000);
		}else {
			System.err.println("Invalid Option :(");
		}
		
	}
	
}

public class WhyInterfacesApp {

	public static void main(String[] args) {
	
		ZomatoApp app = new ZomatoApp();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1: Pay with Amazon");
		System.out.println("2: Pay with PayTM");
		System.out.println("3: Pay with Google");
		System.out.println("Select An Option (1-3): ");
		int option = scanner.nextInt();
		scanner.close();
		
		app.selectPaymentMethod(option);
		
	}

}
