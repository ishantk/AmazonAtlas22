// Create a Queue to add data in the end and remove from the front
public class Queue {

	Node head; // front -> by default null
	Node tail; // rear  -> by default null
	int size;  // 0 as default
	
	void enqueue(int data) {
		size++;
		Node node = new Node();
		node.data = data;
		
		if(head == null) {
			head = node;
			tail = node;
		}else {
			Node temp = head;
			// iterate till the end
			while(temp.nextNode != null) {
				temp = temp.nextNode;
			}
			// last node | make the last node's next node as new node
			temp.nextNode = node; 
			tail = node; // update the tail to new node
		}
		
		System.out.println("[Queue] [enqueue] Node Created: "+node+" Data: "+node.data+" Next Node: "+node.nextNode);
		System.out.println("[Queue] [enqueue] Head: "+head+" Tail: "+tail);
		System.out.println();
	}
	
	void dequeue() {
		
		Node temp = head;
		
		if(head != null) {
			head = head.nextNode;
			size--;
			
			System.out.println("[Queue] [dequeue] Node Deleted: "+temp+" Data: "+temp.data+" Next Node: "+temp.nextNode);
			System.out.println("[Queue] [dequeue] Head: "+head+" Tail: "+tail);
			
			temp = null; // this means-> GC to act fastly for the object which was referred by temp
			
		}else {
			System.out.println("[Queue] [dequeue] Nothing to DeQueue");
		}
		
	}
	
	void iterate() {
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("[Queue] [iterate] Printing Queue of Size "+size);
		System.out.println();
		
		Node temp = head;
		
		// go to the last node
		while(temp.nextNode != null) {
			
			System.out.println("[Queue] [iterate] data is: "+temp.data);
			
			temp = temp.nextNode;
		} //once the loop terminates, temp will have the last node's reference
		
		// Printing for the Last Node
		System.out.println("[Queue] [iterate] data is: "+temp.data);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	int front() {
		if(size!=0)
			return head.data;
		else
			return -1;
	}
	
}
