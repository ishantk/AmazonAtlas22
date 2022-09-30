package com.amazon.atlas22.queries;

import java.util.Stack;

class Message{
	
	String text;
	
	Stack<String> stack; // A collection which will hold the Texts
	
	Message(){
		stack = new Stack<String>();
		text = "NA";
		
		stack.push(text);
	}
	
	void setMessage(String text){
		this.text = text;
		stack.push(text);
	}
	
	@Override
	public String toString() {
		return text;
	}

	public void undo() {
		if(stack.size() > 1) {
			stack.pop();
			text = stack.peek();
			System.out.println("Undo Executed");
		}else {
			System.out.println("We dont have much to go back..");
		}
	}
}

public class MementoPattern {

	public static void main(String[] args) {
	
		Message message = new Message();
		System.out.println("Message Initially is: "+message);
		
		message.setMessage("Hello, How Are You");
		System.out.println("Message is: "+message);
		
		message.setMessage("Lets catch up");
		System.out.println("Message is: "+message);
		
		// Undo1
		message.undo();
		
		// Undo2
		message.undo();
		
		// Undo3
		message.undo();
		
		System.out.println("Message is: "+message); // -> Hello, How Are You
		
		
	}

}
