package com.amazon.atlas22.solid;

/*class Payment{
	
	void pay(int amount) {
		System.out.println("Paying an amount of \u20b9"+amount);
	}
	
	void onSuccess(String message) {
		System.out.println("Payment Successful");
		System.out.println(message);
	}
	
	void onFailed(String message) {
		System.out.println("Payment Faield");
		System.out.println(message);
	}
}*/

interface Payment{
	
	void pay(int amount);
	
	void onSuccess(String message);
	
	void onFailed(String message);
}

class PayByUPI implements Payment{//extends Payment{
	
	void upiBusinessMehtod() {
		//....
	}
	
	public void pay(int amount) {
		System.out.println("Paying an amount of \u20b9"+amount+" by UPI");
	}
	
	@Override
	public void onSuccess(String message) {
		System.out.println("UPI Suceess "+message);	
	}
	
	@Override
	public void onFailed(String message) {
		System.out.println("UPI Failed "+message);	
	}
}

class PayByCard implements Payment{ //extends Payment{
	
	void cardBusinessMehtod() {
		//....
	}
	
	public void pay(int amount) {
		System.out.println("Paying an amount of \u20b9"+amount+" by Card");
	}
	
	@Override
	public void onSuccess(String message) {
		System.out.println("Card Suceess "+message);	
	}
	
	@Override
	public void onFailed(String message) {
		System.out.println("Card Failed "+message);	
	}
}

public class OpenClosePrinciple {

	public static void main(String[] args) {
		
		User user = new User(1, "John", "+91 99999 11111", "john@example.com", "Male", 25);
		//System.out.println(user.id);
		System.out.println(user.getId());

	}

}
