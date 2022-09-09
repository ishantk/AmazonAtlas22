package com.amazon.atlas22.greedy;

import java.util.ArrayList;

public class FractionalKnapSackGreedyAlgoApp {

	ArrayList<Product> products;
	ArrayList<Product> productsInKnapSack;
	double capacity = 50;
	
	
	FractionalKnapSackGreedyAlgoApp() {
		
		Product product1 = new Product(10, 60);
		Product product2 = new Product(20, 100);
		Product product3 = new Product(30, 120);
		
		products = new ArrayList<Product>();
		productsInKnapSack = new ArrayList<Product>();
		
		products.add(product1);
		products.add(product2);
		products.add(product3);
	}
	
	double getMaxValue() {
		double maxValue = 0;
		
		products.sort((p1, p2)->{
			if (p1.ratio < p2.ratio)		return 1;
			else if (p1.ratio > p2.ratio)	return -1;
			else							return 0;
		});
		
		products.forEach((product) -> System.out.println(product));
		System.out.println();
		
		
		for(Product product : products) {
			
			// Pick up the Product in whole
			if(capacity - product.weight >= 0) {
				maxValue += product.value;
				capacity -= product.weight;
				productsInKnapSack.add(product);
			}else {
				// Compute the Fraction and Pick up the Product's weight and value accordingly
				double fraction = capacity / product.weight;
				maxValue += product.value * fraction;
				capacity -= (product.weight * fraction);
				productsInKnapSack.add(new Product(product.weight * fraction, product.value * fraction));
				break;
			}
		}
		
		return maxValue;
	}	
	
	public static void main(String[] args) {
		
		FractionalKnapSackGreedyAlgoApp app = new FractionalKnapSackGreedyAlgoApp();
		double result = app.getMaxValue();
		System.out.println("Max Value is: "+result);
		
		app.productsInKnapSack.forEach((product)->System.out.println(product));

	}

}
