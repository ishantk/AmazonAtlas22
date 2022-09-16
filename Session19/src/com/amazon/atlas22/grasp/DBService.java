package com.amazon.atlas22.grasp;

public class DBService {

	private static DB db = new DB();
	
	private DBService() {
	
	}
	
	public static DB getDB() {
		return db;
	}
}
