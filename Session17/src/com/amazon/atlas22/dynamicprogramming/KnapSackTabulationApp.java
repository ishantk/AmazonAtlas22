package com.amazon.atlas22.dynamicprogramming;

import java.util.Arrays;

public class KnapSackTabulationApp {

	int[][] cache;
	
	int knapSackTabulaiton(int[] profits, int[] weights, int capacity) {
		
		// Handling Certain Edge Cases :)
		if(capacity <=0 || profits.length == 0 || weights.length != profits.length) {
			return 0;
		}
		
		// Create a Table
		// 4 X 8 -> 32 Combinations :)
		cache = new int[profits.length][capacity+1];
		
		// Considering just a single weight
		for(int i=0;i<=capacity;i++) {
			if(weights[0] <= i) {
				cache[0][i] = profits[0];	// record i.e. save the very first profit :)
			}
		}
		
		// Process Others...
		for(int i=1; i<profits.length; i++) { // 1, 2, 3
			for(int j=1; j<=capacity; j++) {  // for every i we got to iterate 8 times 
				int profit1=0, profit2=0;
				
				// Include the Item if not more than capacity :)
				if(weights[i] <= j) {
					profit1 = profits[i] + cache[i-1][j-weights[i]];
				}
				
				// exclude the item
				profit2 = cache[i-1][j];
				
				// Store the max profit in the cache :)
				cache[i][j] = (profit1 > profit2) ? profit1 : profit2;
			}
		}
		
		return cache[profits.length-1][capacity];
	}
	
	public static void main(String[] args) {
		
		int[] profits = {1, 6, 10, 16};
		int[] weights = {1, 2, 3, 5};
		int capacity = 7;
		
		KnapSackTabulationApp app = new KnapSackTabulationApp();
		
		int maxProfit = app.knapSackTabulaiton(profits, weights, capacity);
		System.out.println("Max Profit: "+maxProfit); // 22
		System.out.println("```````````````````");
		
		System.out.println("CACHE");
		System.out.println("``````");
		for(int[] array : app.cache) {
			System.out.println(Arrays.toString(array));
		}
		
	}

}
