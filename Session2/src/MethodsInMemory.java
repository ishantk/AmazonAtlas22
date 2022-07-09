
public class MethodsInMemory {
	
	
	static void update(int i, int[] array) {
		
		int x = 15;
		
		System.out.println("[update] i is: "+i);
		System.out.println("[update] array is: "+array);
		MethodsInMemory.printArray(array);
		
		// Update Operation on i and array
		i += x;
		array[1] += x;
		
		System.out.println("AFTER UPDATE OPERATION");
		
		System.out.println("[update] i now is: "+i); // 35
		System.out.println("[update] array now is: "+array);
		MethodsInMemory.printArray(array); // idx1: 35
		
	}
	
	static void printArray(int[] array) {
		for(int element : array) {
			System.out.print(element+" ");
		}
		System.out.println();
	}

	// main is a static method -> something to do with class
	// String[] args -> input parameter to the main method which is array of String
	// public -> defines the visibility of the main
	public static void main(String[] args) {
	
		// Create
		int number = 10; 						// Creating primitive type i.e. integer single value storage container
		
		// Create
		int[] numbers = {10, 20, 30, 40, 50};   // Creating reference type i.e. integer array multi value container

		// Print/Read
		System.out.println("[main] number is: "+number);
		System.out.println("[main] numbers are: "+numbers);
		MethodsInMemory.printArray(numbers);
		
		// Create + Copy
		int age = number; 		// VALUE COPY
		// Create + Copy
		int[] data = numbers; 	// REFERENCE COPY
		
		// Print/Read
		System.out.println("[main] age is: "+age);
		System.out.println("[main] data is: "+data);
		MethodsInMemory.printArray(numbers);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Going to Perform Update on Age and Data");
		System.out.println("After Update: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// Update
		age += 10; // -> new value of age is now 20
		data[3] += 10;
		
		System.out.println("[main] number is: "+number);
		System.out.println("[main] age is: "+age);
		
		
		System.out.println("[main] numbers are: "+numbers);
		MethodsInMemory.printArray(numbers);
		
		System.out.println("[main] data is: "+data);
		MethodsInMemory.printArray(numbers);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Going to Execute Update method on Age and Data");
		System.out.println("After Update: ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		MethodsInMemory.update(age, data); // age -> call by value | data -> call by reference :)
		
		System.out.println("[main] number finaly is: "+number);
		System.out.println("[main] age finally is: "+age);
		
		
		System.out.println("[main] numbers finally are: "+numbers);
		MethodsInMemory.printArray(numbers);
		
		System.out.println("[main] data finally is: "+data);
		MethodsInMemory.printArray(numbers);
		
		
	}

}
