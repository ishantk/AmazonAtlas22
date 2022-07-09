import java.util.Scanner;

public class StringSearchMethods {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Learner Registration");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("Enter Email: ");
		String email = scanner.nextLine().trim();
		
		System.out.println("Enter Password: ");
		String password = scanner.nextLine().trim();
		
		System.out.println("Enter Search Keyword: ");
		String searchKeyword = scanner.nextLine().trim();
		
		scanner.close();
		
		// Before we register users, we should always validate the data :)
		if(email.contains("@") && email.endsWith(".com")) {
			System.out.println("Valid Email");
			System.out.println("We will register you shortly "+email);
		}else {
			System.out.println("Invalid Email "+email);
		}
		
		if(password.length()>5) {
			System.out.println("Valid Password");
		}else {
			System.out.println("Password must be 6 characters long");
		}
		
		String[] contacts = {
				"99999 11111",
				"98765 12345",
				"99155 77889",
				"98728 12345",
				"90909 20112",
				"98765 43212",
				"76541 78552",
				"87623 12121",
				"76551 67543"
		};
		
		System.out.println("Filtering the Search Contacts "+contacts.length);
		for(String phone : contacts) {
			//if(phone.contains(searchKeyword)) {
			if(phone.startsWith(searchKeyword)) {
				System.out.println(phone);
			}
		}

	}

}
