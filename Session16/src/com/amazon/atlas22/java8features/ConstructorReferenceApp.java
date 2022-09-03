package com.amazon.atlas22.java8features;

@FunctionalInterface
interface Message{
	void printSize(String text);
}

class WhatsAppMessage{
	
	
	WhatsAppMessage(String message){
		String before = "LS%%^TGA";
		String after = "XFSDSE$$$%#A";
		message = before + message + after;
		System.out.println("Message is: "+message);
		System.out.println("Message Size is: "+message.length());
	}
	
}

public class ConstructorReferenceApp {

	public static void main(String[] args) {
		
		// Constructor Reference: Allocate the definition of the Constructor
		Message message = WhatsAppMessage :: new;
		message.printSize("This is Awesome");
	}

}
