// 1. Think of an Object
// Object -> OneWayFlightBooking (from, to, departureDate, numOfTravellers, travelClass)

// 2. Create Class
class OneWayFlightBooking{
	
	// Attributes -> Property of Object | They do not belong to class
	//									  As, class itself is representation of Object
	String from;
	String to;
	String departureDate;
	int numOfTravellers;
	String travelClass;
	
	// Constructors: Property of Object and not of class 
	
	// Special Method : Constructor
	// provide default values to attributes inside an object | It initializes the object with default values
	// Create a method which will be of same name as that of class name and no return type.
	OneWayFlightBooking(){
		from = "Bangalore";
		to = "Delhi";
		departureDate = "16th July, 2022";
		numOfTravellers = 1;
		travelClass = "Economy";
		System.out.println("[OneWayFlightBooking] default constructor executed. This is: "+this);
	}
	
	// Parameterized i.e. take inputs
	OneWayFlightBooking(String from, String to, String departureDate, int numOfTravellers, String travelClass){
		// LHS: this.from | Here from is attribute of object
		// RHS: from      | Here from is input parameter of the constructor 
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.numOfTravellers = numOfTravellers;
		this.travelClass = travelClass;
		
		// this is a reference variable which holds the hashcode of the current object
		System.out.println("[OneWayFlightBooking] parameterized constructor executed. This is: "+this);
	}
	
	// Method: Property of Object and not of class
	void showBookingDetails(String message) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(message);
		System.out.println("From: "+from+" To: "+to);
		System.out.println("Departure On: "+departureDate+" For: "+numOfTravellers+" travellers By: "+travelClass);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
	
	void setOneWayFlightBooking(String from, String to, String departureDate, int numOfTravellers, String travelClass){
		// LHS: this.from | Here from is attribute of object
		// RHS: from      | Here from is input parameter of the constructor 
		this.from = from;
		this.to = to;
		this.departureDate = departureDate;
		this.numOfTravellers = numOfTravellers;
		this.travelClass = travelClass;
	}
	
	
}


public class OOPSPart2 {

	public static void main(String[] args) {

		// 3. Using the class, create a real object in memory
		OneWayFlightBooking booking1 = new OneWayFlightBooking(); // Object Construction Statement
		System.out.println("booking1 is: "+booking1); // Give me the HashCode of the OneWayFlightBooking Object in the memory
		
		OneWayFlightBooking booking2 = new OneWayFlightBooking("Chennai", "Hyderabad", "20th July, 2022", 4, "Business");
		System.out.println("booking2 is: "+booking2);
		
		OneWayFlightBooking booking3 = new OneWayFlightBooking("Chandigarh", "Goa", "30th July, 2022", 2, "Economy");
		System.out.println("booking3 is: "+booking3);
		
		
		// Update Operation on Object using a Method
		booking2.setOneWayFlightBooking("Chennai", "Goa", "25th July, 2022", 8, "Economy");
		
		System.out.println();
		
		// Object Operation -> READ
		// Here, we are reading the object without writing any data inside it
		/*System.out.println("Booking1 Details");
		System.out.println("From: "+booking1.from+" To: "+booking1.to);
		System.out.println("Departure On: "+booking1.departureDate+" For: "+booking1.numOfTravellers+" travellers By: "+booking1.travelClass);
		
		System.out.println();
		
		System.out.println("Booking2 Details");
		System.out.println("From: "+booking2.from+" To: "+booking2.to);
		System.out.println("Departure On: "+booking2.departureDate+" For: "+booking2.numOfTravellers+" travellers By: "+booking2.travelClass);
		
		System.out.println();
		
		System.out.println("Booking3 Details");
		System.out.println("From: "+booking3.from+" To: "+booking3.to);
		System.out.println("Departure On: "+booking3.departureDate+" For: "+booking3.numOfTravellers+" travellers By: "+booking3.travelClass);
		*/
		
		// Read Operation on Object using a Method
		booking1.showBookingDetails("Booking1 Details");
		booking2.showBookingDetails("Booking2 Details");
		booking3.showBookingDetails("Booking3 Details");
	}

}
