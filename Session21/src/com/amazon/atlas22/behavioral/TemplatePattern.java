package com.amazon.atlas22.behavioral;

/*
 	
 	Behavioral
 	
 	1. Template *
 	2. Mediator
 	3. Chain Of Responsibility *
 	4. Observer *
 	5. Strategy
 	6. Command *
 	7. State *
 	8. Visitor
 	9. Interpreter
 	10. Interator
 	11. Memento
 	
 */

// Template Class
abstract class PizzaOrderTemplate{
	
	// Template Method
	// final -> hence no child class can override :)
	public final void orderPizza() {
		selectCrust();
		selectSize();
		selectToppings();
		makePayment();
	}
	
	abstract void selectCrust();
	abstract void selectSize();
	abstract void selectToppings();
	abstract void makePayment();
}

// Concrete Classes -> i.e. Child Classes for PizzaOrderTemplate
class VegPizzaOrder extends PizzaOrderTemplate{

	@Override
	void selectCrust() {
		System.out.println("[VegPizzaOrder] Selecting Crust as Thin");
	}

	@Override
	void selectSize() {	
		System.out.println("[VegPizzaOrder] Selecting Size as Medium");
	}

	@Override
	void selectToppings() {
		System.out.println("[VegPizzaOrder] Selecting Extra Cheese, Bell Peppers and Paneer");
	}

	@Override
	void makePayment() {
		System.out.println("[VegPizzaOrder] Making Payment...");
	}
	
}

class NonVegPizzaOrder extends PizzaOrderTemplate{
	
	@Override
	void selectCrust() {
		System.out.println("[NonVegPizzaOrder] Selecting Cheese Filled American Hand Tossed Crust");
	}

	@Override
	void selectSize() {	
		System.out.println("[NonVegPizzaOrder] Selecting Size as Large");
	}

	@Override
	void selectToppings() {
		System.out.println("[NonVegPizzaOrder] Selecting Extra Cheese, Chicken Nuggets and Extra Corns");
	}

	@Override
	void makePayment() {
		System.out.println("[NonVegPizzaOrder] Making Payment...");
	}
}

public class TemplatePattern {

	public static void main(String[] args) {
		
		//PizzaOrderTemplate orderTemplate = new VegPizzaOrder();
		PizzaOrderTemplate orderTemplate = new NonVegPizzaOrder();
		orderTemplate.orderPizza();

	}

}
