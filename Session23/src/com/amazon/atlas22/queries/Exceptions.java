package com.amazon.atlas22.queries;

import java.io.IOException;

public class Exceptions {

	void throwException() {
		
		// 1. UnChecked -> Any Exception which is child of RunTimeException class is known as UnChecked Exception
		// 2. Checked	-> Rest of the classes in Exception Handling Hierarchy are Checked
		
		
		// ArithmeticException is child of RunTimeException
		// Hence, throwing an unchecked exception
		ArithmeticException aRef = new ArithmeticException("Throwing for Fun..");
		throw aRef;
	}
	
	void throwsException() throws IOException {
		// IOException is child of Exception
		// Hence, throwing a Checked exception
		IOException iRef = new IOException("Throwing for Fun...");
		throw iRef;
	}
	
	public static void main(String[] args) {
	
		System.out.println("App Started");
		
		Exceptions obj = new Exceptions();
		//obj.throwException();
		
		try {
			obj.throwsException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("App Finished");

	}

}
