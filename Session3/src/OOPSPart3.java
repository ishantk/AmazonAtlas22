class User{
	
	String name;
	String phone;
	String email;
	
	// User Object Has Attribute as Another Object's reference
	// This is known as 1 to 1 Relationship between User and Address
	// i.e. 1 User Has 1 Address
	//Address address;

	
	// 1 to many relationship
	// 1 User can have many Addresses
	Address[] addresses; 

	
	public User() {
		name = "NA";
		phone = "NA";
		email = "NA";
	}
	
	public User(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	/*void setAddress(Address address) {
		this.address = address;
	}*/
	
	void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}
	
	void showUser() {
		System.out.println("User Details: "+name+" "+phone+" "+email);
		//System.out.println("User Address Is: "+address);
		//address.showAddress();
		System.out.println();
		System.out.println("User Address ["+addresses.length+"] Are: "+addresses);
		
		for(Address adrs : addresses) {
			adrs.showAddress();
			System.out.println();
		}
		
	}
	
}

class Address{
	
	String adrsLine;
	int zipCode;
	String city;
	
	public Address() {
		
	}
	
	public Address(String adrsLine, int zipCode, String city) {
		this.adrsLine = adrsLine;
		this.zipCode = zipCode;
		this.city = city;
	}
	
	void showAddress() {
		System.out.println("Address Details: "+adrsLine+" "+zipCode+" "+city);
	}
}

public class OOPSPart3 {

	public static void main(String[] args) {
		
		User user1 = new User("John", "+91 99999 11111", "john@example.com");
		Address address1 = new Address("2144 Redwood Shores", 520001, "Bangalore");
//		Address address2 = new Address("77 Pristine Magnum", 420001, "Hyderabad");
//		Address address3 = new Address("52 Country Homes", 141001, "Ludhiana");
		
		System.out.println("user1 is: "+user1);
		System.out.println("address1 is: "+address1);
		
		//user1.setAddress(address1);
		
		//user1.showUser();
		//address1.showAddress();
		
		Address addresses[] = new Address[3];
		System.out.println("addresses are: "+addresses);
		addresses[0] = address1; // Reference Copy
		addresses[1] = new Address("77 Pristine Magnum", 420001, "Hyderabad");
		addresses[2] = new Address("52 Country Homes", 141001, "Ludhiana");
		
//		for(Address ref : addresses) {
//			System.out.println(ref);
//		}

		user1.setAddresses(addresses);
		System.out.println();
		user1.showUser();
		
	}

}
