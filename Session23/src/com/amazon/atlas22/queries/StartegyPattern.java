package com.amazon.atlas22.queries;

interface Calculation{
	void calculate();
}

class CalculateShortestDistance implements Calculation{

	public void calculate() {
		System.out.println("Calculating Shortest Distance");
	}
}

class CalculatePathWithLeastTraffic implements Calculation{

	public void calculate() {
		System.out.println("Calculating Path With Least Traffic");
	}
}

class GoogleMaps{
	
	Calculation strategy(int type) {
		Calculation calculation;
		
		if(type == 1) {
			calculation = new CalculateShortestDistance();
		}else {
			calculation = new CalculatePathWithLeastTraffic();
		}
		
		return calculation;
	}
	
}

public class StartegyPattern {

	public static void main(String[] args) {
		
		GoogleMaps maps = new GoogleMaps();
		Calculation calculation = maps.strategy(2);
		calculation.calculate();

	}

}
