import java.util.Date;

public class Message {
	
	// Attributes: Property of Object
	String text;
	Date timeStamp;
	int status; // 1->Sent 2->Delivered 3->Seen
	String from;
	String to;
	
	public Message() {
		this("NA", null, 0, "NA", "NA");
	}

	public Message(String text, Date timeStamp, int status, String from, String to) {
		this.text = text;
		this.timeStamp = timeStamp;
		this.status = status;
		this.from = from;
		this.to = to;
	}
	
	String statusToString(int status) {
		if(status == 1)
			return "Sent";
		else if(status == 2)
			return "Delivered";
		else if(status == 3)
			return "Seen";
		else
			return "NA";
	}

	void showMessage() {
		System.out.println("------------------------------------");
		System.out.println(text);
		System.out.println(timeStamp);
		System.out.println(statusToString(status));
		System.out.println("Sender: "+from+" Receiver: "+to);
		System.out.println("------------------------------------");
		System.out.println();
	}
	
}
