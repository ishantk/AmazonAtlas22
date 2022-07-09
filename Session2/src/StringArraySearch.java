import java.util.Scanner;

public class StringArraySearch {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Search Keyword: ");
		String searchKeyword = scanner.nextLine().trim();
		
		// 1. Search by Name
		// 2. Search by Phone
		// 3. Search by anything
		
		scanner.close();
		
		String[][] contactList = {
				{"john","99999 11111"},
				{"fionna","98765 12345"},
				{"dave","99155 77889"},
				{"george", "98728 12345"},
				{"shawn", "90909 20112"},
				{"anna","98765 43212"},
				{"pam","76541 78552"},
				{"kia","87623 12121"},
				{"sam", "76551 67543"},
				{"roy", "65413 67543"}
		};
		
		System.out.println("Filtered Search Records: ");
		
		for(String[] array : contactList) {
			for(String element : array) {
				if(element.contains(searchKeyword)) {
					//System.out.println(element);
					System.out.println("["+array[0]+"\t- "+array[1]+"]");
				}
			}
		}
		
		
	}

}
