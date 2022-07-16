// Stack Class
// Which will maintain push and pop operations
public class Stack {

	Node top; 	// default value is null
	int size;	// default value is 0
	
	// add a new node in the stack
	void push(int data) {
		
		Node node = new Node();
		node.data = data;
		size++;
		

		if(top == null) {
			top = node;
		}else {
			node.previousNode = top; // previous node has previous node as new node
			top = node; // newly created node, is the top
		}
		
		System.out.println("[Stack] [push] Node Created: "+node+" Data: "+node.data+" Previous Node: "+node.previousNode);
		System.out.println("[Stack] [push] Top is: "+top);
		System.out.println();
		
	}
	
	// remove the top node in the Stack
	void pop() {
		if(size !=0) {
			System.out.println("[Stack] [pop] "+top.data+" Popped");
			top = top.previousNode;
			size--;
		}else {
			System.out.println("[Stack] [pop] Nothing to Pop");
		}
	}
	
	// iterate in the stack
	void iterate() {
		
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("[Stack] [iterate] Printing Stack of Size "+size);
		System.out.println();
		
		Node temp = top;
	
		while(temp.previousNode != null) {
			
			System.out.println("[Stack] [iterate] data is: "+temp.data);
			
			temp = temp.previousNode;
		} //once the loop terminates, temp will have the first node's reference
		
		// Printing for the First Node
		System.out.println("[Stack] [iterate] data is: "+temp.data);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
	
	// Return the top node in the Stack
	int top() {
		if(size !=0)
			return top.data;
		else
			return -1;
	}
}
