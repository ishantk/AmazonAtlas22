package com.amazon.atlas22.query;

// Inheritance Relationship where Customer is Parent to PrimeCustomer
// Casting plays a Role in Inheritance Relationship also
class Customer{
	
}

class PrimeCustomer extends Customer{
	
}

class StarCustomer extends Customer{
	
}

public class Casting {

	public static void main(String[] args) {
		
		// data is 8 bits in size
		byte data = 10;
		
		// number is 32 bits in size
		// Here we are performing a copy operation for data of 8 bits to be copied into 32 bits
		int number = data;  // UP CASTING
		
		// age is 8 bits in size
		// Here we are performing a copy operation for data of 32 bits to be copied into 8 bits
		byte age = (byte)number; // DOWN CASTING
		
		Customer cRef = new Customer();
		PrimeCustomer pRef = new PrimeCustomer();
		StarCustomer sRef = new StarCustomer();
		
		// UpCasting
		// i.e. Ref Var of Parent can hold the reference of Child Object :)
		// Polymorphic Statement
		//Customer cRef1 = pRef;
		Customer cRef1 = sRef;
		
		if(cRef1 instanceof StarCustomer) {
			System.out.println("cRef1 instanceof StarCustomer");
		}else {
			System.out.println("cRef1 not instanceof StarCustomer");
		}
		
		// DownCasting
		
		if(cRef1 instanceof PrimeCustomer) {
			PrimeCustomer pRef1 = (PrimeCustomer)cRef1;
		}else {
			System.err.println("Downcasting Not Possible :)");
		}
		
	}

}
