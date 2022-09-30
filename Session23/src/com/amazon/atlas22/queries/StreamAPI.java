package com.amazon.atlas22.queries;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Dish{
	
	String name;
	int price;
	
	public Dish() {
	}

	public Dish(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", price=" + price + "]";
	}
	
}

public class StreamAPI {

	public static void main(String[] args) {
		
		Dish dish1 = new Dish("Noodles", 200);
		Dish dish2 = new Dish("Burger", 100);
		Dish dish3 = new Dish("Fries", 70);
		Dish dish4 = new Dish("Coke", 20);
		Dish dish5 = new Dish("Chocolate", 30);
		
		List<Dish> dishes = new ArrayList<Dish>();
		dishes.add(dish1);
		dishes.add(dish2);
		dishes.add(dish3);
		dishes.add(dish4);
		dishes.add(dish5);
		
		/*for(Dish dish : dishes) {
			if(dish.price > 90) {
				System.out.println(dish);
			}
		}*/
		
		List<Dish> filteredDishes = dishes.stream().filter(dish -> dish.price < 90).collect(Collectors.toList());
		filteredDishes.forEach((dish)-> System.out.println(dish));
		
		//map, reduce methods :)

	}

}
