import java.util.Scanner;

// By default every class is the child of Object class in Java
//class User extends Object{
class User {
	
}

// Parent Child Relationship -> Inheritance
// it is done using extends keyword
// As a Rule to Inheritance: Reference variable of Parent can refer to the Child Object

public class ObjectClass {

	public static void main(String[] args) {
		
		// Direct Object Construction of User Object
		// reference variable of User can refer to the User Object
		User uRef = new User();
		
		//BUT,
		// Object's reference variable can also refer to the User Object
		Object oRef = new User();
		
		// DownCasting
		//User user = oRef; // error
		User user = (User)oRef; // Ok
		
		// Object is the ROOT CLASS
		// POLYMORPHIC BEHAVIOUR : Object as Parent can refer to different types :)
		Object oRef1 = 10; // Wrapper Class Integer
		Object oRef2 = 2.2;
		Object oRef3 = "This is Really Awesome";
		Object oRef4 = 'A';
		Object oRef5 = new Scanner(System.in);
		Object oRef6 = new HashSet(); // :)

	}

}
