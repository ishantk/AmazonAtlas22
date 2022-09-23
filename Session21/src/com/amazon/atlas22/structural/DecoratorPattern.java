package com.amazon.atlas22.structural;

import java.util.Scanner;

interface FoodItem{
	String getDescription();
	int getPrice();
}

class VeggieBurger implements FoodItem{

	@Override
	public String getDescription() {
		return "Veggie Burger with Herbs and Spices";
	}

	@Override
	public int getPrice() {
		return 200;
	}
	
}

class VegWrap implements FoodItem{
	
	@Override
	public String getDescription() {
		return "Veggie Wrap with Paneer and Capsicums";
	}

	@Override
	public int getPrice() {
		return 180;
	}

}

// Decorator Design Pattern
abstract class FoodDecorator implements FoodItem{
	
	FoodItem item; // Has-A Relationship with FoodItem :)

	// Which FoodItem to be Decorated:)
	public FoodDecorator(FoodItem item) {
		this.item = item;
	}
	
	@Override
	public String getDescription() { // Returns the Description of Decorated FoodItem
		return item.getDescription();
	}

	@Override
	public int getPrice() {			// Returns the Price of Decorated FoodItem
		return item.getPrice();
	}
	
}

class VeggieBurgerMeal extends FoodDecorator{
	
	VeggieBurgerMeal(FoodItem item){
		super(item);
	}
	
	@Override
	public String getDescription() { 
		// Perform Decoration Here
		return item.getDescription()+"!! Your Veggie Burger Upgraded to a Meal with Coke and Fries";
	}

	@Override
	public int getPrice() {	
		// Perform Decoration Here
		return item.getPrice()+120;
	}
}

class VegWrapMeal extends FoodDecorator{
	
	VegWrapMeal(FoodItem item){
		super(item);
	}
	
	@Override
	public String getDescription() { 
		// Perform Decoration Here
		return item.getDescription()+"!! Your Veg Wrap Upgraded to a Meal with Coke and Potato Nuggets";
	}

	@Override
	public int getPrice() {	
		// Perform Decoration Here
		return item.getPrice()+80;
	}
}


public class DecoratorPattern {

	public static void main(String[] args) {
		
		VeggieBurger burger = new VeggieBurger();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to upgrade your burger to a Meal ? (yes/no)");
		String choice = scanner.nextLine();
		scanner.close();
		
		if(choice.equalsIgnoreCase("yes")) {
			FoodDecorator meal = new VeggieBurgerMeal(burger);
			System.out.println("Here is Your Meal");
			System.out.println("Burger: "+meal.getDescription());
			System.out.println("Price: "+meal.getPrice());
			System.out.println("Pelase Pay to Proceed....");
		}else {
			System.out.println("Here is Your Burger");
			System.out.println("Burger: "+burger.getDescription());
			System.out.println("Price: "+burger.getPrice());
			System.out.println("Pelase Pay to Proceed....");
		}
		
	}

}
