import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BubbleSortMessageApp {
	
	static void bubbleSortMessagesBasedOnMessageTextLength(Message[] messages) {
		
		int size = messages.length; // 5
		
		// Loop runs n times :) where n is size of messages (5 in our case)
		// from 0 to n-1 (0 to 4)
		for(int idx=0;idx<size-1;idx++) {
			// for idx: 0, cmpIdx: 5-0-1 => 4 | cmpIdx : 0, 1, 2, 3
			// for idx: 1, cmpIdx: 5-1-1 => 3 | cmpIdx : 0, 1, 2
			// .....
			for(int cmpIdx=0; cmpIdx<size-idx-1; cmpIdx++) {
				if(messages[cmpIdx].text.length() > messages[cmpIdx+1].text.length()) {
					// Do a swapping
					Message temp = messages[cmpIdx];
					messages[cmpIdx] = messages[cmpIdx+1];
					messages[cmpIdx+1] = temp;
				}
			}
		}
	}
	
	static void bubbleSortMessagesOnDate(Message[] messages) {
		
		int size = messages.length; // 5
		
		// Loop runs n times :) where n is size of messages (5 in our case)
		// from 0 to n-1 (0 to 4)
		for(int idx=0;idx<size-1;idx++) {
			// for idx: 0, cmpIdx: 5-0-1 => 4 | cmpIdx : 0, 1, 2, 3
			// for idx: 1, cmpIdx: 5-1-1 => 3 | cmpIdx : 0, 1, 2
			// .....
			for(int cmpIdx=0; cmpIdx<size-idx-1; cmpIdx++) {
				if(messages[cmpIdx].timeStamp.compareTo(messages[cmpIdx+1].timeStamp) < 0) {
					// Do a swapping
					Message temp = messages[cmpIdx];
					messages[cmpIdx] = messages[cmpIdx+1];
					messages[cmpIdx+1] = temp;
				}
			}
		}
	}
	
	static void printMessages(Message[] messages) {
		for(Message message : messages) {
			message.showMessage();
		}
	}

	public static void main(String[] args) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// Create date references
		Date date1=null, date2=null, date3=null, date4=null, date5=null;
		
		
		try {
			date1 = formatter.parse("21/07/2022 11:22:10");
			date2 = formatter.parse("19/06/2022 10:27:17");
			date3 = formatter.parse("22/07/2022 09:32:19");
			date4 = formatter.parse("10/05/2022 07:45:22");
			date5 = formatter.parse("12/04/2022 06:11:32");			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//Message m1 = new Message("Hello John !!", date1, 2, "+91 99999 11111", "+91 99999 22222");
		Message m2 = new Message("Hi Fionna...", date2, 1, "+91 99999 22222", "+91 99999 11111");
		//Message m3 = new Message("Lets hangout for a code session", date3, 3, "+91 99999 33333", "+91 99999 77777");
		Message m4 = new Message("I am plannning to visit a friend. Not Available", date4, 1, "+91 99999 77777", "+91 99999 99999");
		//Message m5 = new Message("I will see you soon", date5, 2, "+91 99999 11111", "+91 99999 22222");
	
		// Array of 5 Message Objects :)
		Message[] conversations = new Message[5];
		conversations[0] = new Message("Hello John, This is Fionna from Java Session", date1, 2, "+91 99999 11111", "+91 99999 22222");
		conversations[1] = m2;
		conversations[2] = new Message("I will see you soon", date5, 2, "+91 99999 11111", "+91 99999 22222");
		conversations[3] = m4;
		conversations[4] = new Message("Lets hangout for a code session", date3, 3, "+91 99999 33333", "+91 99999 77777");
		
		System.out.println("MESSAGE CONVERSATIONS BEFORE");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		printMessages(conversations);
		
		//bubbleSortMessagesBasedOnMessageTextLength(conversations);
		bubbleSortMessagesOnDate(conversations);
		System.out.println();
		
		System.out.println("MESSAGE CONVERSATIONS AFTER");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		printMessages(conversations);
		
		
	}

}
