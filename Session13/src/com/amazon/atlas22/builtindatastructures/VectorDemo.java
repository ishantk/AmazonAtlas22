package com.amazon.atlas22.builtindatastructures;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		// Dynamically Increases the Cappacity to Store Data
		// Synchronized :)
		Vector<String> vector = new Vector<String>();
		vector.add("Jack");		// 0
		vector.add("Dave");		// 1
		vector.add("Kia");		// 2
		vector.add("Anna");		// 4
		vector.add("Dave");		// 5

		System.out.println(vector);
		System.out.println(vector.size());
		
		System.out.println(vector.get(1));
		
		for(String name: vector) {
			System.out.println(name);
		}
		
		
	}

}
