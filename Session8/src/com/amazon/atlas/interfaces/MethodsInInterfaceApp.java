package com.amazon.atlas.interfaces;

interface Inf{
	
	void show();
	
	default void hello() {
		System.out.println("This is hello from Inf");
	}
	
	// Accessible by the name of Interface
	static void bye() {
		System.out.println("This is bye from Inf");
	}
	
}

class InfImpl implements Inf{
	
	public void show() {
		System.out.println("This is show in InfImpl");
	}
}

public class MethodsInInterfaceApp {

	public static void main(String[] args) {
		
		Inf.bye();
		//Inf.hello(); // error
		
		
		Inf iRef = new InfImpl();
		iRef.show();
		iRef.hello();
		
		InfImpl iRef1 = new InfImpl();
		iRef1.show();
		iRef1.hello();
	}

}
