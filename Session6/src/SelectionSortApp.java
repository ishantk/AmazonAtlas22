
public class SelectionSortApp {

	static void sortArray(int[] array) {
		 
		int size = array.length;
		
		for(int idx=0; idx<size-1; idx++) {
			
			int minIdx = idx;
			
			// Iterated in the array to find element with min index
			for(int cmpIdx=idx+1; cmpIdx<size; cmpIdx++) {
				if(array[cmpIdx] < array[minIdx]) {
					minIdx = cmpIdx;
				}
			}
			
			// Swap it with the element in front
			int temp = array[idx];
			array[idx] = array[minIdx];
			array[minIdx] = temp;
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
		
		System.out.println("[SELECTION SORT]");
		System.out.println();
		
		int[] productPrices = {1200, 1100, 3500, 500, 350, 1900};
		
		System.out.println("Product Prices Before: ");
		printArray(productPrices);
		
		sortArray(productPrices);
		
		System.out.println("Product Prices After: ");
		printArray(productPrices);

	}

}
