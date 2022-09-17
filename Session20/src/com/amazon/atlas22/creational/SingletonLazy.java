package com.amazon.atlas22.creational;

// Lazy Initialization :)
class DB{
	
	static DB db;
	
	private DB() {
		System.out.println("DB Object Constructed "+hashCode());
	}
	
	static DB getInstance() {
		
		if(db == null) { // create the object when it is 1st time required. -> Lazy :)
			db = new DB();
		}
		
		return db;
	}
	
	static void welcome() {
		System.out.println("Welcome to MySQL DataBase");
	}
}

public class SingletonLazy {

	public static void main(String[] args) {
		
		DB.welcome();
		
		//DB db1 = DB.getInstance();
		//System.out.println("db1 hashcode is: "+db1.hashCode());

	}

}
