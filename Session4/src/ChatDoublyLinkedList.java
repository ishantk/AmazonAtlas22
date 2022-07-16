// Create a Doubly Linked List
public class ChatDoublyLinkedList {

	// Has-A Relation
	Message head; 	// Head of List -> Reference to the first message | By default it is null
	Message tail;	// Tail of List -> Reference to the last message  | By default it is null
	
	int size; // by default 0
	
	void add(Message message) {
		
		size++;
		
		System.out.println("[ChatDoublyLinkedList] add: adding Message "+message);
		
		if(head == null) {
			head = message;
			tail = message;
		}else {
			message.previousMessage = tail;
			tail.nextMessage = message;
			tail = message;
		}
			
	}
	
	void iterateForward() {
		
		System.out.println("[ChatDoublyLinkedList] FORWARD ITERATION");
		
		Message temp = head;
		
		while(temp.nextMessage != null) {
			temp.showMessage();
			temp = temp.nextMessage;
		}
		
		temp.showMessage();
		
	}
	
	void iterateBackward() {
		
		System.out.println("[ChatDoublyLinkedList] BACKWARD ITERATION");
		
		Message temp = tail;
		
		while(temp.previousMessage != null) {
			temp.showMessage();
			temp = temp.previousMessage;
		}
		
		temp.showMessage();
	}
	
	boolean contains(Message message) {
		 return false;
	}
	
	void deleteFromEnd() {
		
	}
	
	void deletFromBeginning() {
		
	}
	
	void addInBeginning() {
		
	}
	
	void addInEnd() {
		
	}
	
}
