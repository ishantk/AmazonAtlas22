import java.util.Arrays;

public class MergeSortApp {

	
	static void merge(int[] array, int left, int middle, int right) {
		
		System.out.println("[merge] left: "+left+" middle: "+middle+" right: "+right);
		
		// Compute Size for Left Array
		int leftSize = middle - left + 1;
		// Compute Size for Right Array
		int rightSize = right - middle;
		
		// Create Left Array
		int[] leftArray = new int[leftSize];
		// Create Right Array
		int[] rightArray = new int[rightSize];
		
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
			
			if(leftArray[idxLeft] <= rightArray[idxRight]) {
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
	static void mergeSort(int[] array, int left, int right) {
		
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

	
	public static void main(String[] args) {
		
		int[] productPrices = {1200, 1100, 3500, 500, 350, 1900};
		System.out.println("[main] Initial Array: "+Arrays.toString(productPrices));
		System.out.println();

		System.out.println("Product Prices Before: ");
		System.out.println(Arrays.toString(productPrices));
		
		
		mergeSort(productPrices, 0, productPrices.length-1);
		
		
		System.out.println("Product Prices After: ");
		System.out.println(Arrays.toString(productPrices));
	}

}
