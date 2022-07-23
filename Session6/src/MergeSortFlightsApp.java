
public class MergeSortFlightsApp {
	
	static void merge(Flight[] array, int left, int middle, int right) {
		
		System.out.println("[merge] left: "+left+" middle: "+middle+" right: "+right);
		
		// Compute Size for Left Array
		int leftSize = middle - left + 1;
		// Compute Size for Right Array
		int rightSize = right - middle;
		
		// Create Left Array
		Flight[] leftArray = new Flight[leftSize];
		// Create Right Array
		Flight[] rightArray = new Flight[rightSize];
		
		// Add Data into Left Array
		for(int idx=0;idx<leftSize;idx++) {
			leftArray[idx] = array[left+idx];		
		}
		
		// Add Data into Right Array
		for(int idx=0;idx<rightSize;idx++) {
			rightArray[idx] = array[middle+1+idx];		
		}
		
		// Compare Data in Arrays and Swap them to correct positions
		
		int idxLeft=0, idxRight=0;
		int idx = left;
		
		while(idxLeft<leftSize && idxRight<rightSize) {
			
			if(leftArray[idxLeft].duration <= rightArray[idxRight].duration) {
				array[idx] = leftArray[idxLeft];
				idxLeft++;
			}else {
				array[idx] = rightArray[idxRight];
				idxRight++;
			}
			idx++;
		}
		
		// Copy Elements in Left Array
		while(idxLeft < leftSize) {
			array[idx] = leftArray[idxLeft];
			idxLeft++;
			idx++;
		}
		
		// Copy Elements in Right Array
		while(idxRight < rightSize) {
			array[idx] = rightArray[idxRight];
			idxRight++;
			idx++;		
		}
		
	}
	
	// Divide the Array till Individual Elements
	static void mergeSort(Flight[] array, int left, int right) {
		
		if(left < right) {
			
			System.out.println("[mergeSort] left: "+left+" right: "+right);

			for(int idx=left;idx<=right;idx++) {
				System.out.print(array[idx]+" ");
			}
			System.out.println();
			
			int middle = (left+right)/2;
			System.out.println("[mergeSort] middle: "+middle);
			System.out.println("`````````````````````````````");
			System.out.println();
			
			mergeSort(array, left, middle); 		// Dividing the Array in the LEFT => Left Sub Arrays
			mergeSort(array, middle+1, right);		// Dividing the Array in the RIGHT => Right Sub Arrays
		
			merge(array, left, middle, right);
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
		
		mergeSort(flights,0, flights.length-1); // filterType: 1 means based on duration
		
		System.out.println("FLIGHTS AFTER");
		System.out.println("^^^^^^^^^^^^^");
		printFlights(flights);
		
	}

}
