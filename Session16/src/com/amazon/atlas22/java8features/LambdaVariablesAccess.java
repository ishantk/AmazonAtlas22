package com.amazon.atlas22.java8features;

interface Compare{
	boolean compare(int num1, int num2);
}

class Maths{
	
	static double pi = 2.14;
	int base = 2;
	
	Compare cref = (num1, num2) -> {
		
		//System.out.println("Pi is: "+pi);
		System.out.println("Pi is: "+Maths.pi);
		//System.out.println("base is: "+base);
		System.out.println("base is: "+this.base);
		
		return num1 > num2;
	};
	
}

public class LambdaVariablesAccess {

	public static void main(String[] args) {
		
		Maths maths = new Maths();
		
		boolean result = maths.cref.compare(10, 20);
		System.out.println("10 > 20 ? "+result);
	}

}
