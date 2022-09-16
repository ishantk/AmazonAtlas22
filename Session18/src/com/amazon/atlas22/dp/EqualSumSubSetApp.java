package com.amazon.atlas22.dp;

import java.util.Arrays;

public class EqualSumSubSetApp {
	
	Boolean[][] cache;
	
	boolean canPartition(int[] set) {
		
		// Add all the Elements to check if sum is even or odd
		int sum = Arrays.stream(set).sum();
		System.out.println("For Set "+Arrays.toString(set)+" Sum is: "+sum);
		
		// Validation if we can solve the problem or not
		if(sum%2 != 0)
			return false;
		
		return canPartition(set, sum/2, 0);
	}
	
	// Initial Call ->  {1, 2, 3, 4}, 5, 0
	// Second Call  ->  {1, 2, 3, 4}, 4, 1
	// Third Call   ->  {1, 2, 3, 4}, 2, 2
	// ....
	
	// Overloading the method :)
	boolean canPartition(int[] set, int sum, int currentIdx) { 		
		if(sum == 0)
			return true; // :)
		
		if(set.length == 0 || currentIdx >= set.length)
			return false;
		
		if(set[currentIdx] <= sum) {
			// Include the Element :)
			System.out.println(">> canPartition [INCLUDE]: SET: "+Arrays.toString(set)+" sum: "+sum+" currentIdx: "+currentIdx);
			if(canPartition(set, sum-set[currentIdx], currentIdx+1)) {
				return true; // finally we can return true in case the sum will be 0 at the end :)
			}
		}
		
		// Exclude the Element :)
		System.out.println(">> canPartition [EXCLUDE]: SET: "+Arrays.toString(set)+" sum: "+sum+" currentIdx: "+currentIdx);
		return canPartition(set, sum, currentIdx+1);
	}
	
	boolean canPartitionWithMemoization(int[] set) {
		
		// Add all the Elements to check if sum is even or odd
		int sum = Arrays.stream(set).sum();
		System.out.println("For Set "+Arrays.toString(set)+" Sum is: "+sum);
		
		// Validation if we can solve the problem or not
		if(sum%2 != 0)
			return false;
		
		/*
		 
		 	SET = 1, 2, 3, 4 -> Length is 4 and Sum/2 is 5+1 => 6
		
				SUM -->
		 		0 1 2 3 4 5
		| 	0
	   	|	1
	   SET	2
		 	3
		 
		 */
		
		cache = new Boolean[set.length][sum/2+1];
		return canPartitionWithMemoization(set, sum/2, 0);
	}
	
	// Overloading the method :)
	boolean canPartitionWithMemoization(int[] set, int sum, int currentIdx) { 		
		if(sum == 0)
			return true; // :)
		
		if(set.length == 0 || currentIdx >= set.length)
			return false;
		
		if(cache[currentIdx][sum] == null) {
			if(set[currentIdx] <= sum) {
				// Include the Element :)
				System.out.println(">> canPartition [INCLUDE]: SET: "+Arrays.toString(set)+" sum: "+sum+" currentIdx: "+currentIdx);
				if(canPartitionWithMemoization(set, sum-set[currentIdx], currentIdx+1)) {
					cache[currentIdx][sum] = true;
					return cache[currentIdx][sum]; // finally we can return true in case the sum will be 0 at the end :)
				}
			}
		}
		
		// Exclude the Element :)
		System.out.println(">> canPartition [EXCLUDE]: SET: "+Arrays.toString(set)+" sum: "+sum+" currentIdx: "+currentIdx);
		
		cache[currentIdx][sum] = canPartitionWithMemoization(set, sum, currentIdx+1);
		
		return cache[currentIdx][sum];
	}
	
	// Explore Tabulation :)


	public static void main(String[] args) {

		int[] set1 = {1, 2, 3, 4}; 		// ->  {2, 3} AND {1, 4} -> TRUE :)
		//int[] set2 = {2, 3, 4, 6};		// SUM is ODD -> FALSE
		//int[] set3 = {1, 1, 3, 4, 7}; 	// -> {1, 3, 4} AND {1, 7} -> TRUE :)
		
		EqualSumSubSetApp app = new EqualSumSubSetApp();
		System.out.println("Can Set1 "+Arrays.toString(set1)+" be Partitioned: "+app.canPartitionWithMemoization(set1)+"\n");
		//System.out.println("Can Set2 "+Arrays.toString(set2)+" be Partitioned: "+app.canPartition(set2)+"\n");
		//System.out.println("Can Set3 "+Arrays.toString(set3)+" be Partitioned: "+app.canPartition(set3)+"\n");
		
		System.out.println("CACHE :)");
		for(Boolean[] array : app.cache) {
			System.out.println(Arrays.toString(array));
		}
	}

}
