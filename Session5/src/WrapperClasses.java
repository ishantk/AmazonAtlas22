
public class WrapperClasses {

	public static void main(String[] args) {
		
		// Primitive in Java : Works with Values
		int age = 0;
		
		// Reference Data Type or Wrapper Class for primitive int data type
		Integer ageRef = null;
		
		//Integer iRef = new Integer(10); 	// Boxing
		Integer iRef = Integer.valueOf(10); // Boxing 
		
		char ch = 'A';								// Primitive Type
		Character chRef = Character.valueOf('A'); 	// Reference Type
		
		double d = 2.2;								// Primitive Type
		Double dRef = Double.valueOf(2.2);			// Reference Type
		
		
		// Implicit Usage
		Integer salary = 30000;				// Auto Boxing: no need t0 use any method simply use = operator
		
		String sNumber = "5000";
		Integer iNumber = Integer.parseInt(sNumber);
		System.out.println("iNumber is: "+iNumber);
		
		Integer aRef = age; // BOXING	-> Creating an Integer Object by using primitive
		int a = aRef; 		// UNBOXING	-> Returning the data in Integer object to primitve
	}

}
