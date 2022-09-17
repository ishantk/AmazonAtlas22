package com.amazon.atlas22.creational;

interface Payment{
	void pay(int amount);
	void onSuccess();
	void onFailure();
}

class Card implements Payment{
	
	String cardNumber;
	int cvv;
	
	Card(){
		cardNumber = "4421 5561 7781 9980";
		cvv = 213;
		System.out.println("[Card] Object Constructed for Payment");
	}

	public void pay(int amount) {
		System.out.println("[Card] Payment  of amount "+amount+" Processed by Card Number "+cardNumber);
		onSuccess();
	}

	public void onSuccess() {
		System.out.println("[Card] Payment Successful");
	}

	public void onFailure() {
		System.out.println("[Card] Payment Failed");
	}
	
}

class UPI implements Payment{

	String upiLink;
	
	UPI(){
		upiLink = "9876544321@paytm";
		System.out.println("[UPI] Object Constructed for Payment");
	}

	public void pay(int amount) {
		System.out.println("[UPI] Payment  of amount "+amount+" Processed by UPI "+upiLink);
		onSuccess();
	}

	public void onSuccess() {
		System.out.println("[UPI] Payment Successful");
	}

	public void onFailure() {
		System.out.println("[UPI] Payment Failed");
	}
}


class DebitCard extends Card{
	DebitCard(){
		System.out.println("[DebitCard] Payment will be processed by #Debit Card#");
	}
}

class CreditCard extends Card{
	CreditCard(){
		System.out.println("[CreditCard] Payment will be processed by *Credit Card*");
	}
}

class AmericanExpressCard extends Card{
	AmericanExpressCard(){
		System.out.println("[AmericanExpressCard] Payment will be processed by ^American Express Card^");
	}
}



class PayTMUPI extends UPI{
	PayTMUPI(){
		System.out.println("[PayTMUPI] Payment will be processed by #PayTM UPI#");
	}
}

class GooglePayUPI extends UPI{
	GooglePayUPI(){
		System.out.println("[GooglePayUPI] Payment will be processed by *GooglePay UPI*");
	}
}

class PhonePeUPI extends UPI{
	PhonePeUPI(){
		System.out.println("[PhonePeUPI] Payment will be processed by ^PhonePe UPI^");
	}
}


/*class PaymentFactory{
	
	static Payment getPaymentMethod(int type) {
		Payment payment = null;
		
		if(type == 1) {
			payment = new Card();
		}else if(type == 2) {
			payment = new UPI();
		}else {
			System.out.println("Invalid Choice");
		}
		
		return payment;
	}
}*/

// An interface with a method to be implemented :)
interface PaymentAbstractFactory{
	Payment createPaymentMethod(int type);
}

class CardFactory implements PaymentAbstractFactory{
	
	public Payment createPaymentMethod(int type) {
		
		Payment payment = null;
		
		if(type == 1) {
			payment = new DebitCard();
		}else if(type == 2) {
			payment = new CreditCard();
		}else if(type == 3) {
			payment = new AmericanExpressCard();
		}else {
			System.out.println("Invalid Choice");
		}
		
		return payment;
	}
}

class UPIFactory implements PaymentAbstractFactory{
	
	public Payment createPaymentMethod(int type) {
		
		
		Payment payment = null;
		
		if(type == 1) {
			payment = new PayTMUPI();
		}else if(type == 2) {
			payment = new GooglePayUPI();
		}else if(type == 3) {
			payment = new PhonePeUPI();
		}else {
			System.out.println("Invalid Choice");
		}
		
		return payment;
	}
}

class PaymentMethodFactory{
	
	public static PaymentAbstractFactory getAbstractFactory(int type) {
	
		PaymentAbstractFactory factory = null;
			
		if(type == 1) {
			factory = new CardFactory();
		}else if(type == 2) {
			factory = new UPIFactory();
		}else {
			System.out.println("Invalid Choice");
		}

		return factory;
	}
}

public class AbstractFactory {

	public static void main(String[] args) {
		
		// We have Selected Factory as Card Factory
		PaymentAbstractFactory factory = PaymentMethodFactory.getAbstractFactory(2);
		Payment payment = factory.createPaymentMethod(3);
		payment.pay(2000);

	}

}
