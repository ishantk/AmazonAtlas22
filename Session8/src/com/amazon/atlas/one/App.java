package com.amazon.atlas.one;

public class App {

	public static void main(String[] args) {
		
		// Within the same package, we can create objects of any class in any class
		One one = new One();
		Two two = new Two();
		
		//one.pvtShow();
		one.defShow();
		one.protShow();
		one.pubShow();
		
		System.out.println();
		
		//two.pvtShow();
		two.defShow();
		two.protShow();
		two.pubShow();
		
	}

}

// private: not accessible outside the class
// default, protected and public all accessible everywhere in the same package
