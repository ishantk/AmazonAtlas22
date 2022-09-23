package com.amazon.atlas22.structural;

class BaseFare{
	
	private int fare;
	
	public BaseFare(int fare){
		this.fare = fare;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

}

class Cab{
	
	public BaseFare getBaseFare(){ // Cab Has-A base Fare, which is created and returned right from the getter method :)
		BaseFare fare = new BaseFare(80);
		return fare;
	}
	
}

// Interface which can give us 5 different Base Fares
// Objective: Converting the BaseFare into another BaseFare :)
interface CabAdapter{
	
	BaseFare getMiniCabFare();
	BaseFare getSedanCabFare();
	BaseFare getLuxuryCabFare();
	BaseFare getAutoCabFare();
	BaseFare getBikeCabFare();
	
}

// Object Adapter Implementation
// A Class will simply define the methods for the usage
class CabAdapterImplementation implements CabAdapter{
	
	// A Cab Object
	Cab cab = new Cab(); // Has-A Relationship | Adapter Implementation is having Cab as an Object
	
	@Override
	public BaseFare getMiniCabFare() {
		return cab.getBaseFare();
	}

	@Override
	public BaseFare getSedanCabFare() {
		BaseFare baseFare = cab.getBaseFare(); 
		return convertBaseFare(baseFare, 50);
	}

	@Override
	public BaseFare getLuxuryCabFare() {
		BaseFare baseFare = cab.getBaseFare(); 
		return convertBaseFare(baseFare, 120);
	}

	@Override
	public BaseFare getAutoCabFare() {
		BaseFare baseFare = cab.getBaseFare(); 
		return convertBaseFare(baseFare, -20);
	}

	@Override
	public BaseFare getBikeCabFare() {
		BaseFare baseFare = cab.getBaseFare(); 
		return convertBaseFare(baseFare, -40);
	}
	
	// Conversion Method in Adapter :)
	private  BaseFare convertBaseFare(BaseFare fare, int amount) {
		BaseFare baseFare = new BaseFare(fare.getFare() + amount);
		return baseFare;
	}
}

public class AdapterPattern {

	public static void main(String[] args) {
		
		CabAdapterImplementation adapter = new CabAdapterImplementation();
		
		//BaseFare fare = adapter.getMiniCabFare();
		//BaseFare fare = adapter.getSedanCabFare();
		//BaseFare fare = adapter.getLuxuryCabFare();
		//BaseFare fare = adapter.getAutoCabFare();
		BaseFare fare = adapter.getBikeCabFare();
		System.out.println("Base Fare is: \u20b9"+fare.getFare());

	}

}
