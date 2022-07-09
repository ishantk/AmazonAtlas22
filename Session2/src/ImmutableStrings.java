
public class ImmutableStrings {

	public static void main(String[] args) {
		
		String s1 = "John, Jennie, Jim, Jack, Joe";
		System.out.println("s1 is: "+s1);
		
		String s2 = s1.toUpperCase();
		System.out.println("s1 now is: "+s1);
		System.out.println("s2 is: "+s2);
		
		// Strings are IMMUTABLE
		// We cannot change them
		// Whenever we do a manipulation operation it will create a new String in the memory
		
		String s3 = s2.toLowerCase();
		System.out.println("s2 now is: "+s2);
		System.out.println("s3 is: "+s3);
		
		String s4 = s1.concat(", dave, ben, rocky");
		System.out.println("s1 is: "+s1);
		System.out.println("s4 is: "+s4);

	}

}
