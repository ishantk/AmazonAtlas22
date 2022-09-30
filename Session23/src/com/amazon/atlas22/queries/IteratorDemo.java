package com.amazon.atlas22.queries;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("John");
		set.add("Fionna");
		set.add("Kim");
		set.add("John");
		set.add("Anna");
		set.add("Dave");
		
		System.out.println(set);
		
		// HashSet works on hashing
		// no indexing is available -> Hence we cannot use for loops
		
		Iterator<String> itr = set.iterator();
		System.out.println(itr.next());
		
		System.out.println();
		
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
		

	}

}
