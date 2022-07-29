import java.util.Scanner;

/*class ServicePayment{
	
	ServicePayment(){
		System.out.println("[ServicePayment] Object Constructed");
	}
	
	void payForService(int amount) {
		System.out.println("[ServicePayment] Processing payment for Amount \u20b0"+amount);
	}
	
}*/

// For which you cannot create objects as a developer
// We can create abstract methods inside the Absract Class
abstract class ServicePayment{
	
	ServicePayment(){
		System.out.println("[ServicePayment] Object Constructed");
	}
	
	// abstract method has no definition
	// We will create a RULE
	// If any class inherits the ServicePayment class, the child class must define the method payForService 
	abstract void payForService(int amount);
	
	void welcome() {
		System.out.println("Welcome to Service :)");
	}
	
}

class MobilePayment extends ServicePayment{
	
	MobilePayment(){
		System.out.println("[MobilePayment] Object Constructed");
	}
	
	void payForService(int amount) {
		welcome();
		System.out.println("[MobilePayment] Enter Carrier");
		System.out.println("[MobilePayment] Enter Phone Number");
		System.out.println("[MobilePayment] Select Plan");
		System.out.println("[MobilePayment] Processing payment for Amount \u20b9"+amount);
	}
}

class ElectricityPayment extends ServicePayment{
	
	ElectricityPayment(){
		System.out.println("[ElectricityPayment] Object Constructed");
	}
	
	void payForService(int amount) {
		System.out.println("[ElectricityPayment] Processing payment for Amount \u20b9"+amount);
	}
}

class GasCylinderPayment extends ServicePayment{
	
	GasCylinderPayment(){
		System.out.println("[GasCylinderPayment] Object Constructed");
	}
	
	void payForService(int amount) {
		System.out.println("[GasCylinderPayment] Processing payment for Amount \u20b9"+amount);
	}
}

class PayTMApp{
	
	ServicePayment selectService(int option) {
		
		ServicePayment service = null;
		
		if(option == 1) {
			service = new MobilePayment();
		}else if(option == 2) {
			service = new ElectricityPayment();
		}else if(option == 3) {
			service = new GasCylinderPayment();
		}else {
			System.err.println("Select the Payment Method First");
		}
		
		return service;
		
	}
	
}

public class WhatIsAbstractClassApp {

	public static void main(String[] args) {
		
		PayTMApp app = new PayTMApp();
		
		System.out.println("1: Mobile Payment");
		System.out.println("2: Electricity Payment");
		System.out.println("3: Gas Cylinder Payment");
		System.out.println("Select the Option: (1-3): ");
		
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		scanner.close();
		
		//ServicePayment service = new ServicePayment(); -> ERROR (Abstract Class cannot have Objects)
		
		ServicePayment service = app.selectService(option);
		if(service != null) {
			service.payForService(300);
		}

	}

}
