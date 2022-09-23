package com.amazon.atlas22.behavioral;

import java.util.ArrayList;
import java.util.List;

interface DineInRestaurantRequests{
	void serveStarters();
	void serveMainCourse();
	void serveDesserts();
}

class IndianRestaurant implements DineInRestaurantRequests{

	@Override
	public void serveStarters() {
		System.out.println("Serving Starters....");
		System.out.println("Serving Paneer Tikka and Manchurian");
	}

	@Override
	public void serveMainCourse() {
		System.out.println("Serving Main Course....");
		System.out.println("Serving Paneer Butter Masala, Dal Makhani and Lachha Paratha");
	}

	@Override
	public void serveDesserts() {
		System.out.println("Serving Desserts....");
		System.out.println("Serving Gulab Jamun and Gajar Ka Halwa");
	}
	
}

class ItalianRestaurant implements DineInRestaurantRequests{
	
	@Override
	public void serveStarters() {
		System.out.println("Serving Starters....");
		System.out.println("Serving Garlic Breads");
	}

	@Override
	public void serveMainCourse() {
		System.out.println("Serving Main Course....");
		System.out.println("Serving Pizzas and Pastas");
	}

	@Override
	public void serveDesserts() {
		System.out.println("Serving Desserts....");
		System.out.println("Serving Chocolate Truffle");
	}
}

interface Command{
	void execute();
}

class ServeStartersCommand implements Command{

	DineInRestaurantRequests requests;
	
	ServeStartersCommand(DineInRestaurantRequests requests){
		this.requests = requests;
	}
	
	@Override
	public void execute() {
		requests.serveStarters();
	}
	
}

class ServeMainCourseCommand implements Command{

	DineInRestaurantRequests requests;
	
	ServeMainCourseCommand(DineInRestaurantRequests requests){
		this.requests = requests;
	}
	
	@Override
	public void execute() {
		requests.serveMainCourse();
	}
	
}

class ServeDessertsCommand implements Command{

	DineInRestaurantRequests requests;
	
	ServeDessertsCommand(DineInRestaurantRequests requests){
		this.requests = requests;
	}
	
	@Override
	public void execute() {
		requests.serveDesserts();
	}
	
}

class RestaurantManager{
	
	List<Command> commands = new ArrayList<Command>();
	
	void acceptCommand(Command command) {
		commands.add(command);
	}
	
	void executeCommands() {
		for(Command command : commands) {
			
			command.execute();
			System.out.println();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class CommandPattern {

	public static void main(String[] args) {
		
		DineInRestaurantRequests request; 
		//request = new IndianRestaurant();
		request = new ItalianRestaurant();
		
		Command command1 = new ServeStartersCommand(request);
		Command command2 = new ServeMainCourseCommand(request);
		Command command3 = new ServeDessertsCommand(request);
		
		RestaurantManager manager = new RestaurantManager();
		manager.acceptCommand(command1);
		manager.acceptCommand(command2);
		manager.acceptCommand(command3);
		
		manager.executeCommands();

	}

}
