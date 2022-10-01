package com.amazon.atlas22.queries;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

/*
 
 	1. In the signature of main function, we always pass arguments as (String[] args)
	what does this stand for and can it take any other values - Soham
	- Done :)
	
	2.How to think about recursion implementation. 
	How to find the base cases and how to formulate the entire recursive program -> Annu 
	
	3.  Kruskals 
		Prims
	 	Sollins 
	 	with Competitive Programming 
	 	
		Multi Threading
		Tree Data structure
		AVL and RB trees
		-> Akanksha
	- Done :)
		
	4. Dynamic Programming -> Madhuri
		Memoization
		Tabulation
	- Done :)
		
	5. Revision on knapsack -> Ajeeth
	- Done :)
		
	6. Equal Sum SubSet Problem	-> Hari
	
 	- Done :)
 */

public class QueryApp {

	// Command Line Parameters | Input to the main method
	public static void main(String[] args) {
		
		System.out.println("args is: "+args);
		System.out.println(Arrays.toString(args));

		File file = new File(args[0]);
		if(file.exists()) {
			System.out.println("File exists and name is: "+file.getName());
			
			try {

				FileReader reader = new FileReader(file);
				BufferedReader buffer = new BufferedReader(reader);
				String line = "";
				while((line = buffer.readLine()) != null ) {
					System.out.println(line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}else {
			System.out.println("File does not exists and name is: "+file.getName());
		}
		
	}

}
