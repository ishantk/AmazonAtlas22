// Single Level
class AmazonUser{
	
	String name;
	String email;
	String phoneNumber;
	
	AmazonUser(){
		name = "";
		email = "";
		phoneNumber = "";
		System.out.println("[AmazonUser] Object Constructed - Default Constructor");
	}
	
	AmazonUser(String name, String email, String phoneNumber) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		System.out.println("[AmazonUser] Object Constructed - Parameterized Constructor");
	}
	
	void show() {
		System.out.println("[AmazonUser] Details: "+name+" "+email+" "+phoneNumber);
	}
	
}

// AmazonPrimeUser is the Child and AmazonUser is the Parent
// Hence, we can say -> AmazonPrimceUser IS-AN AmazonUser | INHERITANCE
//RULES:
//1. To inherit, we need to use keyword extends
//2. Before the Object of AmazonPrimeUser, AmazonUser's Object will be constructed in the memory :)
//3. Child (AmazonPrimeUser) can access anything in Parent (AmazonUser) other than private, IFF Child does not have it :)
//	  if child has its property, then it will access its own property :)
//4. The Parent Object will always be constructed using the default constructor, automatically
class AmazonPrimeUser extends AmazonUser{
	
	boolean isPrime;
	int freeDeliveries;
	boolean videoAccess;
	boolean musicAccess;
	
	AmazonPrimeUser(){
		isPrime = true;
		freeDeliveries = 0;
		videoAccess = false;
		musicAccess = false;
		System.out.println("[AmazonPrimeUser] Object Constructed - Default Constructor");

	}
	
	AmazonPrimeUser(boolean isPrime, int freeDeliveries, boolean videoAccess, boolean musicAccess) {
		this.isPrime = isPrime;
		this.freeDeliveries = freeDeliveries;
		this.videoAccess = videoAccess;
		this.musicAccess = musicAccess;
		System.out.println("[AmazonPrimeUser] Object Constructed - Parameterized Constructor");

	}
	
	AmazonPrimeUser(String name, String email, String phoneNumber, boolean isPrime, int freeDeliveries, boolean videoAccess, boolean musicAccess) {

		// Let the Parent Object be constructed with Parameterized Constructor :)
		super(name, email, phoneNumber);
		
		this.isPrime = isPrime;
		this.freeDeliveries = freeDeliveries;
		this.videoAccess = videoAccess;
		this.musicAccess = musicAccess;
		
		System.out.println("[AmazonPrimeUser] Object Constructed - Parameterized Constructor");

	}
	
	void show() {
		//System.out.println("[AmazonPrimeUser] Details: "+name+" "+email+" "+phoneNumber);
		super.show();
		System.out.println("[AmazonPrimeUser] Details: "+isPrime+" "+freeDeliveries+" "+videoAccess+" "+musicAccess);
	}
	
}


public class WhyInheritanceApp {

	public static void main(String[] args) {
		

		//AmazonUser user = new AmazonUser("Dave", "dave@example.com", "+91 99999 11111");
		//user.show();
		
		//AmazonPrimeUser primeUser = new AmazonPrimeUser();
		//AmazonPrimeUser primeUser = new AmazonPrimeUser(true, 10, true, true);
		AmazonPrimeUser primeUser = new AmazonPrimeUser("John", "john@example.com", "+91 99999 11111", true, 10, true, true);
		primeUser.show();
	}

}
