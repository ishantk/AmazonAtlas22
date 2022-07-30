package com.amazon.atlas.interfaces;

interface Inf1{
	
	int a = 10;
	int b = 20;
	
	void show();
	void fun();
}

interface Inf2{
	
	int a = 30;
	int c = 40;
	
	void fun();
	void bye();
}

// Interfaces can Inherit Other Interfaces : Multiple Inheritance on Interfaces allowed
interface Inf3 extends Inf1, Inf2{
	
}

// Multiple Implementation
class CA implements Inf3{//Inf1, Inf2{
	
	public void show() {
		System.out.println("This is show");
	}
	
	public void fun() {
		System.out.println("This is fun");
	}
	
	public void bye() {
		System.out.println("This is bye");
	}
	
	void hello() {
		System.out.println("This is hello");
	}
}

public class InterfaceUsageApp {

	public static void main(String[] args) {
		
		CA ca = new CA();
		ca.show();
		ca.fun();
		ca.bye();
		
		System.out.println();

		// Reference Variable of Interface can refer to the object of the class which implements it
		//Inf1 i1 = ca; 		// OK
		Inf1 i1 = new CA(); 	// OK
		i1.show();
		i1.fun();
		//i1.bye();			// error: bye is not an abstract method of Inf1
		//i1.hello();
		
		System.out.println();
		
		Inf2 i2 = ca;
		i2.fun();
		i2.bye();
		//i2.show();		// error
		//i2.hello();		// error
		
		System.out.println("a is: "+Inf1.a+" "+i1.a);
		System.out.println("b is: "+Inf1.b+" "+i1.b);
		System.out.println();
		System.out.println("a is: "+Inf2.a+" "+i2.a);
		System.out.println("c is: "+Inf2.c+" "+i2.c);
		
		//System.out.println("a is: "+CA.a); // error: Ambiguity error
		System.out.println("b is: "+CA.b+" "+ca.b);
		System.out.println("c is: "+CA.c+" "+ca.c);
		
		System.out.println();
		
		Inf3 i3 = new CA();
		i3.show();
		i3.fun();
		i3.bye();
		//i3.hello(); // Error
	}

}
