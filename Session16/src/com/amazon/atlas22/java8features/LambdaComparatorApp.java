package com.amazon.atlas22.java8features;

import java.util.Comparator;
import java.util.LinkedList;


// Implement Comparator by a Class
class SortByPriceComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		if (o1.price > o2.price)		return 1;
		else if (o1.price < o2.price)	return -1;
		else							return 0;
	}
	
}

public class LambdaComparatorApp {

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
		
		
		// Anonymous Class
		Comparator<Product> comparator = new Comparator<Product>() {
			
			public int compare(Product o1, Product o2) {
				if (o1.price > o2.price)		return 1;
				else if (o1.price < o2.price)	return -1;
				else							return 0;
			}
		};
		
		// Lambda Expression
		Comparator<Product> lambda = (o1, o2)->{
			if (o1.price > o2.price)		return 1;
			else if (o1.price < o2.price)	return -1;
			else							return 0;
		};
		
		//products.sort(new SortByPriceComparator());
		//products.sort(comparator);
		//products.sort(lambda);
		
		products.sort(
				(o1, o2)->{
							if (o1.price > o2.price)		return 1;
							else if (o1.price < o2.price)	return -1;
							else							return 0;
						}
		);
		
		products.sort(
				(o1, o2)->{
							return o1.name.compareTo(o2.name);
						}
		);
		
		/*for(Product product : products) {
			System.out.println(product);
		}*/
		
		products.forEach((product)->System.out.println(product));

	}

}
