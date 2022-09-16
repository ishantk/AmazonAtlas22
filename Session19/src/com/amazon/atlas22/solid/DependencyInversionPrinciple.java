package com.amazon.atlas22.solid;

class Address{
	
	String adrsLine;
	String city;
	String state;
	Integer zipCode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String adrsLine, String city, String state, Integer zipCode) {
		this.adrsLine = adrsLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [adrsLine=" + adrsLine + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + "]";
	}
	
}

class Customer{
	
	String name;
	String phone;
	String email;
	
	// Has-A Relationship
	Address address; // 1 to 1 Relationship
	
	public Customer() {
		// Dependency :)
		// High Coupling
		// address = new Address("2144 B20", "Bengaluru", "Karanataka", 520001); // Hard Coded
	}
	
	public Customer(Address address) {
		// Dependency :)
		// Low Coupling
		this.address = address;
	}
	
	// Dependency Injection :)
	public void setAddress(Address address) {
		// Best -> Low Coupling
		this.address = address;
	}
}

interface PaymentGateway{
	
}

class PayTMPaymentGateway implements PaymentGateway{
	// Certain Code for Payment Gateway
}

class GooglePayPaymentGateway implements PaymentGateway{
	// Certain Code for Payment Gateway
}

class BHIMPaymentGateway implements PaymentGateway{
	// Certain Code for Payment Gateway
}

class MyFoodApp{
	
	PaymentGateway paymentGateway; // HAS-A Relationship :)
	
	void setPaymentGateway(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}
	
}

class GoogleMaps{
	
}

class AppleMaps{
	
}

class UberCabBookingApp{
	
	GoogleMaps googleMap;
	AppleMaps appleMap;
	
	void setGoogleMaps(GoogleMaps googleMap) {
		this.googleMap = googleMap;
	}
	
	void setAppleMaps(AppleMaps appleMap) {
		this.appleMap = appleMap;
	}
	
}



public class DependencyInversionPrinciple {

	public static void main(String[] args) {
		
		Address address = new Address();
		Customer john = new Customer();
		
		//Customer fionna = new Customer(address);
		
		john.setAddress(address);
		
		PaymentGateway gateway1 = new PayTMPaymentGateway();
		PaymentGateway gateway2= new GooglePayPaymentGateway();
		PaymentGateway gateway3 = new BHIMPaymentGateway();
		
		MyFoodApp app = new MyFoodApp();
		//app.setPaymentGateway(gateway1);
		//app.setPaymentGateway(gateway2);
		app.setPaymentGateway(gateway3);
		
		GoogleMaps maps1 = new GoogleMaps();
		AppleMaps maps2 = new AppleMaps();
		
		UberCabBookingApp cabApp = new UberCabBookingApp();
		cabApp.setGoogleMaps(maps1);
		cabApp.setAppleMaps(maps2);

	}

}
