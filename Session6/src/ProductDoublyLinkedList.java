
public class ProductDoublyLinkedList {
	
	// Has-A Relation
	Product head; 	// Head of List -> Reference to the first message | By default it is null
	Product tail;	// Tail of List -> Reference to the last message  | By default it is null
	
	int size; // by default 0
	
	void add(Product product) {
		
		size++;
		
		System.out.println("[ProductDoublyLinkedList] add: adding Product "+product);
		
		if(head == null) {
			head = product;
			tail = product;
		}else {
			product.previousProduct = tail;
			tail.nextProduct = product;
			tail = product;
		}
			
	}
	
	void remove(Product product) {
		
		size--;
		System.out.println("[ProductDoublyLinkedList] remove: removing Product "+product);
		
			
	}
	
	void iterateForward() {
		
		System.out.println("[ProductDoublyLinkedList] FORWARD ITERATION");
		
		Product temp = head;
		
		while(temp.nextProduct != null) {
			temp.showProduct();
			temp = temp.nextProduct;
		}
		
		temp.showProduct();
		
	}
	
	void iterateBackward() {
		
		System.out.println("[ProductDoublyLinkedList] BACKWARD ITERATION");
		
		Product temp = tail;
		
		while(temp.previousProduct != null) {
			temp.showProduct();
			temp = temp.previousProduct;
		}
		
		temp.showProduct();
	}
	
	void sort(int type) { // type:1 sort low to high | type:2 sort high to low
		
		Product temp = head;
		
		while(temp.nextProduct != null) {
			
			// Sort the LinkedList
			
			temp = temp.nextProduct;
		}
		
		temp.showProduct();
		
	}
	
}
