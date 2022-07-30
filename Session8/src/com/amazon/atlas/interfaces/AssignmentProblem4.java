package com.amazon.atlas.interfaces;

import java.util.Scanner;

interface Cab{
	
	int baseFare=50;
	int pricePerKm=7;
	
	void bookCab(String source, String destinition, int distance);
}


// OLAMiniCab IS-A Cab
class OLAMiniCab implements Cab{
	
	boolean isWaterAvailable;
	boolean isSanitizerAvailable;
	
	OLAMiniCab(){
		isWaterAvailable = true;
		isSanitizerAvailable = true;
		System.out.println("[OLAMiniCab] Object Constructed - Default Constructor");

	}
	
	// ReDefine the same Method, with same signature in the Child
	// Method Overriding
	public void bookCab(String source, String destinition, int distance) {
		System.out.println("````````````````````````````````````````");
		System.out.println("[OLAMiniCab] Booked from "+source+" to "+destinition);
		System.out.println("[OLAMiniCab] Water Availability: "+isWaterAvailable);
		System.out.println("[OLAMiniCab] Sanitizer Availability: "+isSanitizerAvailable);
		int fare = baseFare + (pricePerKm+1)*distance;
		System.out.println("[OLAMiniCab] Please Pay \u20b9"+fare);
		System.out.println("````````````````````````````````````````");
		System.out.println();
	}
}

class OLASedanCab implements Cab{
	
	boolean isVideosToWatchAvailable;
	
	OLASedanCab(){
		isVideosToWatchAvailable = true;
		System.out.println("[OLASedanCab] Object Constructed - Default Constructor");

	}
	
	// ReDefine the same Method, with same signature in the Child
	// Method Overriding
	public void bookCab(String source, String destinition, int distance) {
		System.out.println("````````````````````````````````````````");
		System.out.println("[OLASedanCab] Booked from "+source+" to "+destinition);
		System.out.println("[OLASedanCab] Videos Availability: "+isVideosToWatchAvailable);
		int fare = (baseFare+20) + (pricePerKm+5)*distance;
		System.out.println("[OLASedanCab] Please Pay \u20b9"+fare);
		System.out.println("````````````````````````````````````````");
		System.out.println();
	}
}

class OLABike implements Cab{
	
	boolean isRiderHelmetAvailable;
	
	OLABike(){
		isRiderHelmetAvailable = true;
		System.out.println("[OLABike] Object Constructed - Default Constructor");

	}
	
	// ReDefine the same Method, with same signature in the Child
	// Method Overriding
	public void bookCab(String source, String destinition, int distance) {
		System.out.println("````````````````````````````````````````");
		System.out.println("[OLABike] Booked from "+source+" to "+destinition);
		System.out.println("[OLABike] Helmet Availability: "+isRiderHelmetAvailable);
		int fare = (baseFare-15) + (pricePerKm-3)*distance;
		System.out.println("[OLABike] Please Pay \u20b9"+fare);
		System.out.println("````````````````````````````````````````");
		System.out.println();
	}
}

// Hierarchy
// Parent: 		Cab
// Children:	OlaMiniCab, OlaSedanCab, OlaBike 

class OLAApp{
	
	Cab selectCab(int option) {
		
		// Reference Variable of Cab interface can refer to any object of the class which implements it
		Cab cab = null;
		
		if(option == 1) {
			cab = new OLAMiniCab();
		}else if(option == 2) {
			cab = new OLASedanCab();
		}else if(option == 3) {
			cab = new OLABike();
		}else {
			System.err.println("Select the Cab First");
		}
		
		return cab;
	}
}


public class AssignmentProblem4 {

	public static void main(String[] args) {
		
		OLAApp app = new OLAApp();

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1: MINI CAB");
		System.out.println("2: SEDAN CAB");
		System.out.println("3: BIKE");
		System.out.println("Select the Option: (1-3): ");
		int option = scanner.nextInt();
		scanner.close();
		
		Cab cab = app.selectCab(option);
		if(cab != null) {
			cab.bookCab("Home", "Office", 5);
		}

	}

}
