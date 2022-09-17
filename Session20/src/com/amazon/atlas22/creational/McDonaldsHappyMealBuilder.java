package com.amazon.atlas22.creational;

class Burger{
	public String toString() {
		return "Veggie Burger";
	}
}

class Fries{
	public String toString() {
		return "Medium French Fries";
	}
}

class Drink{
	public String toString() {
		return "Butterscotch Milk";
	}
}

class Fruit{
	public String toString() {
		return "4 Slices of Apple";
	}
}

class Toy{
	public String toString() {
		return "Disney Toy";
	}
}

class HappyMeal{
	
	Burger burger;
	Fries fries;
	Drink drink;
	Fruit fruit;
	Toy toy;
	
	private HappyMeal() {
		
	}
	
	private HappyMeal(Burger burger, Fries fries, Drink drink, Fruit fruit, Toy toy) {
		this.burger = burger;
		this.fries = fries;
		this.drink = drink;
		this.fruit = fruit;
		this.toy = toy;
	}
	
	void showMeal() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("     HAPPY MEAL :)   ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(burger);
		System.out.println(fries);
		System.out.println(drink);
		System.out.println(fruit);
		System.out.println(toy);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
	}

	static class Builder{
		
		Burger burger;
		Fries fries;
		Drink drink;
		Fruit fruit;
		Toy toy;
		
		Builder setBurger(Burger burger) {
			this.burger = burger;
			return this;
		}
		
		Builder setFries(Fries fries) {
			this.fries = fries;
			return this;
		}
		
		Builder setDrink(Drink drink) {
			this.drink = drink;
			return this;
		}
		
		Builder setFruit(Fruit fruit) {
			this.fruit = fruit;
			return this;
		}
		
		Builder setToy(Toy toy) {
			this.toy = toy;
			return this;
		}
		
		HappyMeal build() {
			HappyMeal meal = new HappyMeal(burger, fries, drink, fruit, toy);
			return meal;
		}
		
	}
	
}


public class McDonaldsHappyMealBuilder {

	public static void main(String[] args) {
		
		HappyMeal meal = new HappyMeal.Builder()
						.setBurger(new Burger())
						.setDrink(new Drink())
						.setFries(new Fries())
						.setFruit(new Fruit())
						.setToy(new Toy())
						.build();
		
		meal.showMeal();
	}

}
