package com.amazon.atlas22.competitive;

/*
 	
 	Work with OOPS
 	
	 	Doctor1	
	 		2-3
	 		4-5
	 		7-8
	
	 	Doctor2	
	 		11-12
	 		4-5
	 		6-7
	 		
	 	Doctor3	
	 		9-10
	 		10-11
	 		4-5
	 		
	 	Patient
	 		We have 3 Patients
	 		P1
	 		P2
	 		P3
	 		
	 	Tasks:
	 	``````
	 	Task1:
	 		Create Appropriate Classes using OOPS i.e. Doctor and Patient
	 	
	 	Task2:
	 		Create Data Structure which stores the Doctor Schedules
	 	
	 	Task3:
	 		When Patient wish to take a consultation give an automatic assignment to the Doctors immediate available slot
	 		BUT, if the slot is filled up we need to certainly manage those edge cases.
 	
 	
 */

public class DoctorAppointmentApp {

	public static void main(String[] args) {
		
		Patient patient1 = new Patient("George", 22, "Male");
		Patient patient2 = new Patient("Kia", 24, "Female");
		Patient patient3 = new Patient("Harry", 28, "Male");
		Patient patient4 = new Patient("Jen", 31, "Female");
		
		AppointmentAllocator allocator = new AppointmentAllocator();
		
		allocator.printAppointments();
		
		allocator.bookAppointment(patient1);	// 2-3 with doctor1
		allocator.bookAppointment(patient2);	// 11-12 with doctor2
		allocator.bookAppointment(patient3); 	// 9-10 with doctor3
		allocator.bookAppointment(patient4); 	// 4-5 with doctor1
		
		allocator.printAppointments();

	}

}
