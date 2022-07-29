// Every class in Java is the Child of Object :)
//class Customer extends Object{
class Customer{
	
	int cid;
	String name;
	String email;
	
	Customer(){
		
	}

	public Customer(int cid, String name, String email) {
		this.cid = cid;
		this.name = name;
		this.email = email;
	}
	
	// Override toString method of Object clas in the Child Customer class : )
	public String toString() {
		return cid+" "+name+" "+email;
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer customer = (Customer)obj;
		return (cid == customer.cid && name.equals(customer.name) && email.equals(customer.email));
	}
	
	@Override
	public int hashCode() {
		System.out.println("HashCode from Parent: "+super.hashCode());
		return cid;
	}
	
}

public class ObjectClassApp {

	public static void main(String[] args) {
		
		Customer c1 = new Customer(101, "John", "john@example.com");
		Customer c2 = new Customer(101, "John", "john@example.com");
		
		System.out.println("c1 is: "+c1);
		System.out.println("c1.toString() is: "+c1.toString());
		System.out.println("c1 class is: "+c1.getClass());
		System.out.println("c1 class is: "+c1.getClass().getSimpleName());
		
		System.out.println("c1 hashCode is: "+c1.hashCode());
		System.out.println("c2 hashCode is: "+c2.hashCode());
		
		if(c1.equals(c2)) {
			System.out.println("c1 is equal to c2");
		}else {
			System.out.println("c1 is not equal to c2");
		}
		
		if(c1 == c2) {
			System.out.println("Customers are Equal");
		}else {
			System.out.println("Customers are Not Equal");
		}

	}

}
