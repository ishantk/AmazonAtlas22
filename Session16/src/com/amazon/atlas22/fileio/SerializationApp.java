package com.amazon.atlas22.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationApp {

	void serialize(User user) {
		
		try {
			
			File file = new File("/Users/ishant/Downloads/"+user.name+".txt");
			FileOutputStream stream = new FileOutputStream(file);
			ObjectOutputStream objectStream = new ObjectOutputStream(stream);
			objectStream.writeObject(user);
			
			objectStream.close();
			stream.close();
			
			System.out.println("User Object with name "+user.name+" Saved...");
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	void deserialize(User user) {
		
		try {
			
			File file = new File("/Users/ishant/Downloads/"+user.name+".txt");
			FileInputStream stream = new FileInputStream(file);
			ObjectInputStream objectStream = new ObjectInputStream(stream);
			
			User userObject = (User)objectStream.readObject();
			System.out.println(userObject);
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
	}
	
	public static void main(String[] args) {
		
		User user = new User("Kim", "kim@example.com", 26, "Female", 4.5);
	
		SerializationApp app = new SerializationApp();
		app.serialize(user);
		app.deserialize(user);
	
	}

}
