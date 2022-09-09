package com.amazon.atlas22.dynamicprogramming;

import java.util.LinkedHashMap;

//0 1 2 3 4 5 6
//0 1 1 2 3 5 8 ......


public class FibonacciTabulationApp {

	LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<Integer, Integer>();
	
	FibonacciTabulationApp(){
		cache.put(0, 0);
		cache.put(1, 1);
	}
	
	int calculateFibonacciWithTabulation(int n) {
		
		if(cache.containsKey(n)) {
			System.out.println("Returing from Cache for "+n);
			return cache.get(n);
		}

		System.out.println("Computing Loop for "+n);
		for(int idx=2;idx<=n;idx++) {
			cache.put(idx, cache.get(idx-1) + cache.get(idx-2));
		}
		
		return cache.get(n);
	}
	
	public static void main(String[] args) {
		
		FibonacciTabulationApp app = new FibonacciTabulationApp();
		System.out.println("Fibonacci of 6 is: "+app.calculateFibonacciWithTabulation(6));
		System.out.println("Fibonacci of 3 is: "+app.calculateFibonacciWithTabulation(3));
		System.out.println("Fibonacci of 5 is: "+app.calculateFibonacciWithTabulation(5));
		System.out.println("Fibonacci of 5 is: "+app.calculateFibonacciWithTabulation(8));

	}

}


/*public class FibonacciTabulationApp {

	int calculateFibonacciWithTabulation(int n) {
		
		int[] cache = new int[n+1];
		cache[0] = 0;
		cache[1] = 1;
		
		for(int idx=2;idx<=n;idx++) {
			cache[idx] = cache[idx-1] + cache[idx-2];
		}
		
		return cache[n];
	}
	
	public static void main(String[] args) {
		
		FibonacciTabulationApp app = new FibonacciTabulationApp();
		int result = app.calculateFibonacciWithTabulation(6);
		System.out.println("result is: "+result);
	}

}*/
