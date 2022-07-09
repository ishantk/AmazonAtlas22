
public class StringBuiltInMethods {

	public static void main(String[] args) {
		
		String names = "john, jennie, jim, jack, joe";
		System.out.println("names is: "+names);
		
		System.out.println("Length: "+names.length());
		
		char[] chrArr = names.toCharArray();
		int count = 0;
		for(char ch : chrArr) {
			if(ch == ',') {
				count++;
			}
		}
		System.out.println("Total , are: "+count);
		
		int idx1 = names.indexOf(','); // 4
		int idx2 = names.indexOf('i'); // 10
		int idx3 = names.lastIndexOf('o'); // 26
		
		int idx4 = names.indexOf("jennie");
		
		System.out.println("idx1: "+idx1);
		System.out.println("idx2: "+idx2);
		System.out.println("idx3: "+idx3);
		System.out.println("idx4: "+idx4);
		
		//String name = names.substring(6);
		String name = names.substring(6, 12);
		System.out.println("name is: "+name);
		
		char ch1 = names.charAt(1);
		char ch2 = names.charAt(names.length()-1);
		System.out.println("ch1: "+ch1+"  "+ch2);

	}

}
