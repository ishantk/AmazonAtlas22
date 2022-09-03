package com.amazon.atlas22.java8features;

class Customer{
	
	String name;
	String phone;
	String email;
	boolean isPrime;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		isPrime = false;
	}

	@Override
	public String toString() {
		if(isPrime) {
			return "**Prime Customer** [name=" + name + ", phone=" + phone + ", email=" + email + ", isPrime=" + isPrime + "]";
		}else {
			return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + ", isPrime=" + isPrime + "]";
		}
	}
}

@FunctionalInterface
interface PrimeCustomer{
	String upgradeToPrime(Customer customer);
}

public class LambdaExpressionOOPSApp {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Anna", "+91 99999 11111", "anna@example.com");
		System.out.println(customer1);
		
		PrimeCustomer prime = (customer)->{
			System.out.println("Processing Payment of 1000 for Prime Customer..");
			customer.isPrime = true;
			return "Customer Upgraded to Prime";
		};

		prime.upgradeToPrime(customer1);
		
		System.out.println(customer1);
	}

}
