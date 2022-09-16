package com.amazon.atlas22.solid;

// Fat Interface
/*interface InfMessage{
	void createMessage(String text);
	void deleteMessage(Integer messageId);
	void notifyUserForMessage(String notificationTitle);
}*/

// ISP
interface InfMessage{
	void createMessage(String text);
	void deleteMessage(Integer messageId);
}

interface InfNotification{
	void notifyUserForMessage(String notificationTitle);
}

/*class CA implements InfMessage, InfNotification{
	
}

class CB implements InfMessage{
	
}

class CC implements InfNotification{
	
}*/

// Fat Interface
/*interface PizzaStore{
	void placeOrderOnline();
	void deliveryLocation();
	void deliveryValet();
	void restaurantManagerForOrder();
	void allocateTableToCustomer();
}*/

// ISP :)
interface PizzaDeliveryAtHome{
	void placeOrderOnline();
	void deliveryLocation();
	void deliveryValet();
}

interface InStorePizzaDelivery{
	void restaurantManagerForOrder();
	void allocateTableToCustomer();
}



public class InterfaceSegregationPrinciple {

	public static void main(String[] args) {
		

	}

}
