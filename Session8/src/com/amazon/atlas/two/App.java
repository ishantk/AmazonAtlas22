package com.amazon.atlas.two;

import com.amazon.atlas.one.One;
import static com.amazon.atlas.one.One.APP_NAME;;

//import com.amazon.atlas.one.Two; // error
// default is not accessible outside the package :)

// Inheritance across the package
class Three extends One{
	
	void show() {
		// pvtShow(); error
		// defShow(); error
		protShow();
		pubShow();
	}
	
}


public class App {

	public static void main(String[] args) {
		
		One one = new One();
		//one.pvtShow(); 		// visible only in the class, hence the error
		//one.defShow(); 		// visible only in the package, hence the error
		//one.protShow();		// visible only in the package, hence the error. works like default

		one.pubShow();			// Accessible EVERYWHERE :)
		
		System.out.println();
		
		Three three = new Three();
		three.show();
		
		System.out.println("APP_NAME is: "+APP_NAME);
							
	}

}

// private: not accessible outside the class
// default, protected and public all accessible everywhere in the same package
// default and protected not visible outside the package
// public is the only one which can be accessed outside the package i.e. accessible everywhere
// protected accessible in child outside the package but default is not :)





