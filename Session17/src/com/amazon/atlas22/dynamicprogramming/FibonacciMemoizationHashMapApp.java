package com.amazon.atlas22.dynamicprogramming;

import java.util.LinkedHashMap;

// 0 1 2 3 4 5 6
// 0 1 1 2 3 5 8 ......

public class FibonacciMemoizationHashMapApp {
	
	LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<Integer, Integer>();
	
	public int calculateFibonacciWithMemoization(int n) {
		
		if(n<2)
			return n;
		
		if(cache.containsKey(n)) {
			System.out.println("Memoization in Action for "+n);
			return cache.get(n);
		}
		
		cache.put(n, calculateFibonacciWithMemoization(n-1) + calculateFibonacciWithMemoization( n-2));
		return cache.get(n);
	}
	
	public static void main(String[] args) {
		
		FibonacciMemoizationHashMapApp app = new FibonacciMemoizationHashMapApp();
		
		int num = 6;
		int result = app.calculateFibonacciWithMemoization(num);
		System.out.println("Result is: "+result);
		
		System.out.println("Cache");
		System.out.println(app.cache);

	}

}

/*public class FibonacciMemoizationHashMapApp {

	public static int calculateFibonacci(int n) {
		// Create a Cache :)
		// We will Store results inside this cache array and we can resule the values
		LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<Integer, Integer>();
		return calculateFibonacciWithMemoization(cache, n);
	}
	
	public static int calculateFibonacciWithMemoization(LinkedHashMap<Integer, Integer> cache, int n) {
		
		if(n<2)
			return n;
		
		if(cache.containsKey(n)) {
			return cache.get(n);
		}
		
		cache.put(n, calculateFibonacciWithMemoization(cache, n-1) + calculateFibonacciWithMemoization(cache, n-2));
		return cache.get(n);
	}
	
	public static void main(String[] args) {
				
		int num = 6;
		int result = calculateFibonacci(num);
		System.out.println("Result is: "+result);

	}

}*/
