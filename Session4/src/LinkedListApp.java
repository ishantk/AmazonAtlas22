/*
 
 	Types of LinkedList Data Structure
 	1. Singly LinkedList
 	2. Doubly LinkedList
 	3. Circular Doubly LinkedList ( * )
 
 */

/*class Node{

	// Attributes in the Node Object :)
	int data; 			// 0
	Node nextNode;		// null
	
}

class LinkedList{
	
}
*/

// Main Class: with main method
public class LinkedListApp {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		System.out.println("[LinkedListApp] [main] list is: "+list); // Gives the HashCode
		System.out.println();
		
		// When we do first i.e. initial add operation, we need to initialize LinkedList Root with this node
		list.add(10);

		// Now add other elements in the list
		list.add(20);
		
		list.add(30);
				
		list.add(40);
		
		list.add(50);
		
		System.out.println("[LinkedListApp] [main] Size of LinkedList is: "+list.size);
		
		list.iterate();
		
		/*
		System.out.println();
		System.out.println("[LinkedListApp] [main] Delete Last In Action");
		list.deleteLast();
		System.out.println("[LinkedListApp] [main] Size of LinkedList is: "+list.size);
		list.iterate();
		
		System.out.println();
		System.out.println("[LinkedListApp] [main] Delete First In Action");
		list.deleteFirst();
		System.out.println("[LinkedListApp] [main] Size of LinkedList is: "+list.size);
		list.iterate();
		
		System.out.println("[LinkedListApp] [main] Is Data 20 in List? "+list.contains(20));
		System.out.println("[LinkedListApp] [main] Is Data 30 in List? "+list.contains(30));
		System.out.println("[LinkedListApp] [main] Is Data 40 in List? "+list.contains(40));
		*/
		
		System.out.println();
		System.out.println("[LinkedListApp] [main] Delete Based on Data");
		list.delete(30);
		list.iterate(); // 10 20 40 50

	}

}
