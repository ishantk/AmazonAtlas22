package com.amazon.atlas22.behavioral;

interface State{
	String getStateDescription();
}

class Ordered implements State{
	
	String dateTimeStamp;
	
	Ordered(){
		dateTimeStamp = "23rd September, 2022 | 13:43";
	}

	@Override
	public String getStateDescription() {
		return "Ordered - "+dateTimeStamp;
	}
	
}

class Shipped implements State{
	
	String dateTimeStamp;
	
	Shipped(){
		dateTimeStamp = "24th September, 2022 | 22:17";
	}
	
	@Override
	public String getStateDescription() {
		return "Shipped - "+dateTimeStamp;
	}
}

class Delivered implements State{
	
	String dateTimeStamp;
	
	Delivered(){
		dateTimeStamp = "25th September, 2022 | 10:00";
	}
	
	@Override
	public String getStateDescription() {
		return "Delivered - "+dateTimeStamp;
	}
}

class Order{
	
	State state; // Has-A | Order Has-A State :)
	
	void updateState(State state) {
		this.state = state;
	}
	
	void showOrderState() {
		System.out.println(state.getStateDescription());
	}
}

class User{
	
	void placeOrder(Order order) {
		System.out.println("User Placed an Order");
		order.updateState(new Ordered()); // State Updated by User when a new Order is Placed
	}
	
}

class Logistics{
	void shipOrder(Order order) {
		System.out.println("Logistics Received Order");
		order.updateState(new Shipped());
	}
}


class DeliveryAgent{
	void deliverOrder(Order order) {
		System.out.println("Delivery Agent, Delivered the Order");
		order.updateState(new Delivered());
	}
}

public class StatePattern {

	public static void main(String[] args) {
		
		User user = new User();
		Order order = new Order();
		
		user.placeOrder(order);
		order.showOrderState();
		
		System.out.println();
		
		Logistics logistics = new Logistics();
		logistics.shipOrder(order);
		order.showOrderState();
				
		System.out.println();
		
		DeliveryAgent agent = new DeliveryAgent();
		agent.deliverOrder(order);
		order.showOrderState();
		
	}

}
