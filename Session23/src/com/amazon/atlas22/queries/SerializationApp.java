package com.amazon.atlas22.queries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Learner implements Serializable{
	
	String name;
	String email;
	String subject;
	int age;
	
	public Learner() {
		// TODO Auto-generated constructor stub
	}

	public Learner(String name, String email, String subject, int age) {
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Learner [name=" + name + ", email=" + email + ", subject=" + subject + ", age=" + age + "]";
	}
	
}

class Firestore{
	
	File directory;
	
	public Firestore() {
		directory = new File("/Users/ishant/Downloads/", "Learners");
		if(!directory.exists()) {
			directory.mkdir();
			System.out.println("Directory Created: "+directory.getName());
		}else {
			System.out.println("Directory Already Created: "+directory.getName());
		}
	}
	
	public void insert(Object object) {
		try {
			
			Learner learner = (Learner) object;
			
			File file = new File("/Users/ishant/Downloads/Learners", learner.email+".txt");
			FileOutputStream stream = new FileOutputStream(file);
			ObjectOutputStream objectStream = new ObjectOutputStream(stream);
			objectStream.writeObject(learner);
			System.out.println("Serialization Done :)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Object fetch(String documentId) {
		
		Object object = null;
		
		try {
			File file = new File("/Users/ishant/Downloads/Learners", documentId);
			FileInputStream stream = new FileInputStream(file);
			ObjectInputStream objectStream = new ObjectInputStream(stream);
			object = objectStream.readObject();
			System.out.println("Serialization Done :)");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return object;
	}
}

public class SerializationApp {

	public static void main(String[] args) {
		
		Learner learner = new Learner("John", "john@example.com", "Java", 25);
		Firestore firestore = new Firestore();
		//firestore.insert(learner);
		Object object = firestore.fetch("john@example.com.txt");
		System.out.println(object);
		

	}

}
