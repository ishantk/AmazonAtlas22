package com.amazon.atlas22.queries;

enum ParkingSiteStatus {AVAILABLE, NOTAVAILABLE};

enum ParkingSiteInventory {

	TWO_WHEELERS(100), FOUR_WHEELERS(200);
		
	int value;
	ParkingSiteInventory(int value){
		this.value = value;
	}
	
}

public class EnumerationApp {

	public static void main(String[] args) {
		
		for(ParkingSiteStatus status : ParkingSiteStatus.values()) {
			System.out.println(status);
		}
		
		System.out.println();
		
		ParkingSiteStatus status1 = ParkingSiteStatus.AVAILABLE;
		System.out.println(status1);
		
		System.out.println();
		
		for(ParkingSiteInventory inventory : ParkingSiteInventory.values()) {
			System.out.println(inventory+" "+inventory.value);
		}
		
		

	}

}
