package com.amazon.atlas22.builtindatastructures;
import java.util.ArrayList;
import java.util.List;

/*
 		List
 			ArrayList
 			LinkedList
 			Vector
 			Stack
 			
 		Queue
 			PriorityQueue
 			
 		Set
 			HashSet
 			LinkedHashSet
 			TreeSet
 			
 		Map
 			Hashtable
 			HashMap
 			LinkedHashMap
 	
 */

class Employee{
	int eid;
	String name;
}

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.eid = 101;
		e1.name = "John";
		
		e2.eid = 201;
		e2.name = "Fionna";
		
		// ArrayList -> Hetrogeneous -> Can Store any Type
		ArrayList list1 = new ArrayList();
		
		//  ArrayList -> Homogeneous -> Can Store only Strings
		ArrayList<String> list2 = new ArrayList<String>();
		
		// Polymorphic Statement :)
		List<String> list3 = new ArrayList<String>();
		
		List<Employee> list4 = new ArrayList<Employee>();
		
		list1.add(10);			// 0
		list1.add(2.2);			// 1
		list1.add("Hello");		// 2
		list1.add(e1);			// 3
		
		list2.add("John");		// 0
		list2.add("Fionna");	// 1
		list2.add("Jack");		// 2
		list2.add("Dave");		// 3
		list2.add("Kia");		// 4
		list2.add("Anna");		// 5
		//list2.add(e1);
		//list2.add(10);
		
		list3.add("Harry");		// 0
		list3.add("George");	// 1
		list3.add("Sia");		// 2
		
		list4.add(e1);			// 0
		list4.add(e2);			// 1
		//list4.add(10);
		//list4.add("Sia");
		
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("list3 size is: "+list3.size());
		System.out.println("list4 size is: "+list4.size());
		
		System.out.println(list1.get(0));
		System.out.println(list2.get(1));
		System.out.println(list3.get(2));
		System.out.println(list4.get(0));
		
		System.out.println();
		System.out.println("Iterating in List2");
		/*for(int idx=0;idx<list2.size();idx++) {
			System.out.println(list2.get(idx));
		}*/
		
		for(String name : list2) {
			System.out.println(name);
		}
		
		System.out.println("list2 is: "+list2);
		
	}

}
