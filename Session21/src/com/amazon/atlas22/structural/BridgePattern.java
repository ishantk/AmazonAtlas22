package com.amazon.atlas22.structural;

/*
 	
 	7 Structural Patterns
 	1. Bridge
 	2. Adapter
 	3. Composite
 	4. Proxy	 (Explore)
 	5. FlyWeight (Explore
 	6. Facade
 	7. Decorator
 	
 */


interface Specifications{
	void setSpecificationsForCar();
	void displaySpecifications();
}


class PetrolCarSpecifications implements Specifications{

	int engine;
	int mileage;
	int power;
	
	@Override
	public void setSpecificationsForCar() {
		engine = 1497;
		mileage = 17;
		power = 113;
	}

	@Override
	public void displaySpecifications() {
		System.out.println("PetrolCar Specifications:");
		System.out.println("Engine: "+engine+"cc Mileage: "+mileage+"kms Power: "+power+"bhp");
	}
	
}

class DieselCarSpecifications implements Specifications{

	int engine;
	int mileage;
	int power;
	
	@Override
	public void setSpecificationsForCar() {
		engine = 1493;
		mileage = 21;
		power = 113;
	}

	@Override
	public void displaySpecifications() {
		System.out.println("DieselCar Specifications:");
		System.out.println("Engine: "+engine+"cc Mileage: "+mileage+"kms Power: "+power+"bhp");
	}
	
}

// We cannot create its Objects
// It is suppose to be a Parent for the children with some rules :)
abstract class Car{
	
	String name;
	String brand;
	int price;
	Specifications specifications;

	public Car(String name, String brand, int price, Specifications specifications) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.specifications = specifications;  // Link the Specs
		System.out.println("Car Launched..."); // An Object in memory
	}
	
	// Put up the Rules inside the Car
	abstract public void setUpCarDetails();
	abstract public void showCarDetails();
}

class PetrolCar extends Car{
	
	public PetrolCar(String name, String brand, int price, Specifications specifications) {
		super(name, brand, price, specifications);
	}

	@Override
	public void setUpCarDetails() {
		specifications.setSpecificationsForCar();
	}

	@Override
	public void showCarDetails() {
		System.out.println("Petrol Car Details:");
		System.out.println("Name: "+name+" Brand: "+brand+" Price: "+price);
		specifications.displaySpecifications();
	}
	
}

class DieselCar extends Car{

	public DieselCar(String name, String brand, int price, Specifications specifications) {
		super(name, brand, price, specifications);
	}

	
	@Override
	public void setUpCarDetails() {
		specifications.setSpecificationsForCar();
	}

	@Override
	public void showCarDetails() {
		System.out.println("Diesel Car Details:");
		System.out.println("Name: "+name+" Brand: "+brand+" Price: "+price);
		specifications.displaySpecifications();
	}
	
}


public class BridgePattern {

	public static void main(String[] args) {
		
		// Create Specifications Separately
		Specifications petrolSpecs = new PetrolCarSpecifications();
		Specifications dieselSpecs = new DieselCarSpecifications();
		
		
		Car petrolCar = new PetrolCar("Creta", "Hyundai", 1000000, petrolSpecs);
		Car dieselCar = new DieselCar("Creta", "Hyundai", 1100000, dieselSpecs);
		
		petrolCar.setUpCarDetails();
		dieselCar.setUpCarDetails();
		
		System.out.println();
		
		petrolCar.showCarDetails();
		System.out.println();
		dieselCar.showCarDetails();

	}

}
