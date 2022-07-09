
public class CompileTimePolymorphism {

	static void login(String email, String password) {
		System.out.println("[LOGIN1] By Email and Password for "+email);
	}
	
	// if you create the same method with same signature it will be an error
	// Re Defining the same function with same signature -> ERROR
	/*static void login(String emailID, String passphrase) {
		System.out.println("[LOGIN] By Email and Password for "+emailID);
	}*/
	
	static void login(String phoneNumber, int otp) {
		System.out.println("[LOGIN2] By Phone and OTP for "+phoneNumber);
	}
	
	static void login(int otp, String phoneNumber) {
		System.out.println("[LOGIN3] By Phone and OTP for "+phoneNumber);
	}
	
	static void login(String googleAccountEmail) {
		System.out.println("[LOGIN4] With Google for "+googleAccountEmail);
	}
	
	// CTP: Method Overloading
	// Create the same Function, i.e. re define the same function with unique arguments
	// This is nothing but more than 1 behavior which we are implementing with same function name
	
	// RULES
	// 1. Function to have same name
	// 2. They will always have different arguments
	//    2.1 increase or decrease arguments while re-defining  | Number of Arguments
	//    2.2 change the data types for arguments 				| Type of Arguments
	//    2.3 interchange the arguments							| Order of Arguments
	
	// Decision to execute the method is taken at compile time by compiler :)
	
	public static void main(String[] args) {
		
		CompileTimePolymorphism.login("john@gamil.com");
		CompileTimePolymorphism.login(3021, "+91 99999 11111");
		CompileTimePolymorphism.login("+91 99999 11111", 1234);
		CompileTimePolymorphism.login("fionna@example.com", "fionna@123");

	}

}







