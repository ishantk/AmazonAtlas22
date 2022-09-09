package com.amazon.atlas22.dynamicprogramming;


public class FibonacciApp {

	// 0 1 1 2 3 5 8 ......
	
	public static int calculateFibonacci(int n) {
		
		if(n<2)
			return n;
		
		//int fibResult = calculateFibonacci(n-1) + calculateFibonacci(n-2);
		//return fibResult;
		return calculateFibonacci(n-1) + calculateFibonacci(n-2);
	}
	
	public static void main(String[] args) {
				
		int num = 3;
		int result = calculateFibonacci(num);
		System.out.println("Result is: "+result);

	}

}
