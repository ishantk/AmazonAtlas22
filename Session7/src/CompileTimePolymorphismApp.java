
class Authenitcation{
	
	// CONSTRUCTOR OVERLOADING: Same Constructor with different SIGNATURE
	public Authenitcation() {
		System.out.println("[Authenitcation] [Default Constructor]");
	}
	
	public Authenitcation(String email, String password) {
		System.out.println("[Authenitcation] [Parameterized Constructor] Logging in Using the email "+email+" with a password");
	}
	
	
	// METHOD OVERLOADING: Same Method with different SIGNATURE
	void login(String email, String password) {
		System.out.println("[Authenitcation] [login] Logging in Using the email "+email+" with a password");
	}
	
	void login(String phone, int otp) {
		System.out.println("[Authenitcation] [login] Logging in Using the phone number "+phone+" with an OTP");
	}
	
	void login(String facebookID) {
		System.out.println("[Authenitcation] [login] Logging in Using FaceBook "+facebookID);
	}
	
}

public class CompileTimePolymorphismApp {

	public static void main(String[] args) {
		
		Authenitcation auth1 = new Authenitcation();
		Authenitcation auth2 = new Authenitcation("fionna@example.com", "fionna123");
		
		System.out.println();
		auth1.login("+91 99999 11111", 302765);
		auth1.login("john@example.com", "john@123");
		auth1.login("john@fb.com");

	}

}
