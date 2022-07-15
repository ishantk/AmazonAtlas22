
public class Recursion {
	
	
	static void printNumber(int number) {
		System.out.println("number is: "+number);
		
		number++; // 5 -> 6
		
		if(number <=5) {
			printNumber(number); // executed the same function again :) -> RECURSION
		}
		
		//return; // the last statement of any method is return, which means to return back to the previous frame
				// by popping out this method frame		
	}

	public static void main(String[] args) {
		
		System.out.println("[main]: for loop printing from 1 to 5");
		for(int i=1;i<=5;i++) {
			System.out.println("i is: "+i);
		}
		
		System.out.println();
		
		System.out.println("[main]: printNumber executed");
		Recursion.printNumber(1);
		
		System.out.println("[main] finsihed");

	}

}
