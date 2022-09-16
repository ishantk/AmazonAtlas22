package com.amazon.atlas22.solid;

// Class Authentication is now having 2 Responsibilities :)
/*class Authentication{
	
	void loginUser(String email, String password) {
		// Some check from the database if user belongs to the System or not :)
		System.out.println("User with email "+email+"is Validated");
		System.out.println("Navigating to Home");
	}
	
	void authorizeRole(String email) {
		// We will perform a check what are the roles granted to this User
		// eg: can you delete or not ?
		// i.e. you are an admin or a reception handler or customer support handler
		// Do some checks from the database and bring out the role
		System.out.println(email+" has a role of Admin");
	}
}*/

class Authentication{
	
	void loginUser(String email, String password) {
		// Some check from the database if user belongs to the System or not :)
		System.out.println("User with email "+email+" is Validated");
		System.out.println("Navigating to Home");
	}
	
	void loginUser(String phoneNumber, int otp) {
		// Some check from the database if user phone number belongs to the System or not :)
		// If belongs, Send an OTP and Validate it
		System.out.println("User with phoneNumber "+phoneNumber+" is Validated");
		System.out.println("Navigating to Home");
	}
}

class Authorization{
	
	void authorizeRole(String email) {
		// We will perform a check what are the roles granted to this User
		// eg: can you delete or not ?
		// i.e. you are an admin or a reception handler or customer support handler
		// Do some checks from the database and bring out the role
		System.out.println(email+" has a role of Admin");
	}
}

class App{
	// You can use Authentication and Authorization
}

// The class as of now poses Single Responsibility to deal with Message
class WhatsAppMessage{
	
	void sendMessage(String text) {
		System.out.println("Sending a text message");
	}
	
	void sendMessage(double latitude, double longitude) {
		System.out.println("Sending a Location message");
	}
	
	// The method has more than 1 responsibility :)
	/*void deleteOrDeleteForAllMessage(int messageId, int option) {
		System.out.println("Based on Option: Delete or Delete for All");
	}*/
	
	void deleteMessage(int messageId) {
		System.out.println("Deleting a text message");
	}
	
	void deleteMessageForAll(int messageId) {
		System.out.println("Deleting a text message for All");
	}
	
	void updateMessageStatus(int messageId) {
		System.out.println("Message Status Updated...");
	}
}


class WhatsAppPayment{
	
	void payToContact(String contact, int amount) {
		System.out.println("Pay to Contact "+contact+" an amount of "+amount);
	}
	
	void onPaymentSuccess(String message) {
		System.out.println("Payment Successful");
	}
	
	void onPaymentFaield(String message) {
		System.out.println("Payment Failed");
	}
}

class UserProfile{
	
	/*void createOrUpdateProfile() {
		System.out.println("Create or Update Profile");
	}*/
	
	void createProfile() {
		System.out.println("Create User Profile");
	}
	
	void updateProfile() {
		System.out.println("Update User Profile");
	}
	
}

// SRP
// A class must have 1 Responsibility which does not means in terms of methods :)
// A method in a class should also exhibit a single responsibility

public class SingleResponsibilityPrinciple {

	public static void main(String[] args) {
		

	}

}
