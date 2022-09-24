package com.amazon.atlas22.railwaycrossingapp.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

import com.amazon.atlas22.railwaycrossingapp.model.RailwayCrossing;
import com.amazon.atlas22.railwaycrossingapp.model.User;

public class DB implements DAO{

	// users is a collection which will hold User Objects, BUT Temporarily i.e. till the application is running
	private LinkedHashMap<String, User> users = new LinkedHashMap<String, User>();

	// crossings is a collection which will hold Railway Crossing Objects, BUT Temporarily i.e. till the application is running
	private LinkedHashMap<String, RailwayCrossing> crossings = new LinkedHashMap<String, RailwayCrossing>();
	
	private static DB db;
	
	private DB(){
		populateAdminUsers();
	}
	
	// Singleton Design Pattern
	public static DB getInstance() {
		if(db == null) {
			db = new DB();
		}
		
		return db;
	}
	
	void populateAdminUsers() {
		User user1 = new User("George", "george@example.com", "george123", 2);
		User user2 = new User("Harry", "harry@example.com", "harry123", 2);
		set(user1);
		set(user2);
	}
	
	// Performs both insert and update
	public boolean set(Object object) {
		if(object instanceof User) {
			User user = (User)object;
			users.put(user.getEmail(), user);
			return true;
		}else {
			RailwayCrossing crossing = (RailwayCrossing)object;
			crossings.put(crossing.getPersonInCharge().getEmail(), crossing);
			return true;
		}
	}
	
	public boolean delete(Object object) {
		if(object instanceof User) {
			User user = (User)object;
			users.remove(user.getEmail());
			return true;
		}else {
			RailwayCrossing crossing = (RailwayCrossing)object;
			crossings.remove(crossing.getPersonInCharge().getEmail());
			return true;
		}
	}
	
	public Map<String, ?> retrieve(Object object) {
		if(object instanceof User) {
			return users;
		}else {
			return crossings;
		}
	}
	
	@Override
	public Object retrieve(String key) {
		
		if(users.containsKey(key)) {
			return users.get(key);
		}else if (crossings.containsKey(key)){
			return crossings.get(key);
		}else {
			return null;
		}
	}
	
	public int getUserCount() {
		return users.size();
	}
	
	public int getCrossingsCount() {
		return crossings.size();
	}
	
	public void exportData() {
		
		try {
			
			File file = new File("/Users/ishant/Downloads/users-data");
			if(!file.exists()) {
				file.mkdir();
				System.out.println("Directory Created by the name of "+file.getName());
			}
			
			for(String key : users.keySet()) {
				File userFile = new File("/Users/ishant/Downloads/users-data/", key+".txt");
				FileOutputStream stream = new FileOutputStream(userFile);
				ObjectOutputStream objectStream = new ObjectOutputStream(stream);
				objectStream.writeObject(users.get(key));
				System.out.println("User: "+key+" Exported...");
			}
			
			System.out.println("EXPORT FINISHED :)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void importData() {
		
		try {
			
			File file = new File("/Users/ishant/Downloads/users-data");
			String[] files = file.list(); // Get Name of all the files in the users-data directory :) 
			
			for(String fileName : files) {
				File userFile = new File("/Users/ishant/Downloads/users-data/", fileName);
				FileInputStream stream = new FileInputStream(userFile);
				ObjectInputStream objectStream = new ObjectInputStream(stream);
				User user = (User) objectStream.readObject();
				
				users.put(user.getEmail(), user);
			}
			
			System.out.println("IMPORT FINISHED :)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
