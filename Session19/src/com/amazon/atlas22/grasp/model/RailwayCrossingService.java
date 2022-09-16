package com.amazon.atlas22.grasp.model;

import java.util.ArrayList;
import java.util.List;

// Responsibility to manage RailwayCrossing or to interact with DB :)
public class RailwayCrossingService {
	
	static RailwayCrossingService service = new RailwayCrossingService();
	
	static RailwayCrossingService getInstance() {
		return service;
	}
	
	// RailwayCrossingService HAS-Many RailwayCrossing
	
	// Temporary Data Structure
	// In real world Service is the One, which will interact with DataBase
	List<RailwayCrossing> crossings;
	
	private RailwayCrossingService(){
		crossings = new ArrayList<RailwayCrossing>();	
	}
	
	// addRailwayCrossing method adds the RailwayCrossing to the ArrayList :)
	// LOW COUPLING :)
	public String addRailwayCrossing(RailwayCrossing crossing) {
		crossings.add(crossing);
		return "Crossing "+crossing.name+" Added :)";
	}
	
	// Being an Information Expert :)
	public List<RailwayCrossing> getAllCrossings(){
		return crossings;
	}
}
