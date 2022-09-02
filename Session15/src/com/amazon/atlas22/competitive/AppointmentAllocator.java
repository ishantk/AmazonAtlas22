package com.amazon.atlas22.competitive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;

public class AppointmentAllocator {
	
	ArrayList<Doctor> doctors;
	static int appointmentCount = 0;
	
	AppointmentAllocator(){
		
		Doctor doctor1 = new Doctor("John");
		Doctor doctor2 = new Doctor("Fionna");
		Doctor doctor3 = new Doctor("Sia");
		
		doctor1.generateSchedule(new String[] {"2-3", "4-5", "7-8"});
		doctor2.generateSchedule(new String[] {"11-12", "4-5", "6-7"});
		doctor3.generateSchedule(new String[] {"9-10", "10-11", "4-5"});
		
		doctors = new ArrayList<Doctor>();
		doctors.add(doctor1);
		doctors.add(doctor2);
		doctors.add(doctor3);
	}
	
	void printAppointments() {
		for(Doctor doctor : doctors) {
			doctor.printSchedule();
		}
	}

	// Think of some great way to book an appointment
	// Rules:
	// If a doctor has been given a patient, the next patient should be scheduled with next available doctor
	public void bookAppointment(Patient patient) {
		
		Doctor doctor = doctors.get(appointmentCount % doctors.size());
		appointmentCount++;
		
		Iterator<Entry<String, Patient>> itr = doctor.schedule.entrySet().iterator();
		System.out.println("Schedule Appointment with Dr "+doctor.name);

		if(!doctor.schedule.containsValue(null)) {
			System.out.println("No Appointment Available with Dr "+doctor.name);
			return;
		}
		
		while(itr.hasNext()) {
			Entry<String, Patient> entry = itr.next();
			if(entry.getValue() == null) {
				doctor.schedule.put(entry.getKey(), patient);
				break;
			}
			
		}
		
	}
	
}
