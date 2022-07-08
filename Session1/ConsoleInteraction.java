import java.util.Scanner; // Scanner is available in JDK to be used for read operations :)

public class ConsoleInteraction {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Java Sessions");
		
		// Create Scanner object by passing System.in to read
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Eneter Your Age: ");
		byte age = scanner.nextByte();
		
		scanner.nextLine(); // do an empty nextLine in case reading strings after numbers :)
		
		System.out.println("Enter Your Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Welcome, "+name+" your age "+age+" is eligible for voting");

		scanner.close(); // close scanner in the end to release memory resources
	}

}
