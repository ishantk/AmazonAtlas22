// Static Vs Non Static

class DishItem{
	
	// Attributes: Property Of Object
	// Non Static Attributes
	String name;
	int price;
	int quantity;
	
	// Attribute: Property of Class
	// Static Attribute
	static int count; 			// 0 by default
	static int totalQuantity;	// 0 by default

	// Constructors: Property of Object and not of Class
	// NoArg/Default Constructor: No Parameter 
	public DishItem() {
		name = "NA";
		price = 0;
		quantity = 0;
		
		// static property can be accessed in non static property
		count++;
		totalQuantity += quantity;
	}
	
	// Parameterized: With Partameters
	public DishItem(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		// static property can be accessed in non static property
		count++;
		totalQuantity += quantity;
	}
	
	// Method: Property of Object and not of Class
	void showDishDetails() {
		System.out.println("name: "+name+" price: "+price+" "+quantity);
		
		// static property can be accessed in non static property
		//System.out.println("Total Dish Items: "+count);
		//System.out.println("Total Dish Quantity: "+totalQuantity);
	}
	
	// Method: Property of class and not of Object
	static void showDishCountAndQuantity() {
		// static property can be accessed in static property
		// BUT, non static property cannot be accessed in static property
		//System.out.println(name); // error
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Total Dish Items: "+count);
		System.out.println("Total Dish Quantity: "+totalQuantity);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}


// Rule: 1. Objects can access property of Class :)
//       2. Class cannot access property of Object :)
public class OOPSPart4 {

	public static void main(String[] args) {

		DishItem item1 = new DishItem("Cake", 500, 1);			// count: 0 -> 1	| tq: 1
		DishItem item2 = new DishItem("Brownie", 200, 2);		// count: 1 -> 2	| tq: 3
		//DishItem item3 = new DishItem();						// count: 2 -> 3
		
		//System.out.println("item1 is: "+item1);
		//System.out.println("item1 is: "+item2);
		
		item1.showDishDetails();	//	name: Cake 		| count : 2  totalQuantity: 3
		item2.showDishDetails();	//	name: Brownie 	| count : 2  totalQuantity: 3
		
		//item3.showDishDetails();	//  name: NA		| count : 3
		
		// Indirect Access to static members of class using a method
		DishItem.showDishCountAndQuantity();
		
		// we can execute the method of class with reference variable item1
		// But is not an ideal way of using it, and hence compiler is also giving us a waring
		item1.showDishCountAndQuantity();
		
		// Direct Access to static members
		System.out.println("TOTAL COUNT: "+DishItem.count);
		System.out.println("TOTAL QUANTITY: "+DishItem.totalQuantity);
		
	}

}
