
public class Product {
	
	String name;
	String brand;
	int quantity;
	int price;
	
	Product nextProduct;
	Product previousProduct;
	
	public Product() {

	}

	public Product(String name, String brand, int quantity, int price) {
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}

	void showProduct() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Name: "+name+" Brand: "+brand);
		System.out.println("Quantity: "+quantity+" Price: "+price);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}
