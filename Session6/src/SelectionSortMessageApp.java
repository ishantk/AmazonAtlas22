import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectionSortMessageApp {
	
	static void sortMessages(Message[] messages, int filterType) {
		
		int size = messages.length;
		
		for(int idx=0; idx<size-1; idx++) {
			
			int minIdx = idx;
			
			// Iterated in the array to find element with min index
			for(int cmpIdx=idx+1; cmpIdx<size; cmpIdx++) {
				
				boolean flag = filterType == 1 ? messages[cmpIdx].text.length() < messages[minIdx].text.length() 
											   : filterType == 2 ? messages[cmpIdx].timeStamp.compareTo(messages[minIdx].timeStamp) > 0 : false;
				
				if(flag) {
					minIdx = cmpIdx;
				}
			}
			
			// Swap it with the element in front
			Message temp = messages[idx];
			messages[idx] = messages[minIdx];
			messages[minIdx] = temp;
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
		
		//sortMessages(conversations, 1); 	// 1-> on text length
		sortMessages(conversations, 2); 	// 2-> by date time stamp
		System.out.println();
		
		System.out.println("MESSAGE CONVERSATIONS AFTER");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		printMessages(conversations);
		
		
	}

}
