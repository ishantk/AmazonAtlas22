package com.amazon.atlas22.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	
	
	static void printElements(Map<? extends Object, ? extends Object> map) {
		
		Set<? extends Object> keys = map.keySet();
		
		// Iterating in Keys
		Iterator<? extends Object> itr = keys.iterator();
		
		while(itr.hasNext()) {
			Object key = itr.next();
			Object value = map.get(key);
			
			System.out.println("KEY: "+key+" VALUE: "+value);
		}
		
		System.out.println();
	}
	
	static void printEntrySet(Map<? extends Object, ? extends Object> map) {
		
		Set entrySet = map.entrySet();
		Iterator itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Entry entry = (Entry) itr.next();
			System.out.println("KEY: "+entry.getKey()+" VALUE: "+entry.getValue());
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		
		Product p1 = new Product(101, "Apple iPhone", 70000);
		Product p2 = new Product(201, "Samsung Fold", 90000);
		Product p3 = new Product(301, "Apple MacBook", 120000);
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		Hashtable<Integer, Product> table = new Hashtable<Integer, Product>();
		
		
		map.put(101, "John");
		map.put(221, "Fionna");
		map.put(157, "Kim");
		map.put(null, "Kim");
		map.put(223	, null);
		map.put(345	, null);
		
		linkedMap.put(101, "John");
		linkedMap.put(221, "Fionna");
		linkedMap.put(157, "Kim");
		linkedMap.put(null, "Kim");
		linkedMap.put(223	, null);
		linkedMap.put(345	, null);
		
		treeMap.put("John", 28);
		treeMap.put("Fionna", 27);
		treeMap.put("Kim", 24);
		
		treeMap.put("John", 32); // UPDATE OPERATION
		
		//treeMap.put(null, 24);  // Cannot have a null key as for sorting, null cannot work :)
		treeMap.put("Noah", null);
		
		table.put(p1.pid, p1);
		table.put(p2.pid, p2);
		table.put(p3.pid, p3);
		//table.put(null, p3);	// Null Key and Null Value not allowed
		//table.put(112,null);

		printElements(map);
		printElements(linkedMap);
		printElements(treeMap);
		printElements(table);
		
		String name = map.get(221);
		System.out.println("name is: "+name);
		
		System.out.println("map is: "+map);
		map.remove(221);
		System.out.println("map now is: "+map);
		
		
		System.out.println(map.size());
		
		if(map.containsKey(101)) {
			System.out.println("Key 101 is in the HashMap");
		}
		
		if(map.containsValue("John")) {
			System.out.println("Value John is in the HashMap");
		}
		
		/*Set<Entry<Integer, String>>	entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		
		while(itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println("KEY: "+entry.getKey()+" VALUE: "+entry.getValue());
		}*/
		
		printEntrySet(map);
		printEntrySet(linkedMap);
		printEntrySet(treeMap);
		printEntrySet(table);
			
	}

}
