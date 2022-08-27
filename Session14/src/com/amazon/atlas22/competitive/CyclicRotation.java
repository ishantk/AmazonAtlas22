package com.amazon.atlas22.competitive;

import java.util.Arrays;

public class CyclicRotation {

	
	public static int[] rotateArray(int[] array, int numOfRotations) {
		
		// Implement the Code
		// Hint: Use Modulus Operator :)
		
		int[] rotatedArry = new int[array.length];
		
		for(int idx=0;idx<array.length;idx++) {
			int position = (idx+numOfRotations) % array.length;
			rotatedArry[position] = array[idx];
		}
		
		return rotatedArry;
	}
	
	public static void main(String[] args) {

		//int[] array = {2, 9, 7, 8, 5};
		//int numOfRotations = 3;
		
		/*
		 	Three Rotations to be Done...
		 	
		 	Rotation1
		 	{2, 9, 7, 8, 5} -> {5, 2, 9, 7, 8}
		 	
		 	Rotation2
		 	{5, 2, 9, 7, 8} -> {8, 5, 2, 9, 7}
		 	
		 	Rotation3
		 	{8, 5, 2, 9, 7} -> {7, 8, 5, 2, 9}
		 */		

		
		int[] result = rotateArray(new int[]{2, 9, 7, 8, 5}, 3);
		System.out.println(Arrays.toString(result)); // 7, 8, 5, 2, 9
	}

}
