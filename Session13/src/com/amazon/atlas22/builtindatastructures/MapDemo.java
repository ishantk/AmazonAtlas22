package com.amazon.atlas22.builtindatastructures;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>();		// Polymorphic Statement
		//HashMap<Integer, String> map = new HashMap<Integer, String>();		// Direct Object Construction
		//LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();	// Sorts the data based on Keys
		
		// Hashtable is Synchronized and does not allow any null key or null value
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		// If the Key is a UserDefined Object :)
		//TreeMap<Product, String> map1 = new TreeMap<Product, String>();
		//TreeMap<Product, String> map1 = new TreeMap<Product, String>(new PriceComparator());
		
		map.put(101, "John");
		map.put(333, "Anna");
		map.put(112, "Dave");
		map.put(567, "Sia");
		map.put(189, "Kim");
		
		map.put(112, "Fionna"); // Update operation

		System.out.println("map size is: "+map.size());
		System.out.println("map is: ");
		System.out.println(map);
		
		System.out.println("Value at key 333 is: ");
		System.out.println(map.get(333));
		
		// Get all the Keys from the Map
		Set<Integer> keys = map.keySet();
		
		for(Integer key: keys) {
			System.out.println(key+" "+map.get(key));
		}
		
	}

}
