package com.amazon.atlas.interfaces;

interface Message{
	void send(String text, String to);
	void receive(String text, String from);
}

class WhatsApp implements Message{

	public void send(String text, String to) {
		System.out.println("Sending "+text+" to "+to);
	}

	public void receive(String text, String from) {
		System.out.println("Receiving "+text+" from "+from);
	}
	
}

public class AnaonymousClassWithInterfaceApp {

	public static void main(String[] args) {
		
		Message message = new WhatsApp();
		message.send("Hello", "+91 99999 11111");
		message.receive("How Are You ?", "+91 99999 33333");
		
		System.out.println();
		
		// Anonymous Class :)
		Message message1 = new Message() {
			
			public void send(String text, String to) {
				System.out.println("Sending "+text+" to "+to);
			}

			public void receive(String text, String from) {
				System.out.println("Receiving "+text+" from "+from);
			}
			
		};
		
		message1.send("Learning Java", "+91 99999 55555");
		message1.receive("This seems to be fun", "+91 99999 12121");
		

	}

}
