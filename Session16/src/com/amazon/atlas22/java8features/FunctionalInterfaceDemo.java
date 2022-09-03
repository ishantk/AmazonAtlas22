package com.amazon.atlas22.java8features;

@FunctionalInterface
interface Email{
	
	String emailClientName = "Gmail";
	
	// A Functional Interface can strictly have 1 abstract method
	String sendEmail(String from, String to, String subject, String body);
	//String onSend();		// error -> not allowed
	//String onFailure();		// error
	
	default void onEmailSent() {
		System.out.println("Email Successfully Sent by "+emailClientName);
	}
	
	static void setUpClient() {
		System.out.println("Setting Up the Email Client "+emailClientName);
	}
}

class EmailClient implements Email{

	@Override
	public String sendEmail(String from, String to, String subject, String body) {
		System.out.println("Sending Email with Subject: "+subject);
		System.out.println("Email Body: "+body);
		System.out.println("Email Sent from "+from+" to "+to);
		return "Email Sent";
	}
}

// Also a Functional Interface
interface Hello{
	void sayHello();
}

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		EmailClient client = new EmailClient();
		String response = client.sendEmail("john@example.com", "fionna@example.com", "Java 8 features", "Hello, We are learning the Functional Interface");
		System.out.println("Response: "+response);
		
		client.onEmailSent();
		//client.setUpClient(); -> Static method not accessible by reference only by interface name
		Email.setUpClient();
	}

}
