
public class SelectionSortFlightApp {
	
	static void sortFlights(Flight[] flights, int filterType) {
		
		int size = flights.length;
		
		for(int idx=0; idx<size-1; idx++) {
			
			int minIdx = idx;
			
			// Iterated in the array to find element with min index
			for(int cmpIdx=idx+1; cmpIdx<size; cmpIdx++) {
				
				boolean flag = filterType == 1 ? flights[cmpIdx].duration < flights[minIdx].duration 
											   : filterType == 2 ? flights[cmpIdx].price < flights[minIdx].price : false;
				
				if(flag) {
					minIdx = cmpIdx;
				}
			}
			
			// Swap it with the element in front
			Flight temp = flights[idx];
			flights[idx] = flights[minIdx];
			flights[minIdx] = temp;
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
