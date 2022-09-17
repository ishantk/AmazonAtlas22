package com.amazon.atlas22.creational;

class CinemaHall{
	
	static private CinemaHall cinemaHall;
	
	private CinemaHall() {
		System.out.println("CinemaHall Object Constructed. HashCode: "+hashCode());
	}
	
	// Making the method Thread Safe :)
	// If one thread has executed getHall method, other thread has to wait for the method to finish
	public static synchronized CinemaHall getHall() {
		
		if(cinemaHall == null) {
			cinemaHall = new CinemaHall();
		}
		
		return cinemaHall;
	}
	
}

public class SingletonLazyMultiThreading {

	public static void main(String[] args) {
	
		// Multiple Threads will share the same class CinemaHall to get the reference of CinemaHall Object :)
		CinemaHall hall = CinemaHall.getHall();
		
	}

}
