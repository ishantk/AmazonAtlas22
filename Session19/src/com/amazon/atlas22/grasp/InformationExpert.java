package com.amazon.atlas22.grasp;

import com.amazon.atlas22.grasp.model.Admin;
import com.amazon.atlas22.grasp.model.User;

public class InformationExpert {

	public static void main(String[] args) {

		// Admin adds the Crossings to the DataBase		
		Admin admin = new Admin();
		admin.createNewRailwayCrossing("Model Town Crossing", "Shastri Nagar");
		admin.createNewRailwayCrossing("Krishna Nagar Crossing", "Krishna Nagar");
		
		System.out.println();
		
		// User fetches and views the List of Crossings
		User user = new User();
		user.viewAllCrossings();

	}

}
