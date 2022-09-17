package com.amazon.atlas22.creational;

// Eager Initialization with Exception Handling :)
class HomePage{
	
	boolean isInternetAvailable = false;
	static HomePage page;
	/* Invalid Use of Code
		try {
			static HomePage page = new HomePage();
		}catch(Exception e) {
			e.printStackTrace();
		}
	*/
	
	private HomePage() {
		
		// Due to some logical part, exceptions may be thrown and hence, program can crash
		if(!isInternetAvailable) {
			throw new ArithmeticException("Internet Not Available");
		}
		
		System.out.println("HomePage Object Constructed "+hashCode());
	}
	
	// Create a static initialization block
	static {
		try {
			page = new HomePage();
		}catch(Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	static HomePage getPage() {
		return page;
	}
	
}

public class SingletonWithBlock {

	public static void main(String[] args) {
		
		HomePage page1 = HomePage.getPage();
		HomePage page2 = HomePage.getPage();
		
		if(page1!=null)
			System.out.println("Page1 is: "+page1.hashCode());
		
		if(page2!=null)
			System.out.println("Page2 is: "+page2.hashCode());

	}

}
