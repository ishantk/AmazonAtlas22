package com.amazon.atlas22.railwaycrossingapp.controller;

import com.amazon.atlas22.railwaycrossingapp.db.DB;
import com.amazon.atlas22.railwaycrossingapp.model.User;

public class UserController {
	
	private static UserController controller;
	
	private UserController() {

	}
	
	public static UserController getInstance() {
		if(controller == null) {
			controller = new UserController();
		}
		
		return controller;
	}

	DB db = DB.getInstance();
	
	public boolean registerUser(User user) {

		if(user.validate())
			return db.set(user);
		else
			System.err.println("Email and Password should be non empty");
		
		return false;
	}
	
	public boolean loginUser(User user) {
		
		if(user.validate()) {
			User retrievedUser = (User)db.retrieve(user.getEmail());
			if(retrievedUser!= null && retrievedUser.getUserType() == 1) {
				user.setName(retrievedUser.getName());
				return retrievedUser.getEmail().equalsIgnoreCase(user.getEmail()) && retrievedUser.getPassword().equals(user.getPassword());
			}
		}
			
		return false;
	}
	
	public int getUserCount() {
		return db.getUserCount();
	}
	
}
