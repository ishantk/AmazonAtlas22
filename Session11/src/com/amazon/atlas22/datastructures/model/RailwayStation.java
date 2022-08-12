package com.amazon.atlas22.datastructures.model;

public class RailwayStation implements Comparable<RailwayStation>{

	// Attributes
	String name;
	String city;
	double latitude;
	double longitude;
	int averageFootFall;
	
	public RailwayStation() {
		// TODO Auto-generated constructor stub
	}

	public RailwayStation(String name, String city, double latitude, double longitude, int averageFootFall) {
		this.name = name;
		this.city = city;
		this.latitude = latitude;
		this.longitude = longitude;
		this.averageFootFall = averageFootFall;
	}

	@Override
	public String toString() {
		return "RailwayStation [name=" + name + ", city=" + city + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", averageFootFall=" + averageFootFall + "]";
	}

	@Override
	public int compareTo(RailwayStation o) {
		return name.compareTo(o.name);
	}
	
	
}
