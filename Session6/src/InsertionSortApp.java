
public class InsertionSortApp {

	static void sortArray(int[] array) {
		
		int size = array.length; // 6
		
		for(int idx=1; idx<size; idx++) { // 1 to 5
			
			int key = array[idx];	// for idx:1 -> key: 1100 	| idx:2 -> key: 3500	
			int cmpIdx = idx-1;    	// for idx: 1 -> cmpIdx :0  | idx:2 -> cmpIdx: 1 
			
			// Moving to the Left of Array :)
			while(cmpIdx>=0 && key<array[cmpIdx]) {
				array[cmpIdx+1] = array[cmpIdx];   // for idx:1 and cmpIdx:0 | 1200 1200 3500 500 350 1900
				cmpIdx--;
			}
			
			array[cmpIdx+1] = key;				   // for idx:1 we substitute key 1100 to 0 the index
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
