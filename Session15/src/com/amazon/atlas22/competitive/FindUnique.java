package com.amazon.atlas22.competitive;

import java.util.HashMap;
import java.util.Set;

public class FindUnique {

	public static int findUniqueElementWithNoOccurence(int[] array) {
		
	
		
		// O(n)
		/*
		
		int element = 0;
		 
		for (int x : array) {
	        
			System.out.print("element "+ element+" XOR "+x);
			element ^= x;
	        System.out.println(" is: "+element);
		}
		
		return element;
		
		*/
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int x : array) {
			if(map.containsKey(x)) {
				int value = map.get(x);
				++value;
				map.put(x, value);
			}else {
				map.put(x, 1);
			}
		}
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			if(map.get(key) == 1) {
				return key;
			}
		}
				
		return -1;
	}
	
	public static void main(String[] args) {
		
		// The Array Here has pair of numbers but 3 is kind of unique which has no pair :)
		int[] array = {9, 8, 1, 5, 3, 1, 1, 9, 8, 5, 1};

		int num1 = 9;
		int num2 = 9;
		
		int num3 = 7;
		
		int result = num1 ^ num2;
		int result1 = result ^ num3;
		System.out.println("result: "+result);
		System.out.println("result1: "+result1);
		
		int unique = findUniqueElementWithNoOccurence(array);
		System.out.println("Unique is: "+unique);
	}

}
