package com.amazon.atlas22.builtindatastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Set<String> set = new HashSet<String>();
		//HashSet<String> set = new HashSet<String>();			 	// unordered data management | Hashing 
		//LinkedHashSet<String> set = new LinkedHashSet<String>(); 	// maintains the order in which you add the data | Hashing
		TreeSet<String> set = new TreeSet<String>();				// Sorted Data based on Strings :)	
		
		// TreeSet which will sort the data based on the Price of the Product
		//TreeSet<Product> set1 = new TreeSet<Product>(new PriceComparator());
		TreeSet<Product> set1 = new TreeSet<Product>();
		
		
		set.add("John");
		set.add("Fionna");
		set.add("Anna");
		set.add("Dave");
		set.add("Kim");
		set.add("Fionna");
		
		System.out.println("Size of set is: "+set);
		System.out.println("set is: "+set);
		
		// Cannot get a single element from HashSet
		// Data is stored using Hashing not indexing ....
		
		//set.remove("Dave");
		
		for(String name : set) {
			System.out.println(name);
		}
		
		Product p1 = new Product(101, "Apple iPhone", 70000);
		Product p2 = new Product(201, "Samsung Fold", 90000);
		Product p3 = new Product(301, "Samsung OLED TV", 80000);
		Product p4 = new Product(401, "Adidas Alphabounce", 5000);
		Product p5 = new Product(501, "Hydrate Water Bottle",1000);
		
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
		set1.add(p5);
		
		for(Product product : set1) {
			System.out.println(product);
		}

	}

}
