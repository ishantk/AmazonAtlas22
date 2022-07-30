package com.amazon.atlas.one;

// public class
public class One {
	
	public static String APP_NAME = "Amazon Atlas"; 
	
	// Inside the class we can have attributes and methods marked as any one of 4
	// private, default (nothing to speccify), protected, public

	private void pvtShow() {
		System.out.println("[One] This is -private- show");
	}
	
	void defShow() {
		System.out.println("[One] This is ^default^ show");
	}
	
	protected void protShow() {
		System.out.println("[One] This is `protected` show");
	}
	
	public void pubShow() {
		System.out.println("[One] This is ~public~ show");
	}
	
}

// default class
class Two{
	
	private void pvtShow() {
		System.out.println("[Two] This is -private- show");
	}
	
	void defShow() {
		System.out.println("[Two] This is ^default^ show");
	}
	
	protected void protShow() {
		System.out.println("[Two] This is `protected` show");
	}
	
	public void pubShow() {
		System.out.println("[Two] This is ~public~ show");
	}
	
}


// Class at Root Level cannot be private or protected. Not Allowed
/*
private class Three{
	
}

protected class Four{
	
}*/

// 1 source file can have only 1 public class
// because the name of source file should be same name as that of public class name
// To create another public file, create it in separate source code
/*public class Five{
	
}*/

//We can have multiple default classes in java
/*
class Six{
	
}

class Seven{
	
}
*/