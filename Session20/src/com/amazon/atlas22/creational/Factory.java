package com.amazon.atlas22.creational;

import java.util.Scanner;

interface Cab{
	
	int baseFare = 50; // public static final int baseFare = 50;
	void bookCab(String source, String destinition, int distance);
	
}

class MiniCab implements Cab{
	
	int pricePerKm;
	
	MiniCab(){
		pricePerKm = 8;
		System.out.println("[MiniCab] Object Created"); 
	}
	
	public void bookCab(String source, String destinition, int distance) {
		int fare = baseFare + (pricePerKm*distance);
		System.out.println("[MiniCab] Booked from "+source+" to "+destinition);
		System.out.println("[MiniCab] Please Pay: \u20b9"+fare);
	}
	
}

class SedanCab implements Cab{
	
	int pricePerKm;
	
	SedanCab(){
		pricePerKm = 12;
		System.out.println("[SedanCab] Object Created"); 
	}
	
	public void bookCab(String source, String destinition, int distance) {
		int fare = baseFare + (pricePerKm*distance);
		System.out.println("[SedanCab] Booked from "+source+" to "+destinition);
		System.out.println("[SedanCab] Please Pay: \u20b9"+fare);
	}
	
}

class LuxuryCab implements Cab{
	
	int pricePerKm;
	
	LuxuryCab(){
		pricePerKm = 20;
		System.out.println("[LuxuryCab] Object Created"); 
	}
	
	public void bookCab(String source, String destinition, int distance) {
		int fare = baseFare + (pricePerKm*distance);
		System.out.println("[LuxuryCab] Booked from "+source+" to "+destinition);
		System.out.println("[LuxuryCab] Please Pay: \u20b9"+fare);
	}
	
}


// Factory Design Pattern :)
class CabFactory {
	
	static Cab getCab(int type) {
		Cab cab = null;
		
		if(type == 1) {
			cab = new MiniCab();
		}else if(type == 2) {
			cab = new SedanCab();
		}else if(type == 3) {
			cab = new LuxuryCab();
		}else {
			System.err.println("Invalid Option");
		}
		
		return cab;
	}
	
}

public class Factory {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Cab Booking Application");
		System.out.println("``````````````````````````````````");
		System.out.println("Cab Options: ");
		System.out.println("1: Mini Cab");
		System.out.println("2: Sedab Cab");
		System.out.println("3: Luxury Cab");
		System.out.println("Enter Your Choice: ");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.close();
		
		Cab cab = CabFactory.getCab(choice);
		if(cab!=null)
			cab.bookCab("Home", "Work", 5);
		
	}

}
