package com.amazon.atlas22.grasp;

import com.amazon.atlas22.grasp.model.User;

public class LoginHandler {

	public void loginUser(User user) {
		System.out.println("Logging In User "+user.getEmail());
		System.out.println("User Login Successful");
	}
	
}
