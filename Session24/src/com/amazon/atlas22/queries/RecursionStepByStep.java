package com.amazon.atlas22.queries;

public class RecursionStepByStep {
	
	// STEP1
	// Solve using Iterable Approach i.e. use loops and operators etc and solve the problem
	
	// STEP2
	// Create a Method ofcourse, with an input
	// Also, what it should return
	
	// STEP3
	// Identify the minimal Problem -> With length/size to be 0 or 1 :)
	// Here, we are identifying the base case :)
	
	// Step4
	// Incorporate the Condition in your method :)
	// i.e. put an if and terminate the method to give away the result
	
	// Step5
	// Break the Problem by thinking of the stack data structure
	// num 123 => 1 + 2 + 3	| Sum of 123 is 1 + sum of 23 :) | Sum of 23 is 2 + Sum of 3
	// Always PLOT a Stack Frame Structure :)
	
	/*static int sumOfDigits(int num) {
				
		String str = String.valueOf(num);

		// BASE CASE :)
		if(str.length() == 1) {
			System.out.println("Base Case Reached "+str);
			return num;
		}
		
		int sum = 0;
		for(int idx=0;idx<str.length();idx++) {
			sum += Integer.parseInt(str.charAt(idx)+"");
		}
		
		return sum;
	}*/
	
	static int sumOfDigits(int num) {
		
		String str = String.valueOf(num);

		// BASE CASE :)
		if(str.length() == 1) {
			System.out.println("Base Case Reached "+str);
			return num;
		}else {
			// return 1 + sumOfDigits(23);
			return Integer.parseInt(str.charAt(0)+"") + sumOfDigits(Integer.parseInt(str.substring(1)));
		}
	}
	
	// 12343131
	// dividing by 10 and % by 10
	
	/*static int count3s(int num) {
		
		int count = 0;
		
		String str = String.valueOf(num);
		
		for(int idx=0;idx<str.length();idx++) {
			if(str.charAt(idx) == '3') {
				count ++;
			}
		}
		
		return count;
	}*/
	
	/*static int count3s(int num) {
		
		 int count = 0;
		
		 while(num>0){
			 int c=num%10;
			 num=num/10;
			 if(c==3){
				 count++;
			 }
	     }
	     return count;
	}*/
	
	// Recursive Solution
	/*static int count3s(int num) {
		
		if(num == 0) {
			return 0;
		}else if(num % 10 == 3) {
			return 1 + count3s(num/10);
		}else {
			return count3s(num/10);
		}
	}*/
	
	// Recursive Solution
	static int count3s(int num) {
		
		String str = String.valueOf(num);
		
		if(str.length() == 1) {
			int count = 0;
			if(str.charAt(0) == '3') {
				count++;
			}
			return count;
		}else {
			return (str.charAt(0)=='3' ? 1 : 0) + count3s(Integer.parseInt(str.substring(1)));
		}
	}
	
	
	

	public static void main(String[] args) {
		
		// STEP1
		// Solve using Iterable Approach i.e. use loops and operators etc and solve the problem
		
		int num1 = 123;
		int num2 = 12345;
		int num3 = 12;
		int num4 = 7;
		int num5 = 12343131;
		// Convert the Integer Number to String
		/*
		int num = 123; 
		String str = String.valueOf(num);

		int sum = 0;
		for(int idx=0;idx<str.length();idx++) {
			sum += Integer.parseInt(str.charAt(idx)+"");
		}
		
		System.out.println(sum);*/
		
		System.out.println("Sum of Digits of "+num1+" is: "+sumOfDigits(num1));
		System.out.println("Sum of Digits of "+num2+" is: "+sumOfDigits(num2));
		System.out.println("Sum of Digits of "+num3+" is: "+sumOfDigits(num3));
		System.out.println("Sum of Digits of "+num4+" is: "+sumOfDigits(num4));
		System.out.println("3 in "+num5+" comes: "+count3s(num5)+ " times ");
	}

}
