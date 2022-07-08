import java.util.Scanner;

public class ConditionalConstructs {

	public static void main(String[] args) {
		
		final int HUNGRY = 101;
		final int SIMPLNEW = 201;
		
		int promoCodeByUser = 0;
		double amount = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Order Amount: ");
		amount = scanner.nextDouble();
		
		System.out.println("Enter Promo Code: ");
		promoCodeByUser = scanner.nextInt();
		
		System.out.println("Enter Your Navigation Choice: ");
		int choice = scanner.nextInt();
		
		
		scanner.close();
		
		System.out.println("~~~~~~~~~~~~~");
		
		System.out.println("AMOUNT: \u20b9"+amount);
		System.out.println("PROMO CODE: "+promoCodeByUser);
		
		System.out.println("~~~~~~~~~~~~~");
		System.out.println();
		
		// 1. Simple if/else
		/*if(amount >= 159) {
			System.out.println("You can Apply Promo Code HUNGRY");
		}else {
			System.out.println("You need to add items worth \u20b9"+(159-amount)+" more");
		}*/
		
		// 2. Nested if/else
		/*if(amount >= 159 && promoCodeByUser == HUNGRY) {
			System.out.println("PROMO CODE APPLIED SUCCEEFULLY :)");
			double discount = 0.10 * amount;
			if(discount > 40) {
				discount = 40;
			}
			System.out.println("DISCOUNT: \u20b9"+discount);
			System.out.println("FINAL PAYMENT: \u20b9"+(amount-discount));
		}else {
			System.out.println("Either Amount is Less or Promo Code is Invalid");
		}*/
		
		/*if(promoCodeByUser == HUNGRY) {
			
			if(amount >= 159) {
				
				System.out.println("PROMO CODE HUNGRY APPLIED SUCCEEFULLY :)");
				double discount = 0.10 * amount;
				if(discount > 40) {
					discount = 40;
				}
				System.out.println("DISCOUNT: \u20b9"+discount);
				System.out.println("FINAL PAYMENT: \u20b9"+(amount-discount));
				
			}else {
				System.out.println("You need to add items worth \u20b9"+(159-amount)+" more");
			}
			
		}else {
			System.out.println("Invalid Promo Code, Please Try Again !!");
		}*/
		
		// 3. Ladder if/else
		/*if(promoCodeByUser == HUNGRY) {

			if(amount >= 159) {
				
				System.out.println("PROMO CODE HUNGRY APPLIED SUCCEEFULLY :)");
				double discount = 0.20 * amount;
				if(discount > 100) {
					discount = 100;
				}
				System.out.println("DISCOUNT: \u20b9"+discount);
				System.out.println("FINAL PAYMENT: \u20b9"+(amount-discount));
				
			}else {
				System.out.println("You need to add items worth \u20b9"+(200-amount)+" more");
			}
			
		}else if (promoCodeByUser == SIMPLNEW) {
			if(amount >= 159) {
				
				System.out.println("PROMO CODE SIMPLNEW APPLIED SUCCEEFULLY :)");
				System.out.println("DISCOUNT: \u20b9 40");
				System.out.println("FINAL PAYMENT: \u20b9"+(amount-40));
				
			}else {
				System.out.println("You need to add items worth \u20b9"+(159-amount)+" more");
			}
		}else {
			System.out.println("Invalid Promo Code, Please Try Again !!");
		}*/
		
		switch(promoCodeByUser) {
			
			case HUNGRY:
				if(amount >= 159) {
					
					System.out.println("PROMO CODE HUNGRY APPLIED SUCCEEFULLY :)");
					double discount = 0.20 * amount;
					if(discount > 100) {
						discount = 100;
					}
					System.out.println("DISCOUNT: \u20b9"+discount);
					System.out.println("FINAL PAYMENT: \u20b9"+(amount-discount));
					
				}else {
					System.out.println("You need to add items worth \u20b9"+(200-amount)+" more");
				}
				break;
			
			case SIMPLNEW:
				if(amount >= 159) {
					
					System.out.println("PROMO CODE SIMPLNEW APPLIED SUCCEEFULLY :)");
					System.out.println("DISCOUNT: \u20b9 40");
					System.out.println("FINAL PAYMENT: \u20b9"+(amount-40));
					
				}else {
					System.out.println("You need to add items worth \u20b9"+(159-amount)+" more");
				}
				break;
				
			default:
				System.out.println("Invalid Promo Code, Please Try Again !!");
	
		}
		
		
		// Symbolic Constants
		final int TODAYS_DEALS = 1;
		final int CUSTOMER_SERVICE = 2;
		final int REGISTRY = 3;
		final int GIFT_CARDS = 4;
		final int SELL = 5;
		
		switch(choice) {
			
			case TODAYS_DEALS:
				System.out.println("Navigating to the page: https://www.amazon.com/gp");
				break;
				
			case CUSTOMER_SERVICE:
				System.out.println("Navigating to the page: https://www.amazon.com/gp/help/customer");
				break;	
				
			case REGISTRY:
				System.out.println("Navigating to the page: https://www.amazon.com/registries");
				break;
					
			case GIFT_CARDS:
				System.out.println("Navigating to the page: https://www.amazon.com/gift-cards/");
				break;	
				
			case SELL:
				System.out.println("Navigating to the page: https://www.amazon.com/b");
				break;
				
			default:
				System.out.println("Invalid Choice");
		}
		
		

	}

}
