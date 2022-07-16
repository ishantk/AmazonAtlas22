
public class WhatsApp {

	public static void main(String[] args) {
		
		/*Message message1 = new Message("Hello!!", "12:10", true);
		Message message2 = new Message("This is Awesome to know you are learning Java", "12:50", true);
		Message message3 = new Message("Data Structures are Awesome", "13:10", false);
		Message message4 = new Message("Lets have a small break by 4 PM", "14:10", true);
		Message message5 = new Message("Thank you :)", "13:30", false);
		
		message1.showMessage();
		message5.showMessage();*/
		
		ChatDoublyLinkedList list = new ChatDoublyLinkedList();
		System.out.println("[WhatsApp] [main] list is: "+list);
		
		list.add(new Message("1. Hello!!", "12:10", true));
		list.add(new Message("2. This is Awesome to know you are learning Java", "12:50", true));
		list.add(new Message("3. Data Structures are Awesome", "13:10", false));
		list.add(new Message("4. Lets have a small break by 4 PM", "14:10", true));
		list.add(new Message("5. Thank you :)", "13:30", false));

		System.out.println("[WhatsApp] [main] list size is: "+list.size);
		
		list.iterateForward();  // Scrolling the messages downwards
		list.iterateBackward(); // Scrolling the messages upwards
	}

}
