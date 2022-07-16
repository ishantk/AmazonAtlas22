import java.util.Scanner;

public class ShoppingCartCaseStudyApp {

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
		System.out.println("3. To Check Out");
		
		System.out.println("Enter Your Choice: ");
		int choice = scanner.nextInt();
		
		System.out.println("Enter the Product Index: ");
		int idx = scanner.nextInt();
		
		ShoppingCart cart = new ShoppingCart();
		
		switch (choice) {
			case 1: 
				cart.addProduct(products[idx]);
				break;
				
			case 2: 
				cart.removeProduct(products[idx]);
				break;
				
			case 3: 
				cart.checkOut();
				break;
			
			default:
				System.out.println("Invalid Choice");
		}
		
		scanner.close();
		

	}

}
