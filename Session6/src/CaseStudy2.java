import java.util.Scanner;

public class CaseStudy2 {

	public static void main(String[] args) {
		
		Product[] products = new Product[5];
		products[0] = new Product("AlphaBounce", "Adidas", 1, 6000);
		products[1] = new Product("Water Bottle", "Hydrate", 1, 2300);
		products[2] = new Product("Cup", "Archies", 1, 500);
		products[3] = new Product("iphone", "Apple", 1, 70000);
		products[4] = new Product("AC", "Samsung", 1, 30000);
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to eCommerce Store");
		System.out.println("1. To Add Product");
		System.out.println("2. To Remove Product");
		System.out.println("3. To Sort Price Low to High");
		System.out.println("4. To Sort Price High to Low");
		System.out.println("5. To Quit");
		
		System.out.println("Enter Your Choice: ");
		int choice = scanner.nextInt();
		
		
		ProductDoublyLinkedList list = new ProductDoublyLinkedList();
		
		do {
		
			switch (choice) {
				case 1:
					
					System.out.println("Enter the Product Index: ");
					int idx = scanner.nextInt();
		
					list.add(products[idx]);
					list.iterateForward();
					break;
					
				case 2: 
					
					break;
					
				case 3: 
					list.sort(1);
					break;
					
				case 4: 
					list.sort(2);
					break;
					
				default:
					System.out.println("Invalid Choice");
			}
		
			System.out.println("Enter Your Choice: ");
			choice = scanner.nextInt();
			
		}while(choice != 5);
		
		scanner.close();

	}

}
