package com.amazon.atlas22.java8features;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class StreamAPIOOPS {

	public static void main(String[] args) {
		
		Product p1 = new Product(101, "Adidas Alphabounce", 5000);
		Product p2 = new Product(201, "Adidas BackPack", 3000);
		Product p3 = new Product(701, "Nike Track Suit", 4300);
		Product p4 = new Product(301, "Apple iPhone", 70000);
		Product p5 = new Product(501, "Samsung LED TV", 45000);
		
		LinkedList<Product> products = new LinkedList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		products.stream().filter(p-> p.price > 30000).forEach((product)->System.out.println(product));
		
		LinkedList<Product> shoppingCart = new LinkedList<Product>();
		shoppingCart.add(p1);
		shoppingCart.add(p3);
		shoppingCart.add(p5);
		
		//Integer totalPrice = shoppingCart.stream().map(p->p.price).reduce(0, (sum, price) -> sum+price);
		
		Integer totalPrice = shoppingCart.stream().collect(Collectors.summingInt(p->p.price));
		System.out.println("Total Price: "+totalPrice);
	}

}
