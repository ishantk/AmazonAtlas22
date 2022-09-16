package com.amazon.atlas22.grasp;

import com.amazon.atlas22.grasp.model.Admin;

/*
 	Problem Statement:
 	Railway Crossing can be found in a city where people will wait in case crossing is blocked.
 	As train has to pass by.
 	We need to design a solution so that  a Person passing by the crossing can get to know about the status in some application
 	
 	Identify Objects
 	1. User
 	2. Admin
 	3. RailwayCrossing
 	4. TimeTable of Railway Crossing
 	
 	Identify Relationships
 	Admin Creates RailwayCrossing
 	Admin updates the status of RailwayCrossing
 	User can fetch list of RailwayCrossing
 	User can view the TimeTable of RailwayCrossing and also the status of Railway Crossing :)
 	
 */

public class Creator { // RailwayCrossingApp :)

	public static void main(String[] args) {
		
		Admin admin = new Admin();
		admin.createNewRailwayCrossing("Model Town Crossing", "Shastri Nagar");
		admin.createNewRailwayCrossing("Krishna Nagar Crossing", "Krishna Nagar");
		
	}

}
