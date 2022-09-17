package com.amazon.atlas22.creational;

import java.util.LinkedHashMap;

public class MySQLDB {
	
	private static MySQLDB dbInstance = new MySQLDB();
	
	private LinkedHashMap<String, Customer> customerMap;
	
	private MySQLDB(){
		customerMap = new LinkedHashMap<String, Customer>();
		
		Customer c1 = new Customer("John", "+91 99999 11111", "john@example.com");
		Customer c2 = new Customer("Fionna", "+91 99999 22222", "fionna@example.com");
		Customer c3 = new Customer("Sia", "+91 99999 33333", "sia@example.com");
		Customer c4 = new Customer("Kim", "+91 99999 44444", "kim@example.com");
		Customer c5 = new Customer("Anna", "+91 99999 55555", "anna@example.com");
		
		customerMap.put(c1.email, c1);
		customerMap.put(c2.email, c2);
		customerMap.put(c3.email, c3);
		customerMap.put(c4.email, c4);
		customerMap.put(c5.email, c5);
	}
	
	public static MySQLDB getInstance() {
		return dbInstance;
	}
	
	public LinkedHashMap<String, Customer> getCustomersFromDB(){
		
		try {
			System.out.println("Fetching Customer Records");
			for(int i=1;i<=5;i++) {
				System.out.print(".");
				Thread.sleep(1000);
			}
			System.out.println();
			System.out.println("Records Fetched :)");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Consider getCustomersFromDB is suppose to return result from some Internet Operation
		// And it will take nearly 5 seconds of time :)
		
		return customerMap;
	}

}
