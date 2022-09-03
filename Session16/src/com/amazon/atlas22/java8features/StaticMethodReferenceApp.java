package com.amazon.atlas22.java8features;

@FunctionalInterface
interface Maps{
	int getDistance(String location1, String location2);
}

class GoogleMaps{
	
	static int calculateDistance(String source, String destinition) {
		if(source.equals("Home") && destinition.equals("Work")) {
			return 10;
		}else {
			return 5;
		}
	}
	
}

public class StaticMethodReferenceApp {

	public static void main(String[] args) {
		
		// Static Method Reference :)
		Maps maps = GoogleMaps::calculateDistance;
		System.out.println("Distance from Home to Work is: "+maps.getDistance("Home", "Mall"));

	}

}
