package com.amazon.atlas22.greedy;

import java.util.Arrays;

public class KnapSackBruteForceApp {
	
	// KnapSack :)
	// Pick up an Ornament and Put it in a bag
	//				 0    1  2  3  4  5
	int[] weights = {20, 10, 9, 4, 2, 1};
	int[] values = {4000, 3500, 1800, 400, 1000, 200};
	int capacity = 20;
	// We need to find a solution, so that we pick up those weights where we can have maximum value
	// Condition -> if we picked one weight we cannot pick it again :)
	
	int maxIdx = 0;
	int maxValue = 0;
	
	
	// We need to work on all the combinations :)
	// Generate the Combinations
	
	// Consider for 3 weights we have 2 power 3 combinations :)
	// 20, 10, 9
	// 0   0   0
	// 0   0   1
	// 0   1   0
	// 0   1   1
	// 1   0   0
	// 1   0   1
	// 1   1   0
	// 1   1   1
	int[][] getCombinations(){
		
		int number = weights.length;
		
		int size = (int)Math.pow(2, number);
		//System.out.println("size is: "+size);
		
		int[][] combinations = new int[size][number];
		
		// Write Algo here and share it with me :)
		for(int idx=0; idx<size; idx++) { // 64 times :) | 0 to 63
			for(int cIdx=number-1; cIdx>=0; cIdx--) {
				combinations[idx][cIdx] = (idx/(int)Math.pow(2, cIdx)) % 2;
				/*
				 	number -> 6
					idx / 32 => %2
					idx / 16 => %2
					idx / 8 => %2
					idx / 4 => %2
					idx / 2 => %2
					idx => %2
				*/
			}
		}
		
		return combinations;
	}
	
	void printArray(int[][] array2D) {
		for(int[] array : array2D) {
			System.out.println(Arrays.toString(array));
		}
	}
	
	int[][] solution() {
		
		int[][] combinations = getCombinations();
		printArray(combinations);
		
		int length1 = combinations.length;				// 64
		int length2 = combinations[0].length + 1;		// 7
		
		// 1st 6 indexes are basically the combinations/weight
		// last index is the total value
		int[][] results = new int[length1][length2]; // 64 X 7
		
		int arrayIdx = 0;
		
		
		for(int[] combination : combinations) {
			
			int totalWeight = 0;
			int totalValue = 0;
			
			for(int idx=0;idx<combination.length;idx++) {

				if(combination[idx] == 1) {
					totalWeight += weights[idx];
					totalValue += values[idx];
				}
			}
			
			//System.out.println("Evaluating Combination: "+Arrays.toString(combination));
			//System.out.println("Total Weight: "+totalWeight+" Total Value: "+totalValue);
			
			System.arraycopy(combination, 0, results[arrayIdx], 0, combination.length);
			
			if(totalWeight <= capacity) {
				results[arrayIdx][length2-1] = totalValue;
				
				if(totalValue > maxValue) {
					maxValue = totalValue;
					maxIdx = arrayIdx;
				}
				
			}else {
				results[arrayIdx][length2-1] = 0;
			}
			
			arrayIdx++;
		}
		
		return results;
	}

	public static void main(String[] args) {
		
		KnapSackBruteForceApp app = new KnapSackBruteForceApp();
		
		int[][] values = app.solution();
		app.printArray(values);
		
		System.out.println("`````````````````````````");
		System.out.println("MAX IDX IS: "+app.maxIdx);
		System.out.println("MAX VALUE IS: "+app.maxValue);
		System.out.println("COMBINATION: ");
		System.out.println(Arrays.toString(values[app.maxIdx]));
		System.out.println("`````````````````````````");
		
	}

}
