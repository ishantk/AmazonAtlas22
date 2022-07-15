/*
 
 	OOPS:
    Object Oriented Programming Structure
    Here, we are focussing on Object as we are saying Object Oriented

    Real World
        Object is anything which exists in Reality :)
        eg: Bottle, Laptop, Phone, Slippers, Shoes, Cup, You and Me

        Class is drawing of an Object
        Class is a representation of how an object looks like in the memory :)

        Every Object has its drawing

    Computer Science
        Object is a Storage Container
        It is a Multi Value Container
        It can be homogeneous or hetrogeneous 

        Class is a way to define how the object will look like in memory
        We code the object structure by writing class


    Principle Of OOPS
        1. Think of Object
        2. Define it using class
        3. Create the real object in memory
        

    Client: John
    Requirements: Food Delivery App
    I wish to create a food delivery app like Zomato or Swiggy with some enhancement on your dishes may be added from different restaurants to be delivered.
    Users should create accounts, add dishes from the Resturant into the cart and place an order.
    User should also update Address in Profile where the order will be delivered.
    
    We as Team:
    Apply Principle of OOPS
        1. Think of Object
            User -> name, phone, email, gender, address .....
            here, User is an Object, (name, phone, email, gender, address) are attributes of User
            Restaurant -> name, phone, email, address, ratings, category ......
            Dish -> name, description, rating, price
        2.  Define class -> Create Program              
        3.  Create the real object in memory -> In the main method use new operator and create an object in memory

    Further,
    Objects are RELATED to each Other
    1. 1 to 1
        eg: 1 User has 1 Address
    2. 1 to many
        1 Resturant has many Dishes
        1 User can place many Orders
        1 DeliveryAgent can deliver many Orders
    3. Many to Many
        Many Users can Place Many Orders    
 
 */

// Let us Code Dish Object

// 1. Think of Object -> thinking about data associated with the object 
//		Dish -> name, description, rating, price, quantity

// 2. Create Class which defines the Object Dish
class Dish{ // Class Dish is representation of the Object Dish :)
	
	// Create Attributes of Dish Object
	// Data Members or Instance Variables or State of an Object
	String name;
	String description;
	double ratings;
	int price;
	int quantity;
	
}


public class OOPSPart1 {

	public static void main(String[] args) {
		
		// 3.  Create the real object in memory
		// Object Construction Statement
		Dish dish1 = new Dish(); //new Dish(); -> command to create a Dish Object in memory
		
		// Dish dish1 is creating a reference variable, which can be any meaningful name of your choice
		// dish1 will hold hashcode of Dish Object
		
		// new creates the object in the memory in the HEAP Region at RUN TIME
		Dish dish2 = new Dish();
		
		// Reference Copy Operation :)
		Dish dish3 = dish1;
		
		// Printing the reference variable we will see the HashCode of Object
		System.out.println("dish1 is: "+dish1);
		System.out.println("dish2 is: "+dish2);
		
		// Operations On Objects

		// 1. Write Data Into Object
		dish1.name = "Veggie Burger";
		dish1.description = "Mc Donalds Suprememe Veggie Burger with herbs and Spices";
		dish3.ratings = 4.5;
		dish1.price = 200;
		dish3.quantity = 1;
		
		dish2.name = "Fries";
		dish2.description = "Mc Donalds Hot Salty Crispy Potato Fries";
		dish2.ratings = 5.0;
		dish2.price = 100;
		dish2.quantity = 1;
		
		// 2. Update Data Into Object
		dish3.price += 50;
		
		dish2.quantity++;
		dish2.quantity++;
		
		System.out.println();
		
		// 3. Read Data From Object
		System.out.println("dish1: "+dish1+" data");
		System.out.println(dish1.name+" is priced at "+dish1.price+" with ratings of "+dish1.ratings);
		System.out.println();
		
		System.out.println("dish2: "+dish2+" data");
		System.out.println(dish2.name+" is priced at "+dish2.price+" with ratings of "+dish2.ratings);
		System.out.println();
		
		System.out.println("dish3: "+dish3+" data");
		System.out.println(dish3.name+" is priced at "+dish3.price+" with ratings of "+dish3.ratings);
		System.out.println();
		
		// 4. Delete Objects
		// This is taken care automatically by GC
		// Garbage Collector look for the Objects which are unused in the memory and delete them from the Heap :)
		System.gc(); // Executes GC to look for unused objects and remove them from memory

	}

}
