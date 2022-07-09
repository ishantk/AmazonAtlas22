import java.util.Scanner;

public class PromoCodeMethods {

	// Accessible by Class Name directly :)
	static void applyPromoCode(int promoCodeByUser, double amount) {
		
		final int HUNGRY = 101;
		final int SIMPLNEW = 201;
		
		
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
	
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Promo Code: ");
		int promoCode = scanner.nextInt();
		
		System.out.println("Enter Amount: ");
		double amount = scanner.nextDouble();
		
		scanner.close();
		
		PromoCodeMethods.applyPromoCode(promoCode, amount);
		
		
	}

}




