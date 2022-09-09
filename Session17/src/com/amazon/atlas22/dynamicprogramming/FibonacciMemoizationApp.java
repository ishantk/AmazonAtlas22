package com.amazon.atlas22.dynamicprogramming;

public class FibonacciMemoizationApp {
	
	public static int calculateFibonacci(int n) {
		// Create a Cache :)
		// We will Store results inside this cache array and we can resule the values
		int[] cache = new int[n+1];
		return calculateFibonacciWithMemoization(cache, n);
	}
	
	public static int calculateFibonacciWithMemoization(int[] cache, int n) {
		
		if(n<2)
			return n;
		
		if(cache[n] != 0) {
			return cache[n];
		}
		
		cache[n] = calculateFibonacciWithMemoization(cache, n-1) + calculateFibonacciWithMemoization(cache, n-2);
		return cache[n];
	}
	
	public static void main(String[] args) {
				
		int num = 3;
		int result = calculateFibonacci(num);
		System.out.println("Result is: "+result);

	}

}
