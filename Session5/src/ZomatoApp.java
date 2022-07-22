import java.util.Scanner;

public class ZomatoApp {

	public static void main(String[] args) {
		
		MenuHashTable restaurant = new MenuHashTable(5);
		
		Dish dish1 = new Dish("samsosa", 200);
		Dish dish2 = new Dish("pizza", 300);
		Dish dish3 = new Dish("fries", 120);
		Dish dish4 = new Dish("chocolte", 270);
		Dish dish5 = new Dish("cake", 600);
		
		System.out.println(dish1.name.hashCode());
		System.out.println(dish2.name.hashCode());
		System.out.println(dish3.name.hashCode());
		System.out.println(dish4.name.hashCode());
		System.out.println(dish5.name.hashCode());
		
		restaurant.put(dish1.name.hashCode(), dish1);
		restaurant.put(dish2.name.hashCode(), dish2);
		restaurant.put(dish3.name.hashCode(), dish3);
		restaurant.put(dish4.name.hashCode(), dish4);
		restaurant.put(dish5.name.hashCode(), dish5);
		
		
		restaurant.iterate();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Dish to Search: ");
		String dishToSearch = scanner.nextLine().toLowerCase();
		System.out.println("dishToSearch "+dishToSearch+" and hashcode is: "+dishToSearch.hashCode());
		scanner.close();
		
		
		// Do Implement: remove and contains methods..

	}

}
