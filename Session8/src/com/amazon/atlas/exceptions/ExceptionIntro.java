package com.amazon.atlas.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionIntro {

	public static void main(String[] args) {
		
		System.out.println("[main] started");
		
		System.out.println("Welcome to CashBacks App :)");
		
		int[] cashBacks = {10, 11, 90, 100, 70, 77, 45, 30, 55};
		
		
		System.out.println("Enter Your Lucky Number (1-9): ");
		
		Scanner scanner = new Scanner(System.in);
		int luckyNumber = 0;
		int cashBackWon = 0;
		int addtionalCashBack = 0;
		/*try {
			luckyNumber = scanner.nextInt();
		}catch(InputMismatchException eRef) {
			System.err.println("Invalid Input :(");
		}
		scanner.close();
		int cashBackWon = 0;
		try {
			cashBackWon = cashBacks[luckyNumber-1];
		}catch(ArrayIndexOutOfBoundsException eRef) {
			System.err.println("Something Went Wrong....");
		}*/
		
		try {
			
			try {
				luckyNumber = scanner.nextInt();
			}catch(InputMismatchException eRef) {
				luckyNumber = 1;
			}
			
			cashBackWon = cashBacks[luckyNumber-1];
		}/*catch(InputMismatchException eRef) {
			System.err.println("Invalid Input :(");
		}catch(ArrayIndexOutOfBoundsException eRef) {
			System.err.println("CashBack Not Available for LuckyNumber "+luckyNumber);
		}*/
		catch(Exception eRef) { // RUN TIME POLYMORPHISM: Ref Var of Parent class Exception can refer to any child object
			System.err.println("Something Went Wrong: "+eRef);
			System.err.println("Message: "+eRef.getMessage());
		}
		finally { // Executed at any cost
			if(luckyNumber<=0 || luckyNumber>9) {
				System.out.println("Let us help you in getting a reward...");
				//addtionalCashBack = luckyNumber/3;
				try {
					addtionalCashBack = 25/luckyNumber;
				}catch(ArithmeticException aRef) {
					addtionalCashBack = 1;
				}
				System.out.println("Not Lucky.. But You Still got a CashBack of $"+addtionalCashBack);
			}
		}
		
		System.out.println("You Won a CashBack of $"+cashBackWon);
			
		System.out.println("[main] finished");
		
	}

}
// Compile Time Error : While creating the program, you may have a mistake which compiler tells about

// Run Time Error: While program is in execution phase
// RTE causes CRASH in the program's execution
//	i.e. an abnormal termination of program


/*
	
	try{
	
	} // ERROR: cannot create a try alone
	
	try{
	
	}finally{
	
	}	// OK: If we keep try with a min of finally, it is ok
		//		Here, exception is not handled, but finally block and do the handling of some logic, before program terminates abnormally   
	
	try{
	
	}catch(){
	
	}finally{
	
	}
	
		
	try{
		try{
			try{
		
			}catch(){
			
			}finally{
			
			}
		}catch(){
		
		}finally{
		
		}
	}catch(){
		try{
		
		}catch(){
		
		}finally{
		
		}	
	}finally{
		try{
		
		}catch(){
		
		}finally{
		
		}	
	}
	
 */
