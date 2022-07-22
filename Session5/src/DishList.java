// LinkedList class is kind of manager 
// Which shall give us methods to dynamically link the Dish Objects
public class DishList {
	
	// Has-A Relationship | 1 to 1
	Dish root;	// default value of null
	
	// Property of LinkedList Object
	int size; // default value of 0
	
	void add(Dish dish) {
		
		size++;
	
		if(root == null) {
			root = dish; // Reference Copy
			System.out.println("[LinkedList] [add] ROOT Node is: "+root);
		}else {
			// start from the first node
			Dish temp = root;
			
			// go to the last node
			while(temp.nextDish != null) {
				temp = temp.nextDish;
			} 
			
			temp.nextDish = dish;
			System.out.println("[LinkedList] [add] Dish "+dish+" Added After: "+temp);
		}

		System.out.println();
	}

	
	// iterate is a method, which means to move from 1st element to last element
	void iterate() {
		System.out.println();
		System.out.println("[LinkedList] [iterate] Printing Linked List of Size "+size);
		System.out.println();
		
		Dish temp = root;
		
		while(temp.nextDish != null) {
			temp.showDish();
			temp = temp.nextDish;
		} 
		
		// Printing for the Last Node
		temp.showDish();
	}
	
}
