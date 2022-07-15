
class MyDish{ // Structure of Object
	
	// Attributes: Property of Object
	String dishName;
	int quantity;
	
	// Constructors: Property of Object
	MyDish(){
		dishName = "NA";
		quantity = 0;
	}
	
	MyDish(String dishName, int quantity){
		this.dishName = dishName;
		this.quantity = quantity;
	}
	
	// Methods: Property of Object
	void increment() {
		++quantity;
	}
	
	void decrement() {
		--quantity;
	}
	
	void showDish() {
		System.out.println("Dish: "+dishName+" Quantity: "+quantity);
	}
	
}

public class OOPSTest {

	public static void main(String[] args) {
		
		MyDish dish1 = new MyDish("Noodles", 1);	// dish1: N: Noodles | Q: 1
		MyDish dish2 = new MyDish();				// dish2: N: NA | Q: 0
		MyDish dish3 = dish1;						// dish1/dish3: N: Noodles | Q: 1
		
		dish1.increment();							// Q: 1->2
		dish2.increment();							// Q: 0->1
		dish3.increment();							// Q: 2->3
		
		dish1.decrement();							// Q: 3->2
		dish2.increment();							// Q: 1->2
		
		dish1.showDish();		// 49: Dish: Noodles Quantity: 2
		dish2.showDish();		// 50: Dish: NA Quantity: 2
		dish3.showDish();		// 51: Dish: Noodles Quantity: 2
		

	}

}
