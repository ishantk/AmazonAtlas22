package com.amazon.atlas22.greedy;

import java.util.ArrayList;

/*
 	KnapSack 0/1 problem
 	double[] weights = {1, 3, 5, 4, 2};
	double[] values = {5, 10, 15, 7, 4};
	
 	Greedy Approach:
 	1. Calculate the Ratio -> Value/Weight
 		double[] ratios = [5.0, 3.3333333333333335, 3.0, 1.75, 2.0]
 	2. Be Greedy and Pick Up the Weight Value Pair with Max Ratio
 							total_weight
 		2.1		1,	5		1
 		2.2     3, 10		4
 		2.3		5, 15		10
 		2.4		2, 4		12
 		2.5		4, 7		16
 		
 		if capacity is just 11 -> we pickup the first 4 and done :)
 
 */




/*
	Fractional KnapSack 
	double[] weights = {10, 20, 30};
	double[] values = {60, 100, 120};
	
	Capacity -> 50
	
	// As per KnapSack 0/1
	weight 10+20 -> 30 | 160 :)
	
	if weight 30 is also picked
	weight 10+20+30 -> 60 which is more than capacity :)
	
	// We can pickup fraction of a weight
	2/3 of 30 Kgs -> 20
	
	weight -> 10 + 20 + 2/3 of 30 :) | here capacity is now 50 :)
	value  -> 60 + 100 + 2/3 of 120 (80) => (240)
	 
 */

public class KnapSackGreedyAlgoApp {
	
	
	ArrayList<Product> products;
	int capacity = 11;
	
	
	KnapSackGreedyAlgoApp() {
		
		Product product1 = new Product(1, 5);
		Product product2 = new Product(3, 10);
		Product product3 = new Product(5, 15);
		Product product4 = new Product(4, 7);
		Product product5 = new Product(2, 4);
		
		products = new ArrayList<Product>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		
	}
	
	int getMaxValue() {
		int maxValue = 0;
		
		products.sort((p1, p2)->{
			if (p1.ratio < p2.ratio)		return 1;
			else if (p1.ratio > p2.ratio)	return -1;
			else							return 0;
		});
		
		products.forEach((product) -> System.out.println(product));
		System.out.println();
		
		
		for(Product product : products) {
			
			if(capacity - product.weight >= 0) {
				maxValue += product.value;
				capacity -= product.weight;
			}
		}
		
		return maxValue;
	}
	
	public static void main(String[] args) {
		
		KnapSackGreedyAlgoApp app = new KnapSackGreedyAlgoApp();
		int result = app.getMaxValue();
		System.out.println("Max value is: "+result);
		
	}

}

/*public class KnapSackGreedyAlgoApp {
	
	double[] weights = {1, 3, 5, 4, 2};
	double[] values = {5, 10, 15, 7, 4};
	double capacity = 11;
	
	double[] ratios;

	
	KnapSackGreedyAlgoApp() {
		ratios = new double[weights.length];
		
		for(int idx=0; idx<ratios.length;idx++) {
			ratios[idx] = values[idx]/weights[idx];
		}
		
	}
	
	public static void main(String[] args) {
		
		KnapSackGreedyAlgoApp app = new KnapSackGreedyAlgoApp();
		System.out.println(Arrays.toString(app.ratios));
		Arrays.sort(app.ratios);
		System.out.println(Arrays.toString(app.ratios));

	}

}*/
