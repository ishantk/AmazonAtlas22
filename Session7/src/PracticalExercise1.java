// Hierarchy
class Product{
	
	int pid;
	String name;
	String brand;
	int price;
	String color;
	
}

class Shoe extends Product{
	
	int shoeSize;		// 5, 6, 7, 8, 9
	String soulType;	
	
}

class Shirt extends Product{
	
	String shirtSize; // Small, Medium, Large, ExtraLarge
	String fabricQuality;
	
}

class MobilePhone extends Product{
	
	int screenSize;
	int ram;
	int memory;
	String operatingSystem;

}

// Multi Level
class A{
	
}

class B extends A{
	
}

class C extends B{
	
}

/*class D{
	
}

class E extends A, D{ // error: More than 1 Parent not allowed
	
}*/

class NetflixMobilePlan{
	
	int numOfScreens;
	int numOfPhones;
	boolean unlimitedMovies;
	boolean watchOnPhoneTab;
	int price;
	
	NetflixMobilePlan(){
		numOfPhones = 1;
		numOfScreens = 1;
		unlimitedMovies = true;
		watchOnPhoneTab = true;
		price = 149;
	}
	
}

class NetflixBasicPlan extends NetflixMobilePlan{
	
	boolean watchOnLaptopTV;
	
	NetflixBasicPlan(){
		watchOnLaptopTV = true;
		price = 199; // update price in the Parent object as 199
	}
	
}

class NetflixStandardPlan extends NetflixBasicPlan{
	
	boolean hdAvailable;
	
	NetflixStandardPlan(){
		numOfPhones = 2;
		numOfScreens = 2;
		hdAvailable = true;
		price = 499; // update price in the Parent object as 499
	}
	
}

class NetflixPremiumPlan extends NetflixStandardPlan{
	
	boolean ultraHDAvailable;
	
	NetflixPremiumPlan(){
		numOfPhones = 4;
		numOfScreens = 4;
		ultraHDAvailable = true;
		price = 649; // update price in the Parent object as 649
	}
	
}

public class PracticalExercise1 {

	public static void main(String[] args) {
		
		//Shoe shoe = new Show(//....);
		//Shirt shirt = new Shirt(//....);
		//MobilePhone phone = new MobilePhone(//....);

	}

}
