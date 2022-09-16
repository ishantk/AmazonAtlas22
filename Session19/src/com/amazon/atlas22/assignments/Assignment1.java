package com.amazon.atlas22.assignments;

class Meal{
	
	String name;
	int amount;
	String timings;
	
	public Meal() {
		// TODO Auto-generated constructor stub
	}

	public Meal(String name, int amount, String timings) {
		this.name = name;
		this.amount = amount;
		this.timings = timings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	@Override
	public String toString() {
		return "Meal [name=" + name + ", amount=" + amount + ", timings=" + timings + "]";
	}
	
}

class ItalianMeal extends Meal{
	
}

interface MealService{
	void issueMealToCustomer(Meal meal, String customerEmail);
	void addBeverage();
}

class IndianMealService implements MealService{
	
	public void issueMealToCustomer(Meal meal, String customerEmail) {
		System.out.println("Issue a Veggie Meal to Customer "+customerEmail);
	}
	
	public void addBeverage() {
		System.out.println("Adding a tea to the meal");
	}
}

class ItalianMealService implements MealService{
	
	public void issueMealToCustomer(Meal meal, String customerEmail) {
		System.out.println("Issue a Italian Meal to Customer "+customerEmail);
	}
	
	public void addBeverage() {
		System.out.println("Adding a Coffee to the meal");
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		
		Meal meal = new Meal();
		ItalianMeal italianMeal = new ItalianMeal();
		
		IndianMealService indianMealService = new IndianMealService();
		indianMealService.issueMealToCustomer(meal, "john@example.com");
		
		ItalianMealService italianMealService = new ItalianMealService();
		italianMealService.issueMealToCustomer(italianMeal, "fionna@example.com");

	}

}
