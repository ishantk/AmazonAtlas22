package com.amazon.atlas22.java8features;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	/*void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum is: "+sum);
	}
	
	void add(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		System.out.println("Sum is: "+sum);
	}*/
	
	void add(int...numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		System.out.println("Sum is: "+sum);
	}
	
	public static void main(String[] args) {
		
		/*StreamAPIDemo sRef = new StreamAPIDemo();
		sRef.add(10, 20);
		sRef.add(10, 20, 30);
		sRef.add(10, 20, 30, 40, 50, 60);*/
		
		List<Integer> numbers = (List<Integer>) Arrays.asList(10, 20, 30, 40, 50, 60);
		numbers.forEach((number) -> System.out.println(number));
		
		System.out.println("~~~~~~~~~~~");
		
		// Executing stream method on Collection returns a Stream Object :)
		
		//Stream<Integer> stream = numbers.stream();
		//System.out.println(stream.count());
		
		//List<Integer> newNumbers = stream.map(x -> x*x).collect(Collectors.toList());
		//newNumbers.forEach((number) -> System.out.println(number));
		
		numbers.stream().map(x -> x*x).forEach(number -> System.out.println(number));
		System.out.println();
		
		List<String> names = Arrays.asList("Kia", "Anna", "Dave", "Harry", "Kristine", "Kim");
		System.out.println(names);
		
		List<String> filteredNamesWithK	= names.stream().filter(s->s.startsWith("K")).collect(Collectors.toList());
		filteredNamesWithK.forEach((name)->System.out.println(name));
		
		try {
			
			BufferedReader buffer = new BufferedReader(new FileReader(new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/com/amazon/atlas22/fileio/FileDemo.java")));
			ArrayList<String> lines = new ArrayList<String>();
			
			String line = "";
			while((line = buffer.readLine()) != null) {
				lines.add(line);
			}
			
			buffer.close();
			
			List<String> objects = lines.stream().filter(s->s.contains("new")).collect(Collectors.toList());
			objects.forEach((objectLine)->System.out.println(objectLine));
			
			System.out.println();
			
			List<String> sortedObjects = objects.stream().sorted().collect(Collectors.toList());
			sortedObjects.forEach((objectLine)->System.out.println(objectLine));
			
			// Explore -> reduce :)
			//numbers.stream().reduce(null) :)
		} catch (Exception e) {
			System.out.println("Something Went Wrong..."+e);
		}
	}

}
