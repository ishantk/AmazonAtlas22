package com.amazon.atlas22.builtindatastructures;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Product implements Comparable<Product>{
	
	int pid;
	String name;
	int price;
	
	public Product() {
		
	}
			
	
	public Product(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}


	@Override
	public int compareTo(Product product) {
		return name.compareTo(product.name);
	}
	
	
}

class PriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price == o2.price) {
			return 0;
		}else if(o1.price > o2.price) {
			return 1;
		}else {
			return -1;
		}
	}
	
}

public class LinkedListDemo {

	public static void main(String[] args) {
		
		//List<String> list = new LinkedList<String>();
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Jack");		// 0
		list.add("Dave");		// 1
		list.add("Kia");		// 2
		list.add("Anna");		// 4
		list.add("Dave");		// 5
		
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.get(1));
		
		for(String name: list) {
			System.out.println(name);
		}
		
		Product p1 = new Product(101, "Apple iPhone", 70000);
		Product p2 = new Product(201, "Samsung Fold", 90000);
		Product p3 = new Product(301, "Samsung OLED TV", 80000);
		Product p4 = new Product(401, "Adidas Alphabounce", 5000);
		Product p5 = new Product(501, "Hydrate Water Bottle",1000);
		
		LinkedList<Product> cart = new LinkedList<Product>();
		cart.add(p1);
		cart.add(p2);
		cart.add(p5);
		cart.add(p3);
		
		cart.remove(1);
		
		// cart.clear(); remove all :)
		System.out.println("cart: "+cart.size());
		//System.out.println(cart);
		
		for(Product product : cart) {
			System.out.println(product);
		}

		
		Collections.sort(list);
		System.out.println("list after sorting is: ");
		System.out.println(list);
		
		
		//Collections.sort(cart);
		Collections.sort(cart, new PriceComparator());
		
		System.out.println("cart after sorting is: ");
		for(Product product : cart) {
			System.out.println(product);
		}
	}

}
