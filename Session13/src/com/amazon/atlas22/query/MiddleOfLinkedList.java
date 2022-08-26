package com.amazon.atlas22.query;

import java.util.LinkedList;

public class MiddleOfLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		names.add("John");		//	0
		names.add("Fionna");	//  1
		names.add("Sia");		//  2
		names.add("Kim");		//  3
		names.add("George");	//  4
		
		int size = names.size();
		int middle = size/2;
		System.out.println("Middle is: "+middle);
		System.out.println("Middle from List: "+names.get(middle));
	}

}
