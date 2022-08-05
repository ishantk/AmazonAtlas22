package com.amazon.atlas22.model;

public class Product {

	public int pid;
	public String name;
	public int price; 	// price is the key for the Tree Structure ?
	
	
	public Product() {
		this(0, "", 0);
	}
	
	public Product(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public void showProduct() {
		System.out.println("Product [pid=" + pid + ", name=" + name + ", price=" + price + "]");
	}
	
	
}
