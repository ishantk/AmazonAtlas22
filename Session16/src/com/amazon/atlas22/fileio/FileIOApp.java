package com.amazon.atlas22.fileio;

import java.util.Scanner;

public class FileIOApp {

	public static void main(String[] args) {
		
		//String studentDetails1 = "1 John 28\n";
		//String studentDetails2 = "201 Fionna 27\n";
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter Student Roll Number: ");
		int roll = scanner.nextInt();
		
		System.out.println("Enter Student Age: ");
		int age = scanner.nextInt();
		
		scanner.close();
		
		String studentDetails = roll+" "+name+" "+age+"\n";
		*/
		FileIO io = new FileIO();
		//io.writeInFile(studentDetails);
		//io.readFromFile();
		
		//io.readWithScanner();
		
		//io.writeInFileWithBytes(studentDetails);
		io.readFromFileWithBytes();
		

	}

}
