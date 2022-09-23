package com.amazon.atlas22.structural;

import java.util.ArrayList;
import java.util.List;

interface Product{
	void show();
}

class TV implements Product{
	
	String name;
	String companyName;
	String technology;
	int price;
	
	public TV(String name, String companyName, String technology, int price) {
		this.name = name;
		this.companyName = companyName;
		this.technology = technology;
		this.price = price;
	}
	
	public void show() {
		System.out.println("TV [name=" + name + ", companyName=" + companyName + ", technology=" + technology + "]");
	}
	
}

class Mobile implements Product{
	
	String name;
	String companyName;
	String os;
	int ram;
	int price;
	
	public Mobile(String name, String companyName, String os, int ram, int price) {
		this.name = name;
		this.companyName = companyName;
		this.os = os;
		this.ram = ram;
		this.price = price;
	}
	
	public void show() {
		System.out.println("Mobile [name=" + name + ", companyName=" + companyName + ", os=" + os + ", ram=" + ram + "]");
	}
}

class Shoe implements Product{
	
	String name;
	String companyName;
	String color;
	int shoeSize;
	int price;
	
	
	public Shoe(String name, String companyName, String color, int shoeSize, int price) {
		this.name = name;
		this.companyName = companyName;
		this.color = color;
		this.shoeSize = shoeSize;
		this.price = price;
	}


	@Override
	public void show() {
		System.out.println("Shoe [name=" + name + ", companyName=" + companyName + ", color=" + color + ", shoeSize=" + shoeSize
				+ "]");
	}

}

class ShoppingCart implements Product{
	
	List<Product> products = new ArrayList<Product>();
	
	void add(Product product) {
		products.add(product);
	}
	
	void add(Product product, int quantity) {
		// algo here :)
	}
	
	void remove(Product product) {
		products.remove(product);
	}
	
	void clear(Product product) {
		products.clear();
	}
	
	@Override
	public void show() {
		products.forEach((product)->product.show());
		// Stream API and calculate the total in shopping cart
		//int total = products.stream().reduce();
		//System.out.println("Total: "+total);
	}
	
}

public class CompositeShoppingCart {

	public static void main(String[] args) {
		
		TV tv = new TV("Smart TV", "Samsung", "OLED", 50000);
		Mobile mobile = new Mobile("iPhone14", "Apple", "iOS", 4, 90000);
		Shoe shoe = new Shoe("UltraBoost", "Adidas", "Black", 9, 8000);
		
		
		ShoppingCart cart = new ShoppingCart();
		cart.add(tv);
		cart.add(mobile);
		cart.add(shoe);
		
		cart.show();
		
	}

}
