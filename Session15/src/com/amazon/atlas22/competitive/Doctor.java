package com.amazon.atlas22.competitive;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Doctor {
	
	String name;
	
	// Key is Time Slot and Value is a Patient
	LinkedHashMap<String, Patient> schedule;
	
	public Doctor() {
		
	}
	
	public Doctor(String name) {
		this.name = name;
		this.schedule = new LinkedHashMap<String, Patient>();
	}
	
	void generateSchedule(String[] slots) {
		for(String slot : slots) {
			schedule.put(slot, null);
		}
	}
	
	void printSchedule() {
		
		Iterator<Entry<String, Patient>> itr = schedule.entrySet().iterator();
		System.out.println("Schedule for Dr "+name);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		while(itr.hasNext()) {
			Entry<String, Patient> entry = itr.next();
			System.out.println("SLOT: "+entry.getKey());
			System.out.println("PATIENT: "+entry.getValue());
			System.out.println("````````````````````````");
		}
		System.out.println();
	}
	
}
