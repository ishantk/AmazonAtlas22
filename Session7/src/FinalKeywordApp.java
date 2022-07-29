
final class CA{
	
	final void fun() {
		System.out.println("Fun is Learning Java");
	}
}

class CB{ //extends CA{ -> Cannot extend if the class CA is final :)
	
	// Cannot Override the method in Child as it is marked as final in Parent :)
	/*void fun() {
		System.out.println("Fun is Learning Python");
	}*/
	
}

public class FinalKeywordApp {

	public static void main(String[] args) {
		
		int age = 10;
		age = 20;
		
		final int errorCode = 101;
		// errorCode = 201; // ERROR -> You cannot modify the value inside a final variable :)

	}

}
