package com.amazon.atlas22.structural;

interface Order{
	void placeOrder();
}

class FoodDelivery implements Order{
	
	class FoodDeliveryHelper{
		
		void selectRestaurant() {
			System.out.println("Restaurant Selected as McDonalds");
		}
		
		void addDishesToCart() {
			System.out.println("Adding Veggie Burger and Fries to the Cart");
		}
		
		void makePayment() {
			System.out.println("Paying using UPI");
		}
	}
	
	public void placeOrder() {
		FoodDeliveryHelper helper = new FoodDeliveryHelper();
		helper.selectRestaurant();
		helper.addDishesToCart();
		helper.makePayment();
		System.out.println("Order Succesfully Placed for Food Delivery....");
	}
}

class Dineout implements Order{
	
	class DineoutHelper{
	
		void selectRestaurant() {
			System.out.println("Restaurant Selected as Haldirams");
		}
		
		void reserveTable() {
			System.out.println("Reserved Table for 6 people");
		}
	}
	
	public void placeOrder() {
		DineoutHelper helper = new DineoutHelper();
		helper.selectRestaurant();
		helper.reserveTable();
		System.out.println("Dineout Confirmed...");
	}
}

class InstaMart implements Order{
	
	class InstaMartHelper{
		void addItemsToCart() {
			System.out.println("Adding Cookies, Rice and Maggi to the Cart");
		}
		
		void selectTimeForDelivery() {
			System.out.println("Deliver in Next 15 mins");
		}
		
		void makePayment() {
			System.out.println("Paying using Net Banking and extra amount of 15 for Instant Delivery");
		}
	}
	
	public void placeOrder() {
		
		InstaMartHelper helper = new InstaMartHelper();
		helper.addItemsToCart();
		helper.selectTimeForDelivery();
		helper.makePayment();
		System.out.println("Order Conformed for Instamart");
	}
	
}

class Genie implements Order{
	
	class GenieHelper{
		
		void selectProduct() {
			System.out.println("Need my medical Files to be delieverd");
		}
		
		void selectFromAndToLocation() {
			System.out.println("Pick up from Home and deliver to Doctor");
		}
		
		void makePayment() {
			System.out.println("Paying using Credit Card Delivery");
		}
	}
	
	
	public void placeOrder() {
		GenieHelper helper = new GenieHelper();
		helper.selectProduct();
		helper.selectFromAndToLocation();
		helper.makePayment();
		System.out.println("Genie Order Received...");
	}
	
}

class SwiggyFacade{
	
	public static Order selectOption(Choice choice) {
		
		Order order = null;
		
		switch (choice) {
			
			case FOOD_DELIVERY: 
				order = new FoodDelivery();
				break;
			
			case DINEOUT: 
				order = new Dineout();			
				break;
							
			case INSTAMART: 
				order = new InstaMart();
				break;
				
			case GENIE: 
				order = new Genie();
				break;
			
			default:
				System.out.println("Invalid Option");
				break;
		
		}
		
		return order;
		
	}
	
}

enum Choice{
	FOOD_DELIVERY, DINEOUT, INSTAMART, GENIE;
}

public class FacadePattern {

	public static void main(String[] args) {
		
		Order order = SwiggyFacade.selectOption(Choice.GENIE);
		order.placeOrder();
		
	}

}
