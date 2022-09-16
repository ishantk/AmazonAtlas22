package com.amazon.atlas22.grasp;

import java.util.Scanner;

import com.amazon.atlas22.grasp.model.User;

public class Controller {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Railway Crossings Application");
		System.out.println("1. New User, Register Here");
		System.out.println("2. Existing User, Login Here");
		System.out.println("Enter Your Choice (1 or 2): ");
		int choice = scanner.nextInt();

		User user = new User();
		
		if(choice == 1) {
			
			user.setName("John");
			user.setEmail("john@example.com");
			user.setPassword("john@123");
			
			RegisterHandler registerHandler = new RegisterHandler();
			registerHandler.registerUser(user);
			
		}else if(choice == 2) {
			
			user.setEmail("fionna@example.com");
			user.setPassword("fionna@123");
			
			LoginHandler loginHandler = new LoginHandler();
			loginHandler.loginUser(user);
			
		}else {
			System.out.println("Invalid Choice :(");
		}
		
	}

}
