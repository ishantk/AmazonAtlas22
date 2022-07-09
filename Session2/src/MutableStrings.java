
public class MutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE
		String str = new String("Java Is ");
		String str1 = str.concat("Awesome");
		
		System.out.println("str is: "+str);
		System.out.println("str1 is: "+str1);
		
		// Mutable String : THREAD-SAFE i.e. use it when working with multiple threads
		StringBuffer buffer = new StringBuffer("Java Is ");
		buffer.append("Really Awesome");
		
		System.out.println("buffer is: "+buffer);
		
		// Mutable String : NOT THREAD-SAFE
		// Hence, it is a bit more faster :)
		StringBuilder builder = new StringBuilder("Java Is ");
		builder.append("Really Cool :)");
		
		System.out.println("builder is: "+builder);
		
		
		/*String s1 = "Hello"; // OK
		StringBuffer s2 = "Hello"; // Error
		StringBuilder s3 = "Hello"; // Error*/
		
		// StringBuffer and StringBuilder only works as Objects :)
		

	}

}
