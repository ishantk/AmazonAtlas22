package com.amazon.atlas22.solid;

interface IMessage{
	void createMessage(String text);
	void sendMessage(String phoneNumber);
}

class Message implements IMessage{
	
	String text;
	
	public void createMessage(String text) {
		this.text = text;
		System.out.println("Text Message Created "+text);
	}
	
	public void sendMessage(String phoneNumber) {
		System.out.println("Sending Message "+text+" to "+phoneNumber);
	}
}

/*class MessageWithImage extends Message{
	
	public void attachImageAndWriteMessage(String imagePath, String text) {
		System.out.println("Attaching an Image");
		this.text = text;
		System.out.println("Creating a Text...");
	}
}*/

class MessageWithImage extends Message{
	
	public void attachImage(String imagePath) {
		System.out.println("Attaching an Image at Path "+imagePath);
	}
	
	// Override the Parent's Method -> Substitution
	public void createMessage(String text) {
		attachImage("//....");
		this.text = text;
		System.out.println("Text Message Created "+text+" with Image...");
		
	}
}

public class LiskovSubstitutionPrinciple {

	public static void main(String[] args) {
		
		IMessage message = new Message();
		message.createMessage("Hello...");
		message.sendMessage("+91 99999 11111");
		
		System.out.println();
		
		message = new MessageWithImage();
		message.createMessage("Cute Cat");
		message.sendMessage("+91 99999 22222");
		
	}
}
