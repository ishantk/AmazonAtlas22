import java.util.Arrays;

public class QuickSortStringsApp {

	// Method which returns back the position of the pivot
	static int partition(String[] array, int low, int high) {
		
		// Initial Data: low: 0, high: 5
		
		// let us assume the rightmost element to be the pivot
		String pivot = array[high]; // pivot: 1900
		
		// let us assume the greater element be at position low-1
		int geIdx = low - 1;  // -1
		
		// Iterate in the array and compare each element with pivot
		for(int idx=low; idx<high; idx++) { // 0 to 5
			
			if(array[idx].compareTo(pivot) < 0) { // 0: 1200 with 1900 | 1: 1100 with 1900
				
				// for element smaller than the pivot, increment the geIdx
				// swap it with a greater element
				geIdx++; // 0
				
				
				// Swapping the elements
				String temp = array[geIdx];
				array[geIdx] = array[idx];
				array[idx] = temp;
				
			}
		}
		
		// Swap the pivot element with position greater as specified by geIdx
		String temp = array[geIdx+1];
		array[geIdx+1] = array[high];
		array[high] = temp;
		
		// return the final position of the pivot, where exactly partitioning is done
		return (geIdx+1);
		
	}

	static void quickSort(String[] array, int low, int high) {
		
		if(low < high) {
			// Get the element in array which will serve as pivot
			int pIdx = partition(array, low, high);
			
			// recursive call to the left of pivot
			quickSort(array, low, pIdx-1);
			
			// recursive call to the right of pivot
			quickSort(array, pIdx+1, high);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("QUICK SORT ALOGO");
		System.out.println("````````````````");
		System.out.println();
		
		String[] contacts = {"john", "fionna", "anna", "jennie", "sia", "kim"};
		System.out.println("[main] Initial Array: "+Arrays.toString(contacts));
		System.out.println();

		System.out.println("Contact Names Before: ");
		System.out.println(Arrays.toString(contacts));
		
		
		quickSort(contacts, 0, contacts.length-1);
		System.out.println();
		
		System.out.println("Contact Names After: ");
		System.out.println(Arrays.toString(contacts));

	}
}
