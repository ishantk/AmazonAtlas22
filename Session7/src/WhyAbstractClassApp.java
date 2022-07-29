
abstract class AmazonPayment{
	
	boolean bankStatus = false;
	
	final void pay(int amount) {
		
		System.out.println("[AmazonPayment] Processing Amount: \u20b9"+amount);
		
		if(bankStatus) {
			System.out.println("[AmazonPayment] Amount Paid to Amazon: \u20b9"+amount);
			onPaymentSuccess("Payment Received");
		}else {
			System.err.println("[AmazonPayment] Amount cannot be transacted. Please Pay Later !!");
			onPaymentFailure(101);
		}
	}
	
	abstract void onPaymentSuccess(String message);
	abstract void onPaymentFailure(int errorCode);
}

// We can implement abstraction, but its kind of partial
// Hence, we got interfaces which replaces abstract classes -> Next Session :)
abstract class GooglePayment{
	
	boolean bankStatus = true;
	
	void pay(int amount) {
		
		System.out.println("[AmazonPayment] Processing Amount: \u20b9"+amount);
		
		if(bankStatus) {
			System.out.println("[AmazonPayment] Amount Paid to Amazon: \u20b9"+amount);
		}else {
			System.err.println("[AmazonPayment] Amount cannot be transacted. Please Pay Later !!");
		}
	}
	
}

// Zomato has integrated Amazon Payment :)
class ZomatoPayment extends AmazonPayment{
	
	// Cannot modify the meaning of pay method in Child ZomatoPayment
	/*void pay(int amount) {
		amount += 10;
		System.out.println("[ZomatoPayment] Processing Amount: \u20b9"+amount);
	}*/
	

	void onPaymentSuccess(String message) {
		
		System.out.println("[ZomatoPayment] Message from Amazon Payment: "+message);
		System.out.println("[ZomatoPayment] Payment Successfull. Please Process the Order :) ");
	}

	void onPaymentFailure(int errorCode) {
		System.out.println("[ZomatoPayment] Error Code from Amazon Payment: "+errorCode);
		
		if(errorCode == 101) {
			System.out.println("[ZomatoPayment] Something wrong with Bank Interfaces. Please Try Again Later");
		}else {
			System.out.println("[ZomatoPayment] OOPS ! Something Went Wrong !");
		}
	}
	
}

class ZomatoApp{
	
	void payForOrder(int amount) {
		System.out.println("[ZomatoApp] Payment Process Started....");
		
		ZomatoPayment payment = new ZomatoPayment();
		payment.pay(amount); // this is basically execution of the Parent method :)
	}
	
}


public class WhyAbstractClassApp {

	public static void main(String[] args) {
		
		ZomatoApp app = new ZomatoApp();
		app.payForOrder(3750);

	}

}
