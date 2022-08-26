package com.amazon.atlas22.builtindatastructures;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("John");
		stack.push("Jennie");
		stack.push("Jim");
		stack.push("Jack");
		stack.push("Joe");
		
		System.out.println("Stack Size is: "+stack.size());
		System.out.println("Stack is: "+stack);
		
		stack.pop();
		stack.pop();
		
		System.out.println("Stack Size Now is: "+stack.size());
		System.out.println("Stack Now is: "+stack);
		
		System.out.println("peek: "+stack.peek());
		System.out.println(stack.get(0));

	}

}
