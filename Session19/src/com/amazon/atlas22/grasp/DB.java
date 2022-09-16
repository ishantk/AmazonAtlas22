package com.amazon.atlas22.grasp;

import java.util.LinkedHashMap;

import com.amazon.atlas22.grasp.model.User;

public class DB {

	LinkedHashMap<String, User> users;
	
	public DB(){
		users = new LinkedHashMap<String, User>();
	}
	
	public void insert(User user) {
		users.put(user.getEmail(), user);
	}
	
}
