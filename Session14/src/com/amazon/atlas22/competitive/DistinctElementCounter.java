package com.amazon.atlas22.competitive;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctElementCounter {

	public static int getDistinctCount(int[] array) {
		
		// 1. Implement with HashSet
		/*HashSet<Integer> set = new HashSet<Integer>();
		
		for(int element: array) {
			set.add(element);
		}
		
		return set.size();*/
		
		// 2. Implement with HashSet
		
		if(array.length == 0) {
			return 0;
		}
		
		int count = 1;
		
		// Sort the Array in Ascending Order
		Arrays.sort(array);
		
		for(int idx=1; idx<array.length; idx++) {
			if(array[idx] != array[idx-1]) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		// Array Of Numbers
		int[] numbers = new int[]{2, 9, 2, 7, 1, 9, 7, 5, 1, 2};
		// How many unique i.e. distinct elements are their ?
		// 2, 9, 7, 1, 5 | 5 element which are unique :)
		
		int count = getDistinctCount(numbers);
		System.out.println("count is: "+count);

	}

}
