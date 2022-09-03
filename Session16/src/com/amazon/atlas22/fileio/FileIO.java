package com.amazon.atlas22.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIO {
	
	public void writeInFile(String data) {
		
		try {
			
			File file = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/student.txt");

			// Write the data as text 
			//FileWriter writer = new FileWriter(file);

			// Append Mode Enabled :)
			FileWriter writer = new FileWriter(file, true);
			writer.write(data);
			
			// Close the Stream: Release the memory resources..
			writer.close();
			
			System.out.println("``````````````````````````");
			System.out.println("Write Operation Finished..");
			System.out.println("Written the Data: ");
			System.out.println(data);
			System.out.println("``````````````````````````");
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void writeInFileWithBytes(String data) {
		
		try {
			
			File file = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/student.txt");

			// Write the data as bytes :) 
			//FileOutputStream stream = new FileOutputStream(file);

			// Append Mode Enabled :)
			FileOutputStream stream = new FileOutputStream(file, true);
			stream.write(data.getBytes());
			
			// Close the Stream: Release the memory resources..
			stream.close();
			
			System.out.println("``````````````````````````");
			System.out.println("Write Operation Finished..");
			System.out.println("Written the Data: ");
			System.out.println(data);
			System.out.println("``````````````````````````");
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void readFromFile() {
		
		try {
			
			//File file = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/student.txt");
			File file = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/com/amazon/atlas22/fileio/FileDemo.java");
			FileReader reader = new FileReader(file);			// Read Character By Character
			BufferedReader buffer = new BufferedReader(reader); // Read Line By Line
			
			int counter = 0;
			int comments = 0;
			//String line = buffer.readLine();
			String line = "";
			while((line = buffer.readLine()) != null) {
				System.out.println(line);
				if(line.contains("new")) {
					counter++;
				}
				
				if(line.contains("//")) {
					comments++;
				}
			}
			
			System.out.println("Total Objects Created: "+counter);
			System.out.println("Total Single Line Comments Created: "+comments);
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void readFromFileWithBytes() {
		
		try {
			
			File file = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/student.txt");
			FileInputStream stream = new FileInputStream(file);	// Read Byte By Byte
			
			int ch = 0;
			
			while((ch = stream.read()) != -1) {
				char chr = (char)ch;
				System.out.print(chr);
			}
			
			stream.close();
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public void readWithScanner() {
		try {
			File file = new File("/Users/ishant/Downloads/AmazonAtlas22/Session16/src/john.txt");
			Scanner scanner = new Scanner(file);
			
			String name = scanner.nextLine();
			String email = scanner.nextLine();
			int age = scanner.nextInt();
			
			scanner.close();
			
			System.out.println("Details Of John are: ");
			System.out.println(name+" "+email+" "+age);
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}

}
