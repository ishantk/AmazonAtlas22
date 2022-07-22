// LinkedList class is kind of manager 
// Which shall give us methods to dynamically link the Node Objects
public class LinkedList {
	
	// Has-A Relationship | 1 to 1
	Node root;	// default value of null
	
	// Property of LinkedList Object
	int size; // default value of 0
	
	// Here we take integer data as input to be added as a Node in LinkedList
	void add(int data) {
		
		size++;
		
		Node node = new Node();
		System.out.println("[LinkedList] [add] node for data "+data+" is: "+node);
		node.data = data;
		//node.nextNode = null; // this is understood that by default nextNode is null :)
	
		if(root == null) {
			root = node; // Reference Copy
			System.out.println("[LinkedList] [add] ROOT Node is: "+root);
		}else {
			// start from the first node
			Node temp = root;
			
			// go to the last node
			while(temp.nextNode != null) {
				temp = temp.nextNode;
			} //once the loop terminates, temp will have the last node's reference
			
			// Let us make the nextNode of the Last Node as the Newly Created Node Object above
			temp.nextNode = node;
			System.out.println("[LinkedList] [add] Node "+node+" Added After: "+temp);
		}

		
		
		System.out.println();
	}
	
	void deleteLast() {
		
		if(size == 0) {
			System.out.println("[LinkedList] [deleteLast] Nothing to Delete :) ");
		}else {
			Node temp = root;
			
			// 1 single node in the list
			if(temp.nextNode == null) {
				root = null;
			}else {
				while(temp.nextNode.nextNode != null) {
					temp = temp.nextNode;
				}
				System.out.println("[LinkedList] [deleteLast] Node "+temp+" with data: "+temp.data+" deleted");
				temp.nextNode = null;
			}
			
			size--;
		}
		
	}
	
	void deleteFirst() {
		
		if(size == 0) {
			System.out.println("[LinkedList] [deleteFirst] Nothing to Delete :) ");
		}else {
			System.out.println("[LinkedList] [deleteFirst] Node "+root+" with data: "+root.data+" deleted");
			root = root.nextNode;
			size--;
		}

	}
	
	void delete(int data) {

		Node temp=root;
		
		// In case the 1st node is the node to be deleted
		// we found the data in the root node itself
		if(root.data==data){
			root=root.nextNode;
			size--;
			return; // come back from delete method. no more execution needed
		}
		
		// traverse in the List to find the Node
		while (temp.nextNode!=null){

			// if we find the data
			if(temp.nextNode.data==data){
               
				// last node check  
				if(temp.nextNode.nextNode==null){
					temp.nextNode=null;
					size--;
					break; // below in the while, we do still have temp = temp.nextNode which will trhow null :)
				}
				else{ 
					temp.nextNode = temp.nextNode.nextNode;
					size--;
				}
			}
			
			temp=temp.nextNode;
		}
		
	}
	
	boolean contains(int data) {
		
		boolean check = false;
		
		Node temp = root;
		
		// go to the last node
		while(temp.nextNode != null) {
			
			if(temp.data == data) {
				check = true;
			}
			
			temp = temp.nextNode;
		} 
		
		if(temp.data == data) {
			check = true;
		}
		
		return check;
	}
	
	// iterate is a method, which means to move from 1st element to last element
	void iterate() {
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("[LinkedList] [iterate] Printing Linked List of Size "+size);
		System.out.println();
		
		Node temp = root;
		
		// Try to Optimise that we perfrom no checks outside the loop
		// go to the last node
		while(temp.nextNode != null) {
			
			System.out.println("[LinkedList] [iterate] data is: "+temp.data);
			
			temp = temp.nextNode;
		} //once the loop terminates, temp will have the last node's reference
		
		// Printing for the Last Node
		System.out.println("[LinkedList] [iterate] data is: "+temp.data);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}
