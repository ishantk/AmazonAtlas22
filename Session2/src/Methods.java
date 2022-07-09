// Name of the class can be any name
// We have kept the name as Methods (when we create a function inside a class, in java terminology we call it a method)
public class Methods {

	// We can create methods here, in the class.
	// either above main or below main
	
	
	// f(x) = y, where y is x*x + 1
	void f(int x) {
		int y = x*x + 1;
		System.out.println("f("+x+") = "+y);
	}
	
	
	// Creating the method max :)
	// max -> name of method
	// void -> return type which means return nothing
	// int[] array -> input or parameter
	
	// NON STATIC METHOD/ INSTANCE METHOD :)
	/*void max(int[] array) {
		int max = array[0];
		
		for(int element : array) {
			if(element > max) {
				max = element;
			}
		}
		
		System.out.println("MAX is: "+max);
	}*/
	
	// STATIC METHOD
	/*static void max(int[] array) {
		int max = array[0];
		
		for(int element : array) {
			if(element > max) {
				max = element;
			}
		}
		
		System.out.println("MAX is: "+max);
	}*/
	
	static int max(int[] array) {
		
		int max = array[0];
		
		for(int element : array) {
			if(element > max) {
				max = element;
			}
		}
		
		return max;
	}
	
	// main is a method :)
	// it is executed by JVM for us :)
	public static void main(String[] args) {
		
		int[] productPrices = {1200, 3500, 400, 500, 1400, 21000, 2700};
		int[] covidCasesStateWise = {2341, 5514, 88905, 6750, 2100};
		int[] scores = {90, 80, 30, 45, 67, 88, 110, 7, 9, 10, 11};
		
		/*int max = 0;
		
		max = productPrices[0];
		for(int element : productPrices) {
			if(element > max) {
				max = element;
			}
		}
		
		System.out.println("MAX in productPrices is: "+max);
		
		max = covidCasesStateWise[0];
		for(int element : covidCasesStateWise) {
			if(element > max) {
				max = element;
			}
		}
		
		System.out.println("MAX in covidCasesStateWise is: "+max);
		
		max = scores[0];
		for(int element : scores) {
			if(element > max) {
				max = element;
			}
		}
		
		System.out.println("MAX in scores is: "+max);*/
		
		//Execute the NON STATIC method max :)
		// non static methods: They have something to do with objects
		
		// 1. Create the Object of class. What is Object -> we will see in future
		//Methods mRef = new Methods(); // Object Construction Statement
		// mRef is the name of reference variable for the obejct and can be any name of your choice
		
		// 2. With reference to the Object, execute the method which we created inside the class
		//mRef.max(productPrices);
		//mRef.max(covidCasesStateWise);
		//mRef.max(scores);
		
		//Execute the STATIC method max :)
		// static methods: They have something to do with class
		//Methods.max(productPrices);
		//Methods.max(covidCasesStateWise);
		//Methods.max(scores);
		
		int result = Methods.max(productPrices);
		
		System.out.println("MAX in productPrices is: "+result);
		System.out.println("MAX in covidCasesStateWise is: "+Methods.max(covidCasesStateWise));
		System.out.println("MAX in scores is: "+Methods.max(scores));
		
		

	}

}





