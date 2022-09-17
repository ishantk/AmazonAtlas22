package com.amazon.atlas22.creational;


abstract class Product{
	
	int pid;
	String name;
	String brand;
	int price;
	
	abstract void show();
	
}

class Mobile extends Product{
	
	//...
	void show() {
		
	}
	
}

class TV extends Product{
	
	//..
	
	void show() {
		
	}
}

class AndroidMobile extends Mobile{
	
	void show() {
		System.out.println("This is an Android Phone :)");
	}

}

class IOSMobile extends Mobile{
	void show() {
		
	}
}

class LEDTV extends TV{
	void show() {
		
	}
}

class OLEDTV extends TV{
	void show() {
		
	}
}

interface AbstractProductFactory{
	Product createProduct(int type);
}

class MobileFactory implements AbstractProductFactory{
	
	public Product createProduct(int type) {
	
		if(type == 1) {
			return new AndroidMobile();
		}
		
		return null;
	}
}

class TVFactory implements AbstractProductFactory{
	
	public Product createProduct(int type) {
		
		return null;
	}
	
}

class ProductAbstractFactory{
	
	static AbstractProductFactory getFactory(int type) {
		
		AbstractProductFactory factory = null;
		
		if(type == 1) {
			factory = new MobileFactory();
		}else if(type == 2) {
			factory = new TVFactory();
		}else {
			
		}
		
		return factory;
		
	}
	
}

public class ProductAbstractFactoryAssignment {

	public static void main(String[] args) {
		
		AbstractProductFactory factory = ProductAbstractFactory.getFactory(1);
		Product product = factory.createProduct(1);
		product.show();

	}

}
