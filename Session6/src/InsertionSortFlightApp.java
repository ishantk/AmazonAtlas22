
public class InsertionSortFlightApp {

	static void sortFlights(Flight[] flights, int filterType) {
		
		int size = flights.length; // 6
		
		for(int idx=1; idx<size; idx++) { // 1 to 5
			
			Flight key = flights[idx];		
			int cmpIdx = idx-1;    				 
			
			boolean flag = false;
			
			if(filterType == 1) {
				// Moving to the Left of Array :)
				while(cmpIdx>=0 && key.duration<flights[cmpIdx].duration) {
					flights[cmpIdx+1] = flights[cmpIdx];   
					cmpIdx--;
				}
				
				flights[cmpIdx+1] = key;
				
			}else {
				// Moving to the Left of Array :)
				while(cmpIdx>=0 && key.price<flights[cmpIdx].price) {
					flights[cmpIdx+1] = flights[cmpIdx];   
					cmpIdx--;
				}
				
				flights[cmpIdx+1] = key;
			}
		}
		
	}
	
	static void printFlights(Flight[] flights) {
		for(Flight flight : flights) {
			flight.showFlight();
		}
	}
	
	public static void main(String[] args) {
		
		Flight[] flights = new Flight[5];
		flights[0] = new Flight("Indigo", "New Delhi", "Bangalore", 6.5, 3000);
		flights[1] = new Flight("Spice Jet", "New Delhi", "Bangalore", 3.5, 4000);
		flights[2] = new Flight("Vistara", "New Delhi", "Bangalore", 2.5, 3700);
		flights[3] = new Flight("Indigo", "New Delhi", "Bangalore", 1.35, 12000);
		flights[4] = new Flight("Indigo", "New Delhi", "Bangalore", 4.5, 6000);
		
		System.out.println("FLIGHTS BEFORE");
		System.out.println("^^^^^^^^^^^^^^");
		printFlights(flights);
		
		//sortFlights(flights, 1); // filterType: 1 means based on duration
		sortFlights(flights, 2); // filterType: 1 means based on price
		
		System.out.println("FLIGHTS AFTER");
		System.out.println("^^^^^^^^^^^^^");
		printFlights(flights);
		
	}

}
