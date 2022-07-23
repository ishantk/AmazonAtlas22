
public class BubbleSortApp {
	
	static void sortArray(int[] array) {
		int size = array.length; // 6
		
		// Loop runs n times :) where n is size of array (6 in our case)
		// from 0 to n-1 (0 to 5)
		for(int idx=0;idx<size-1;idx++) {
			// for idx: 0, cmpIdx: 6-0-1 => 5 | cmpIdx : 0, 1, 2, 3, 4
			// for idx: 1, cmpIdx: 6-1-1 => 4 | cmpIdx : 0, 1, 2, 3
			// for idx: 2, cmpIdx: 6-2-1 => 3 | cmpIdx : 0, 1, 2
			// .....
			for(int cmpIdx=0; cmpIdx<size-idx-1; cmpIdx++) {
				if(array[cmpIdx] > array[cmpIdx+1]) {
					// Do a swapping
					int temp = array[cmpIdx];
					array[cmpIdx] = array[cmpIdx+1];
					array[cmpIdx+1] = temp;
				}
			}
		}
	}

	static void printArray(int[] array) {
		System.out.print("[");
		for(int element : array) {
			System.out.print(element+",");
		}
		System.out.println("]");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] productPrices = {1200, 1100, 3500, 500, 350, 1900};
		
		System.out.println("Product Prices Before: ");
		printArray(productPrices);
		
		sortArray(productPrices);
		
		System.out.println("Product Prices After: ");
		printArray(productPrices);
	}

}
