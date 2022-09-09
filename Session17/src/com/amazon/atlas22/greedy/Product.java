package com.amazon.atlas22.greedy;

public class Product{
	
	double weight;
	double value;
	double ratio;
	
	public Product() {
		
	}

	public Product(double weight, double value) {
		this.weight = weight;
		this.value = value;
		ratio = this.value/this.weight;
	}

	@Override
	public String toString() {
		return "Product [weight=" + weight + ", value=" + value + ", ratio=" + ratio + "]";
	}
	
}