
public class StringSyntaxes {

	public static void main(String[] args) {
		
		// Interned Strings
		// s1 and s2 are reference variables which are holding the reference to literal Hello
		String s1 = "Hello";
		String s2 = "HeLLo";
				
		// Object Strings
		// We can use new operator and create the strings in Java
		String s3 = new String("HellO");
		String s4 = new String("Hello");
		
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		System.out.println("s3 is: "+s3);
		System.out.println("s4 is: "+s4);
		
		// s1, s2, s3 and s4 are Reference Variables :)
		
		System.out.println("s1.toString() is: "+s1.toString());
		System.out.println("s2.toString() is: "+s2.toString());
		System.out.println("s3.toString() is: "+s3.toString());
		System.out.println("s4.toString() is: "+s4.toString());
		
		// toString() gets executed automatically when we print the reference variable for String
		// We do not see the memory hashcodes and we see the content i.e. data directly :)
		
		// == compares not the content bu the reference variables data i.e. memory hashcodes :)
		if(s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		
		if(s3 == s4) {
			System.out.println("s3 == s4");
		}else {
			System.out.println("s3 != s4");
		}
		
		if(s1 == s3) {
			System.out.println("s1 == s3");
		}else {
			System.out.println("s1 != s3");
		}
		
		System.out.println("~~~~~~~~~~~~");
		
		//if(s1.equals(s2)) {
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 equals s2");
		}else {
			System.out.println("s1 not equals s2");
		}
		
		//if(s3.equals(s4)) {
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println("s3 equals s4");
		}else {
			System.out.println("s3 not equals s4");
		}
		
		//if(s1.equals(s3)) {
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("s1 equals s3");
		}else {
			System.out.println("s1 not equals s3");
		}
		
		//if(s2.compareTo(s4) == 0) {
		if(s2.compareToIgnoreCase(s4) == 0) {
			System.out.println("s2 is compared to s4");
		}else {
			System.out.println("s2 is not compared to s4");
		}

	}

}
