
public class OneDimensionalArrays {

	public static void main(String[] args) {
	
		// Implicit Array Creation
		// 				0    1   2   3   4
		int array1[] = {10, 20, 30, 40, 50};
		//              0    1   2   3   4
		int[] array2 = {10, 20, 30, 40, 50};
		
		// Explicit Array Creation
		int array3[] = new int[] {10, 20, 30, 40, 50};
		int[] array4 = new int[] {10, 20, 30, 40, 50};
		
		// Compile Time and Run Time ?
		
		// Compile Time | Memory Allocation for Containers
		// When we compile the Java Program, Compiler makes notes for the memory of certain containers
		// eg: int i = 10; compiler will make note, when program will execute i will take 32 bits of memory :)
		
		// Run Time | Dynamic Memory Allocation for Containers 
		// When we compile the Java Program, Compiler makes notes for the memory of containers where it is not known how much memory will be required ?
		// we here use new operator to tell compiler, please do not fix memory and when program will run, it will dynamically see how much memory is required

		// Arrays in Java will get memory at run time
		System.out.println("array1 is: "+array1);
		System.out.println("array2 is: "+array2);
		System.out.println("array3 is: "+array3);
		System.out.println("array4 is: "+array4);
		
		// Since, array1, array2, array3, array contains hashcode to the array and not the data
		// Hence, array1, array2, array3, array4 are known as Reference Variables
		
		int a1[], a2[]; // a1 and a2 are reference variables
		int[] a3, a4;
		
		// creating array with size and let the data be added later
		a1 = new int[5];  // all elements will be 0
		a2 = new int[10]; // all elements will be 0
		a3 = new int[15]; // all elements will be 0
		a4 = new int[20]; // all elements will be 0
		
		a1[1] = 11;
		a1[3] = 20;
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		
		for(int idx=0;idx<array1.length;idx++) {
			System.out.println("array1["+idx+"] is: "+array1[idx]);
		}
		
		System.out.println();
		
		for(int idx=0;idx<a1.length;idx++) {
			System.out.println("a1["+idx+"] is: "+a1[idx]);
		}

		System.out.println();
		
		a4[10] = 1;
		
		// Enhanced For Loop | Read only loop for Arrays as of now :)
		for(int anyName : a4) {
			System.out.print(anyName+" ");
		}
		
	}

}







