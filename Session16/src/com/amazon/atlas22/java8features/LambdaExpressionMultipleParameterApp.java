package com.amazon.atlas22.java8features;

@FunctionalInterface
interface LocationListener{
	void onLocationChanged(double latitude, double longitude);
}

class TrackingApp implements LocationListener{
	@Override
	public void onLocationChanged(double latitude, double longitude) {
		System.out.println("A new Location Received");
		System.out.println("GeoPoints: "+latitude+", "+longitude);
	}
}

public class LambdaExpressionMultipleParameterApp {

	public static void main(String[] args) {
		
		LocationListener listener = (latitude, longitude)->{
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("A new Location Received");
			System.out.println("GeoPoints: "+latitude+", "+longitude);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		};
		
		listener.onLocationChanged(75.2333, 72.8765);
	}
}
