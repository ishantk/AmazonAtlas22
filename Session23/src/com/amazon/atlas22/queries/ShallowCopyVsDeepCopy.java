package com.amazon.atlas22.queries;

import java.util.Arrays;

class Customer implements Cloneable{
	
	String name;
	String email;
	Order order;
	
	public Customer() {
		
	}
	
	public Customer(String name, String email, Order order) {
		this.name = name;
		this.email = email;
		this.order = order;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", order=" + order + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		// Deep Copy
		// Create a New Order Object with Data Copied into it
		Order oRef = new Order(order.id, order.price, order.items);
		Customer cRef = new Customer(name, email, oRef);
		
		// Shallow Copy
		//return super.clone();
		
		return cRef;
	}
}

class Order{

	int id;
	int price;
	String[] items;
	
	public Order() {
	
	}

	public Order(int id, int price, String[] items) {
		this.id = id;
		this.price = price;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", items=" + Arrays.toString(items) + "]";
	}
	
}

public class ShallowCopyVsDeepCopy {

	public static void main(String[] args) {
		
		// Assume: Order and Customer below is fetched from the DB and then constructed with data
		// This Customer object is needed by Accounts Department, Logistics Department :)
		
		Order order = new Order();
		order.id = 1;
		order.price = 200;
		order.items = new String[] {"Shoe", "Water Bottle"};
		
		// Let customer be Fetched for Accounts Department
		Customer customerForAccounts = new Customer("John", "john@example.com", order);
		
		// Reference Copy -> Share the Same Object
		//Customer customerForLogistcs = customerForAccounts;
		
		Customer customerForLogistcs=null;
		
		try {
			customerForLogistcs = (Customer) customerForAccounts.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		customerForLogistcs.order.price += 75;
		
		System.out.println("customerForAccounts");
		System.out.println(customerForAccounts);
		System.out.println();
		
		System.out.println("customerForLogistcs");
		System.out.println(customerForLogistcs);
		System.out.println();
		
		System.out.println("customerForAccounts HashCode is: "+customerForAccounts.hashCode());
		System.out.println("customerForLogistcs HashCode is: "+customerForLogistcs.hashCode());

	}

}
