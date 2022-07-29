
class Parent{
	
	String fname;
	String lname;
	int wealth;
	
	Parent(){
		fname = "John";
		lname = "Watson";
		wealth = 100000;
		System.out.println("[Parent] Object Constructed - Default Constructor");
	}
	
	void show() {
		System.out.println("[Parent] fname: "+fname+" lname: "+lname+" wealth: "+wealth);
	}
}

// Child here is an extension of Parent :) | Inheritance
class Child extends Parent{
	
	String fname;
	int wealth;
	String companyName;
	
	Child(){
		fname = "Fionna";
		wealth = 200000;
		companyName = "ABC Ltd";
		System.out.println("[Child] Object Constructed - Default Constructor");
	}
	
	// The method show of Child, overrides the Parent's Method
	// ReDefining the method of Parent, in Child so as to have a customized definition in the Child
	void show() {
		super.wealth -= 5000;
		super.show(); // super is a reference variable which refers to the Parent Object from the Child Object :)
		System.out.println("[Child] fname: "+fname+" lname: "+lname+" wealth: "+wealth+" companyName: "+companyName);
	}
	
}

// RULES:
// 1. To inherit, we need to use keyword extends
// 2. Before the Object of Child, Parent's Object is constructed in the memory :)
// 3. Child can access anything in Parent other than private, IFF Child does not have it :)
//	  if child has its property, then it will access its own property :)


public class WhatIsInheritanceApp {

	public static void main(String[] args) {
		
		Parent pRef = new Parent();
		System.out.println("pRef is: "+pRef);
		pRef.show();
		
		System.out.println();
		
		Child cRef = new Child();
		System.out.println("cRef is: "+cRef);
		
		cRef.wealth -= 12000;
		cRef.show();
		
	}

}
