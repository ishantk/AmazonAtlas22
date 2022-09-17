package com.amazon.atlas22.creational;

// Eager Initialization
// 	Object is constructed, before it is required
class Connection{
	
	static Connection connection = new Connection();
	
	private Connection(){
		System.out.println("Connection Created to DataBase "+hashCode());
	}
	
	static Connection getConnection() {
		return connection;
	}
	
	static void welcome() {
		System.out.println("Welcome to Connection Class");
	}
	
}

public class SingletonEager {

	public static void main(String[] args) {
		
		Connection.welcome();
		
		/*Connection connection1 = new Connection();
		Connection connection2 = new Connection();
		Connection connection3 = new Connection();

		System.out.println("connection1 hashCode: "+connection1.hashCode());
		System.out.println("connection2 hashCode: "+connection2.hashCode());
		System.out.println("connection3 hashCode: "+connection3.hashCode());*/
		
		// Reference Variables :)
		/*Connection connection1;
		Connection connection2;
		Connection connection3;
		
		connection1 = Connection.getConnection();
		connection2 = Connection.getConnection();
		connection3 = Connection.getConnection();
		
		System.out.println("connection1 hashCode: "+connection1.hashCode());
		System.out.println("connection2 hashCode: "+connection2.hashCode());
		System.out.println("connection3 hashCode: "+connection3.hashCode());*/
		
		// All the Reference Variables Refer to the Same Object
		
	}

}
