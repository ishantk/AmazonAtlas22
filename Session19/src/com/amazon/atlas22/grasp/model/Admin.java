package com.amazon.atlas22.grasp.model;

import java.util.LinkedHashMap;

public class Admin {

	public void createNewRailwayCrossing(String name, String address) {
		
		LinkedHashMap<String, String> timeTable = new LinkedHashMap<String, String>();
		timeTable.put("Shatabdi", "12:00");
		timeTable.put("Passeneger", "13:00");
		timeTable.put("Vande Bharat", "19:00");
		
		RailwayCrossing crossing = new RailwayCrossing(name, address, timeTable);
		
		// error :)
		//RailwayCrossingService service = new RailwayCrossingService();
		
		RailwayCrossingService service = RailwayCrossingService.getInstance();
		String response = service.addRailwayCrossing(crossing);
		System.out.println(response);
		
	}
	
}
