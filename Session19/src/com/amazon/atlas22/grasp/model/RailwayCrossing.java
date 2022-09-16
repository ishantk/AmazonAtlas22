package com.amazon.atlas22.grasp.model;

import java.util.LinkedHashMap;

public class RailwayCrossing {

	String name;
	String address;
	LinkedHashMap<String, String> timeTable;
	
	public RailwayCrossing() {
		// TODO Auto-generated constructor stub
	}

	public RailwayCrossing(String name, String address, LinkedHashMap<String, String> timeTable) {
		this.name = name;
		this.address = address;
		this.timeTable = timeTable;
	}

	@Override
	public String toString() {
		return "RailwayCrossing [name=" + name + ", address=" + address + ", timeTable=" + timeTable + "]";
	}
	
}
