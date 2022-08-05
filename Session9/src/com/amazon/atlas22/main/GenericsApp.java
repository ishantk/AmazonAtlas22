package com.amazon.atlas22.main;

class MyNode<T>{
	
	T data; // data type of data will by dynamic now
	MyNode<T> left;
	MyNode<T> right;
	
}

public class GenericsApp {

	public static void main(String[] args) {
		
		MyNode<Integer> node1 = new MyNode<Integer>();
		MyNode<String> node2 = new MyNode<String>();

	}

}
