package com.amazon.atlas22.creational;

import java.util.LinkedHashMap;
import java.util.Set;

class CustomerRecords implements Cloneable{
	
	LinkedHashMap<String, Customer> records;
	
	public CustomerRecords() {
		MySQLDB db = MySQLDB.getInstance();
		records = db.getCustomersFromDB();	// This statement is a time consuming Statement to create Customerrecords Object
		System.out.println("Customer Records Created :)");
	}
	
	public CustomerRecords(LinkedHashMap<String, Customer> records) {
		this.records = records;
		System.out.println("Customer Records Created :)");
	}
	
	void showRecords() {
		Set<String> keys = records.keySet();
		keys.forEach((key)->System.out.println(records.get(key)));
	}
	
	// clone in Java
	// Explore : Deep Copy and Shallow Copy :)
	
	// Prototyping :)
	@Override
	protected Object clone() throws CloneNotSupportedException {
		LinkedHashMap<String, Customer> customerRecords = new LinkedHashMap<String, Customer>();
		customerRecords.putAll(records);
		// Create a new Object, which is clone of an Object
		CustomerRecords records = new CustomerRecords(customerRecords);
		return records;
	}
}

public class Proptotype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// Required for Customer Support Department
		CustomerRecords record1 = new CustomerRecords();
		record1.showRecords();
		
		System.out.println();
		
		// Required for Logistics Department
		//CustomerRecords record2 = new CustomerRecords();
		//record2.showRecords();
		
		CustomerRecords record2 = (CustomerRecords)record1.clone();
		record2.showRecords();
	}

}
