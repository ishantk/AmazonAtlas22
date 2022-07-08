
public class DataTypes {

	// main method will be executed by the JVM
	// In the RAM, a frame will be created in the stack for main
	public static void main(String[] args) {
	
		System.out.println("Welcome to Primitive Data Types in Java");
		
		// INTEGRAL
		// 1. Create Single Value Container
		byte age = 10;
		// byte -> is a data type which takes 8 bits in memory
		//         it can store only integer data
		//		   2 power 8 -> 256 | 256/2 -> -128 to 0 to 127
		//		   age is name of storage container | identifier, variable
		//		   10 is integral data | literal i.e. the value
		
		// 2. Read Single Value Container
		System.out.println("age is: "+age);
		
		// 3. Update Single Value Container
		age = 20;
		System.out.println("age now is: "+age);
		
		//age = 128; // error
		age = (byte)257; // DOWN CASTING
		System.out.println("age when out of range is: "+age);
		
		short amount = 300; // 16 bits
		int eWallet = 2000; // 32 bits
		long phoneNumber = 9999911111L; // 64 bits
		
		long number1 = 200; // we are not putting L after 200. Why ? Because 200 is a small number and fits in less than 32 bits
		
		// Copy Operation
		// Down Casting -> Only required when a larger container is copied into a smaller container
		int number2 = (int)number1; // number1 is 64 bits of container and number2 is a 32 bits container
		
		byte number3 = 50;
		int number4 = number3; 			// UP CASTING
		byte number5 = (byte)number4;	// DOWN CASTING
		
		
		// FLOATING POINT
		float taxes = 0.18F; // F makes 0.18 as 32 bits // float takes 32 bits in memory
		double amountAfterTaxes = 200.345; // 64 bits in memory
		
		// Characters
		char ch = 'A';
		ch = '@';
		ch = 90; // 90 is ASCII CODE
		System.out.println("ch is: "+ch);
		ch = '\u20b9';
		ch = '\u2605';
		System.out.println("ch now is: "+ch);
		
		char ch1 = '\u0907';
		char ch2 = '\u0936';
		System.out.println("My Name in Hindi is: "+ch1+" "+ch2);
		
		// Logical
		boolean enableGPS = true; //  0 0 0 0  0 0 0 1
		boolean internet = false; //  0 0 0 0  0 0 0 0
		
		// Single value containers are meant to store 1 value only :)
		// you can update them if you wish
		//int ages = 20, 22, 35, 67, 72;
		
		System.out.println("Primtive Data Types Finsihed :)");
	}

}

// 4. Delete Containers -> Automatically once main finishes :)








