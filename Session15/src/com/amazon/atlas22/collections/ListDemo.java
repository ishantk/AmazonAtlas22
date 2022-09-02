package com.amazon.atlas22.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListDemo {
	
	static void printUsingEnhancedForLoop(List<? extends Object> list) {
		for(Object element : list) {
			System.out.println(element);
		}
	}
	
	static void printUsingBasicForLoop(List<? extends Object> list) {
		
		for(int idx=0;idx<list.size();idx++) {
			System.out.println(list.get(idx));
		}
		
	}
	
	//static void printUsingIterator(List<String> list) {
	static void printUsingIterator(List<? extends Object> list) {
		//Iterator<String> itr = list.iterator();
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		
		Iterator<? extends Object> itr = list.iterator();
		while(itr.hasNext()) {
			
			Object object = itr.next();
			if(object instanceof Product) {
				Product product = (Product) object;
				if(product.pid == 201) {
					itr.remove(); // delete the object from collection :)
				}
			}
			System.out.println(object);
		}
		
	}
	
	static void printUsingListIterator(List<? extends Object> list) {

		// Can Iterate in both forward and previous directions :)
		ListIterator<? extends Object> itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("~~~~~~~");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
	}
	
	static void printUsingEnumeration(List<? extends Object> list) {

		Enumeration<? extends Object> enumeration = Collections.enumeration(list);
		
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
	}

	public static void main(String[] args) {
	
		Product p1 = new Product(101, "Apple iPhone", 70000);
		Product p2 = new Product(201, "Samsung Fold", 90000);
		Product p3 = new Product(301, "Apple MacBook", 120000);
		
		//ArrayList<String> names = new ArrayList<String>();
		Vector<String> names = new Vector<String>();
		LinkedList<Product> products = new LinkedList<Product>();
		
		
		names.add("John");
		names.add("Anna");
		names.add("Sia");
		names.add("Kim");
		names.add("John");
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		printUsingEnhancedForLoop(names);
		printUsingEnhancedForLoop(products);
		
		System.out.println();
		
		printUsingBasicForLoop(names);
		printUsingBasicForLoop(products);
		
		System.out.println();
		printUsingIterator(names);
		printUsingIterator(products);
		
		System.out.println();
		printUsingListIterator(names);
		
		System.out.println();
		printUsingEnumeration(names);
		printUsingEnumeration(products);
		
		System.out.println();
		
		// Add the Element to List
		names.add("Fionna");
		
		// Get the Element from List
		String name = names.get(3);
		
		// Update the Element into List
		names.set(2, "George");
		
		// Remove an Element from the List
		names.remove(1);
		
		// Fetch All Elements. Simply print the reference variable
		System.out.println(names);
		
		System.out.println("names size is "+names.size());
		
		if(names.contains("Fionna")) {
			System.out.println("Fionna is in the list");
		}

		int idx = names.indexOf("Fionna"); // lastIndexOf
		System.out.println("Fionn is available at idx: "+idx);
		
		// Remove All
		//names.clear();
		//System.out.println(names);
		
		ArrayList<String> newNames = new ArrayList<String>();
		newNames.add("Ken");
		newNames.add("Mike");
		
		names.addAll(newNames);
		
		System.out.println(names);
		
		// Sorting of List :)
		Collections.sort(products);
		
	}

}
