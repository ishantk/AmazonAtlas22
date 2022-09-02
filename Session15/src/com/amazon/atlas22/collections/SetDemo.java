package com.amazon.atlas22.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	static void printElementsUsingEnhancedForLoop(Set<? extends Object> set) {
		for(Object object : set) {
			System.out.println(object);
		}
	}
	
	static void printElementsUsingIterator(Set<? extends Object> set) {
		Iterator<? extends Object> itr = set.iterator();
		
		while(itr.hasNext()) {
			Object object = itr.next();
			System.out.println(object);
			//itr.remove(); // Iterator can help to remove the Object from the Collection
		}
	}
	
	
	static void printUsingEnumeration(Set<? extends Object> set) {

		Enumeration<? extends Object> enumeration = Collections.enumeration(set);
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
	}

	
	public static void main(String[] args) {
		
		//HashSet<String> set = new HashSet<String>();
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		TreeSet<String> emails = new TreeSet<String>();
		
		TreeSet<Product> productSet = new TreeSet<Product>();
		
		set.add("John");
		set.add("Fionna");
		set.add("John");
		set.add("Dave");
		set.add("Sia");
		
		System.out.println("Set Elements: "+set);
		
		set.remove("Sia");
		
		System.out.println("Set Elements Now : "+set);
		System.out.println("Size of Set is: "+set.size());
		
		emails.add("kia@example.com");
		emails.add("shawn@example.com");
		emails.add("sia@example.com");
		emails.add("mike@example.com");
		emails.add("leo@example.com");
		emails.add("shawn@example.com");
		
		printElementsUsingEnhancedForLoop(set);
		
		System.out.println();
		
		printElementsUsingEnhancedForLoop(emails);
		
		System.out.println();
		
		printElementsUsingIterator(set);
		
		System.out.println();
		
		printElementsUsingIterator(emails);

		
		if(emails.contains("leo@example.com")) {
			System.out.println("Leo Email Exists");
		}
		
		Product p1 = new Product(101, "Apple iPhone", 130000);
		Product p2 = new Product(201, "Samsung Fold", 90000);
		Product p3 = new Product(301, "Apple MacBook", 75000);
		
		productSet.add(p1);
		productSet.add(p2);
		productSet.add(p3);
		
		//printElementsUsingIterator(productSet);
		printUsingEnumeration(productSet);
	}

}
