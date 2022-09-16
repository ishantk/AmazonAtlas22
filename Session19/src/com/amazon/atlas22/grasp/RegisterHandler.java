package com.amazon.atlas22.grasp;

import com.amazon.atlas22.grasp.model.User;

public class RegisterHandler {

	public void registerUser(User user) {
		
		DB db = DBService.getDB();
		
		System.out.println("Registering User "+user.getName());
		
		db.insert(user);
		
		System.out.println("User Registration Successful");
	}
	
}
