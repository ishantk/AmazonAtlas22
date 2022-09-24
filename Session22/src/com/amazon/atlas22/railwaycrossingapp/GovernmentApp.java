package com.amazon.atlas22.railwaycrossingapp;

import java.util.Map;
import java.util.Scanner;

import com.amazon.atlas22.railwaycrossingapp.controller.RailwayCrossingController;
import com.amazon.atlas22.railwaycrossingapp.model.RailwayCrossing;
import com.amazon.atlas22.railwaycrossingapp.model.User;

public class GovernmentApp {
	
	RailwayCrossingController controller;
	Scanner scanner;
	
	private static GovernmentApp app;
	
	public static GovernmentApp getInstance() {
		if(app == null) {
			app = new GovernmentApp();
		}
		return app;
	}
	
	private GovernmentApp(){
		controller = RailwayCrossingController.getInstance();
		scanner = new Scanner(System.in);
	}
	
	void listCrossings() {
		
		Map<String, RailwayCrossing> crossings = (Map<String, RailwayCrossing>) controller.fetchCrossings();
		for(String key : crossings.keySet()) {
			System.out.println(crossings.get(key));
			System.out.println("-------------------------------");
		}

	}
	
	void addCrossing() {
		
		// Empty Next Line for Scanner Issue
		scanner.nextLine();
		
		User user = new User();
		RailwayCrossing crossing = new RailwayCrossing();
		
		System.out.println("Enter Person InCharge Details");
		
		System.out.println("Enter Name: ");
		user.setName(scanner.nextLine());
		
		System.out.println("Enter Email: ");
		user.setEmail(scanner.nextLine());
		
		System.out.println("Enter Password: ");
		user.setPassword(scanner.nextLine());
		
		user.setUserType(3);
		

		System.out.println("Enter Railway Crossing Details");

		System.out.println("Enter Crossing Name: ");
		crossing.setName(scanner.nextLine());
		
		System.out.println("Enter Crossing Address: ");
		crossing.setAddress(scanner.nextLine());
		
		System.out.println("Enter Crossing Schedule: ");
		String scheduleKey = scanner.nextLine();
		String scheduleValue = scanner.nextLine();
		
		crossing.getSchedules().put(scheduleKey, scheduleValue);
		crossing.setPersonInCharge(user);
		
		if(controller.addOrUpdateCrossing(crossing)) {
			System.out.println(crossing.getName()+" Added Successfully...");
		}else {
			System.err.println("Something Went Wrong. Please Try Again");

		}
	}
	
	void login() {
		User user = new User();
		
		// Empty Next Line for Scanner Issue
		
		System.out.println("Enter Email: ");
		user.setEmail(scanner.nextLine());
		
		System.out.println("Enter Password: ");
		user.setPassword(scanner.nextLine());
				
		if(controller.loginUser(user)) {
			System.out.println(user.getName()+", You have Logged In Successfully..");
			System.out.println("Navigating to the Government Railway Crossing Application");
			
			// Navigate to Home
			home();
		}else {
			System.err.println("Something Went Wrong. Please Try Again");
		}
	}
	
	void home() {
		
		while(true) {
		
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Welcome to Government Railway Crossing Home");
			System.out.println("We have "+controller.getCrossingsCount()+" Crossings in the DataBase");
			System.out.println("1: List Railway Crossings");
			System.out.println("2: Search Railway Crossings");
			System.out.println("3: Add Railway Crossing");
			System.out.println("4: Delete Railway Crossing");
			System.out.println("5: Export Data");
			System.out.println("6: Import Data");
			System.out.println("7: Close Goverment Application");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
			int choice = scanner.nextInt();
			switch (choice) {
				
				case 1: 
					listCrossings();
					break;
				
				case 2:

					break;
					
				case 3:
					addCrossing();
					break;
					
				case 4:
					break;
					
				case 5:
					controller.exportData();
					break;
					
				case 6:
					controller.importData();
					break;
					
				case 7:
					System.out.println("Thank You for using Railway Crossing App");
					break;
			
				default:
					System.err.println("Invalid Choice");
			}
			
			if(choice == 7) {
				break;
			}
		}
	}
	
	void startGovernmentApp() {
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome Admin User");
		System.out.println("Proceed to Login");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		login();
			
	}

}
