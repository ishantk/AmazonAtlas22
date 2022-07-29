import java.util.Objects;

class Dish{
	
	private String name;
	private int price;
	String description;	

	public Dish() {
	}

	public Dish(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + ", description=" + description + "]";
	}
}

public class CodeObjectsUsingEclipseFeaturesApp {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish("Noodles", 300, "Chineses Rice or Wheat based Noodles");
		System.out.println("dish1 is: "+dish1);

	}

}
