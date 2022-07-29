import java.util.Scanner;

class PaymentMethod{
	
	PaymentMethod(){
		System.out.println("[PaymentMethod] Object Constructed");
	}
	
	void pay(int amount) {
		System.out.println("[PaymentMethod] Processing Payment for Amount: \u20b9"+amount);
	}

}

class PayByDebitCard extends PaymentMethod{
	
	PayByDebitCard(){
		System.out.println("[PayByDebitCard] Object Constructed");
	}
	
	void getDetailsForDebitCard(String cardNumber, String expiryDate, int cvv) {
		System.out.println("[PayByDebitCard]: Get Details for Debit Card: "+cardNumber);
	}
	
	void pay(int amount) {
		getDetailsForDebitCard("1234 56789 0987 6543", "07/23", 112);
		System.out.println("[PayByDebitCard] Processing Payment for Amount: \u20b9"+amount);
	}
}

class PayByNetBanking extends PaymentMethod{
	
	PayByNetBanking(){
		System.out.println("[PayByNetBanking] Object Constructed");
	}
	
	void getDetailsForNetBanking(String username, String password) {
		System.out.println("[PayByNetBanking]: Get Details for Net Banking: "+username);
	}
	
	void pay(int amount) {
		getDetailsForNetBanking("john@sbi.co.in", "john@banking#123");
		System.out.println("[PayByNetBanking] Processing Payment for Amount: \u20b9"+amount);
	}
}

class PayByUPI extends PaymentMethod{
	
	PayByUPI(){
		System.out.println("[PayByUPI] Object Constructed");
	}
	
	void getDetailsForUPI(String upiHandler) {
		System.out.println("[PayByUPI]: Get Details for UPI: "+upiHandler);
	}
	
	void pay(int amount) {
		getDetailsForUPI("9911223344@apay.in");
		System.out.println("[PayByUPI] Processing Payment for Amount: \u20b9"+amount);
	}
}

class AmazonPay{
	
	PaymentMethod selectPaymentMethod(int option) {
		
		PaymentMethod method = null;
		
		if(option == 1) {
			method = new PayByDebitCard();
		}else if(option == 2) {
			method = new PayByNetBanking();
		}else if(option == 3) {
			method = new PayByUPI();
		}else {
			System.err.println("Select the Payment Method First");
		}
		
		
		return method;
		
	}
	
}

public class PracticalExercise2 {

	public static void main(String[] args) {
		
		AmazonPay pay = new AmazonPay();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1: DEBIT CARD");
		System.out.println("2: NET BANKING");
		System.out.println("3: UPI");
		System.out.println("Select the Option: (1-3): ");
		int option = scanner.nextInt();
		scanner.close();
		
		PaymentMethod method = pay.selectPaymentMethod(option);
		if(method != null) {
			method.pay(1000);
		}
		
		

	}

}
