package com.amazon.atlas22.main;

import java.util.LinkedList;
import java.util.TreeMap;

public class CollectionApp {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("John");
		list.add("Jennie");
		list.add("Anna");
		list.add("Dave");
		list.add("Harry");
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("John", 95);
		map.put("Anna", 75);
		map.put("Dave", 55);
		map.put("Sia", 88);
		map.put("Kim", 75);
		
		System.out.println("list is:");
		System.out.println(list);
		
		System.out.println();
		
		System.out.println("map is:");
		System.out.println(map);

	}

}
