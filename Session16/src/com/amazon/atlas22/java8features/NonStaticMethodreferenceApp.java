package com.amazon.atlas22.java8features;

@FunctionalInterface
interface Order{
	String getState(int state);
}

class ECommerceAppOrder{
	
	String getOrderStateOnEcommerceApp(int orderState) {
		
		if(orderState == 1)			return "ORDER PLACED";
		else if(orderState == 2)	return "ORDER IN SHIPPING";
		else if(orderState == 3)	return "ORDER DELIEVERD";
		else 						return "ORDER CANCELLED";
	}	
}

public class NonStaticMethodreferenceApp {

	public static void main(String[] args) {
		
		
		/*Order order = (state)->{
			
			if(state == 1)		return "ORDER PLACED";
			else				return "ORDER DELIVEERD";
			
		};
		
		System.out.println(order.getState(1));*/
		
		ECommerceAppOrder app = new ECommerceAppOrder();
		
		// Non Static Method Reference
		// To the Reference Variable of Order Functional Interface allocate the definition of ECommerceAppOrder Object Method i.e. getOrderStateOnEcommerceApp 
		Order order = app::getOrderStateOnEcommerceApp;
		System.out.println(order.getState(7));

	}

}
