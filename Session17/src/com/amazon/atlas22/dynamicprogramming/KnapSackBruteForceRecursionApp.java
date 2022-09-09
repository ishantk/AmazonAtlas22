package com.amazon.atlas22.dynamicprogramming;

public class KnapSackBruteForceRecursionApp {
	
	int knapSack(int[] profits, int[] weights, int capacity) {
		return knapSackRecursiveSoln(profits, weights, capacity, 0);
	}
	
	int knapSackRecursiveSoln(int[] profits, int[] weights, int capacity, int currentIdx) {
		
		// Base Condition
		if(capacity <=0 || currentIdx>=profits.length)
			return 0;
		
		int profit1=0, profit2=0;
		
		// Case of Inclusion i.e. Select Element
		if(weights[currentIdx] <= capacity) {
			// we can keep moving to the next element and jeep on decreasing the capacity as well
			profit1 = profits[currentIdx] + knapSackRecursiveSoln(profits, weights, capacity-weights[currentIdx], currentIdx+1);
		}
		
		// Case of Exclusion i.e. Skip Element
		// Proceed without the element at the index
		profit2 = knapSackRecursiveSoln(profits, weights, capacity, currentIdx+1);
		
		// Return Maximum Profit
		return (profit1 > profit2) ? profit1 : profit2; // Math.max(profit1, profit2);
	}
	
	int knapSack(Item[] items, int capacity) {
		return knapSackRecursiveSoln(items, capacity, 0);
	}
	
	int knapSackRecursiveSoln(Item[] items, int capacity, int currentIdx) {
		
		// Base Condition
		if(capacity <=0 || currentIdx>=items.length)
			return 0;
		
		int profit1=0, profit2=0;
		
		// Case of Inclusion i.e. Select Element
		if(items[currentIdx].weight <= capacity) {
			// we can keep moving to the next element and jeep on decreasing the capacity as well
			profit1 = items[currentIdx].profit + knapSackRecursiveSoln(items, capacity-items[currentIdx].weight, currentIdx+1);
		}
		
		// Case of Exclusion i.e. Skip Element
		// Proceed without the element at the index
		profit2 = knapSackRecursiveSoln(items, capacity, currentIdx+1);
		
		// Return Maximum Profit
		return (profit1 > profit2) ? profit1 : profit2;
	}

	public static void main(String[] args) {
		
		int[] profits = {1, 6, 10, 16};
		int[] weights = {1, 2, 3, 5};
		
		Item item1 = new Item('A', 1, 1);
		Item item2 = new Item('B', 6, 2);
		Item item3 = new Item('C', 10, 3);
		Item item4 = new Item('D', 16, 5);
		
		Item[] items = {item1, item2, item3, item4};
		
		int capacity = 7;
				
		KnapSackBruteForceRecursionApp app = new KnapSackBruteForceRecursionApp();
		
		//int maxProfit = app.knapSack(profits, weights, capacity);
		
		int maxProfit = app.knapSack(items, capacity);
		System.out.println("Max Profit: "+maxProfit); // 22
	}

}
