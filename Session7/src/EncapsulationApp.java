class User{
	
	// Attributes of User Object
	String name;
	private String email; // add a layer of security -> i.e. attribute is now not visible outside the boundary of class
	String phone;
	
	// To initialize the User Objects
	User(){
		this("NA", "NA", "NA");
	}

	User(String name, String email, String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	
	boolean isValidEmail(String email) {
		return (!email.isEmpty() && email.contains("@") && email.endsWith(".com"));
	}
	
	// To Update User Object
	void setUser(String name, String email, String phone) {
		if(name.length() != 0) {
			this.name = name;
		}else {
			System.out.println("Name Missing. Please Enter Again...");
		}
		
		if(isValidEmail(email)) {
			this.email = email;
		}else {
			System.out.println("Incorret Email. Please Enter Again...");
		}
		
		
		if(phone.length() >= 10) {
			this.phone = phone;
		}else {
			System.out.println("Incorret Phone Number. Please Enter Again...");
		}
	}
	
	// To show User Object
	void showUser() {
		System.out.println("Name: "+name+" Phone: "+phone+" Email: "+email);
	}
	
	// SETTER METHOD
	void setEmail(String email) {

		if(isValidEmail(email)) {
			this.email = email;
		}else {
			System.err.println("Incorret Email "+email+". Please Enter Again...");
		}
	}
	
	// GETTER
	String getEmail() {
		return email;
	}
	
}

// Encapsulation -> Marking the data i.e. attributes of an object to go as private
//					this hides data of an object to be accessed directly :)

public class EncapsulationApp {

	public static void main(String[] args) {

		User user1 = new User();
		User user2 = new User("John", "john@example.com", "+91 99999 11111");
		
		System.out.println("user1 is: "+user1);
		System.out.println("user2 is: "+user2);
		
		user1.setUser("Fionna", "bye", "+91 99999 34343");
		
		// With Object's Reference Variable, you are able to access the attribute directly :)
		//user1.email = "haha"; // ERROR :)
		
		user1.setEmail("haha");
		
		System.out.println("user1 email is: "+user1.getEmail());
		
		user1.showUser();
		user2.showUser();

	}

}
