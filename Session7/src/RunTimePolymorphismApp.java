import java.util.Scanner;

class Cab{
	
	int baseFare;
	int pricePerKm;
	
	Cab(){
		baseFare = 50;
		pricePerKm = 7;
		System.out.println("[Cab] Object Constructed - Default Constructor");
	}
	
	void bookCab(String source, String destinition, int distance) {
		System.out.println("````````````````````````````````````````");
		System.out.println("[Cab] Booked from "+source+" to "+destinition);
		int fare = baseFare + pricePerKm*distance;
		System.out.println("[Cab] Please Pay \u20b9"+fare);
		System.out.println("````````````````````````````````````````");
		System.out.println();
	}
}


// OLAMiniCab IS-A Cab
class OLAMiniCab extends Cab{
	
	boolean isWaterAvailable;
	boolean isSanitizerAvailable;
	
	OLAMiniCab(){
		isWaterAvailable = true;
		isSanitizerAvailable = true;
		pricePerKm += 1;
		System.out.println("[OLAMiniCab] Object Constructed - Default Constructor");

	}
	
	// ReDefine the same Method, with same signature in the Child
	// Method Overriding
	void bookCab(String source, String destinition, int distance) {
		System.out.println("````````````````````````````````````````");
		System.out.println("[OLAMiniCab] Booked from "+source+" to "+destinition);
		System.out.println("[OLAMiniCab] Water Availability: "+isWaterAvailable);
		System.out.println("[OLAMiniCab] Sanitizer Availability: "+isSanitizerAvailable);
		int fare = baseFare + pricePerKm*distance;
		System.out.println("[OLAMiniCab] Please Pay \u20b9"+fare);
		System.out.println("````````````````````````````````````````");
		System.out.println();
	}
}

class OLASedanCab extends Cab{
	
	boolean isVideosToWatchAvailable;
	
	OLASedanCab(){
		isVideosToWatchAvailable = true;
		baseFare += 20;
		pricePerKm += 5;
		System.out.println("[OLASedanCab] Object Constructed - Default Constructor");

	}
	
	// ReDefine the same Method, with same signature in the Child
	// Method Overriding
	void bookCab(String source, String destinition, int distance) {
		System.out.println("````````````````````````````````````````");
		System.out.println("[OLASedanCab] Booked from "+source+" to "+destinition);
		System.out.println("[OLASedanCab] Videos Availability: "+isVideosToWatchAvailable);
		int fare = baseFare + pricePerKm*distance;
		System.out.println("[OLASedanCab] Please Pay \u20b9"+fare);
		System.out.println("````````````````````````````````````````");
		System.out.println();
	}
}

class OLABike extends Cab{
	
	boolean isRiderHelmetAvailable;
	
	OLABike(){
		isRiderHelmetAvailable = true;
		baseFare -= 15;
		pricePerKm -= 3;
		System.out.println("[OLABike] Object Constructed - Default Constructor");

	}
	
	// ReDefine the same Method, with same signature in the Child
	// Method Overriding
	void bookCab(String source, String destinition, int distance) {
		System.out.println("````````````````````````````````````````");
		System.out.println("[OLABike] Booked from "+source+" to "+destinition);
		System.out.println("[OLABike] Helmet Availability: "+isRiderHelmetAvailable);
		int fare = baseFare + pricePerKm*distance;
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


public class RunTimePolymorphismApp {

	public static void main(String[] args) {
	
		/*Cab cab; 			// Reference variable of Cab
		cab = new Cab(); 	// Create the Object of Cab
		cab.bookCab("Home", "Work", 5);
		
		OLAMiniCab miniCab;
		miniCab = new OLAMiniCab();
		miniCab.bookCab("Home", "Work", 5);*/
		
		/*Cab cab;
		
		cab = new Cab();
		System.out.println("cab is: "+cab);
		cab.bookCab("Home", "Work", 5);
		
		// RULE: Parent's Reference Variable can refer to the Child Object, but vice-versa its an error
		// Reference Variable cab of the Parent Cab is referring to the Child Object i.e. OLAMiniCab
		// Polymorphic Statement
		cab = new OLAMiniCab();
		System.out.println("cab now is: "+cab);
		cab.bookCab("Home", "Work", 5);*/
		
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
