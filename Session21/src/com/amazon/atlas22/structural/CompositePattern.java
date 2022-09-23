package com.amazon.atlas22.structural;

import java.util.ArrayList;
import java.util.List;

// Base Component
interface Shape{
	void draw();
}

// Leaf
class Rectangle implements Shape{
	
	String color;

	Rectangle(String color){
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle with color "+color);
	}
	
}

//Leaf
class Triangle implements Shape{
	
	String color;
	
	Triangle(String color){
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a Triangle with color "+color);
	}
}

//Leaf
class Circle implements Shape{
	
	String color;
	
	Circle(String color){
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a Circle with color "+color);
	}
}

// Composite
// Contains Leaf
class Drawing implements Shape{
	
	// Drawing is a collection of Shape Objects :)
	List<Shape> shapes = new ArrayList<Shape>();

	void add(Shape shape) {
		shapes.add(shape);
	}
	
	void remove(Shape shape) {
		shapes.remove(shape);
	}
	
	void clear() {
		shapes.clear();
	}
	
	@Override
	public void draw() {
		// In the Drawing, execute draw method for every Shape in the Drawing :)
		shapes.forEach((shape)->shape.draw());
	}
}


public class CompositePattern {

	public static void main(String[] args) {
		
		String selectedColor = "orange";
		
		Rectangle rectangle = new Rectangle(selectedColor);
		Triangle triangle = new Triangle(selectedColor);
		Circle circle = new Circle(selectedColor);

		Drawing drawing1 = new Drawing();
		drawing1.add(rectangle);
		drawing1.add(triangle);
		drawing1.add(circle);
		
		drawing1.draw();
		
		drawing1.clear();
		System.out.println();
		
		
		drawing1.add(rectangle);
		drawing1.add(circle);
		drawing1.draw();
		
		
	}

}
