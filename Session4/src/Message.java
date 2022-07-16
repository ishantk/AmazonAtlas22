// Message as WhatsApp Text Message
public class Message {

	// Attributes: Property of Object
	String text;
	String timeStamp;
	boolean seen;
	
	Message nextMessage;		// null
	Message previousMessage;	// null
	
	public Message() {
		
	}
	
	public Message(String text, String timeStamp, boolean seen) {
		this.text = text;
		this.timeStamp = timeStamp;
		this.seen = seen;
	}
	
	void showMessage() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\u2709 "+ text);
		
		char check = '\u2713';
		char uncheck = '\u2715';
		char toPrint = seen ? check : uncheck;
		System.out.println(timeStamp+"\t\t"+toPrint);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}
