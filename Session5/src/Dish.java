public class Dish {

	// Attributes: Property of Object
	String name;
	int price;
	
	Dish nextDish;		// null
	
	public Dish() {
		this("NA", 0);
	}

	public Dish(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void showDish() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(name+"\t \u20b9"+ price);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
	}
	
}
