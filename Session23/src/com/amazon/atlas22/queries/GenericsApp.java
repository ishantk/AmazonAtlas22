package com.amazon.atlas22.queries;

class Appointment<T>{
	
	
	Doctor doctor;
	T person;
	
	String date;
	String time;
	
	
	public Appointment() {
	
	}


	public Appointment(Doctor doctor, T person, String date, String time) {
		this.doctor = doctor;
		this.person = person;
		this.date = date;
		this.time = time;
	}


	@Override
	public String toString() {
		return "Appointment Booked. "
				+"\nDoctor=" + doctor + "\nPerson=" + person + "\nDate=" + date + ", Time=" + time;
	}
	
}

class Doctor{
	
	String name;
	String qualification;
	int experience;
	
	public Doctor() {
	
	}

	public Doctor(String name, String qualification, int experience) {
		this.name = name;
		this.qualification = qualification;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", qualification=" + qualification + ", experience=" + experience + "]";
	}
}

class MedicalRepresentative{
	
	String name;
	String company;
	
	public MedicalRepresentative() {
	
	}

	public MedicalRepresentative(String name, String company) {
		this.name = name;
		this.company = company;
	}

	@Override
	public String toString() {
		return "MedicalRepresentative [name=" + name + ", company=" + company + "]";
	}

}

class Patient{
	
	String name;
	String email;
	int age;
	
	public Patient() {
	
	}

	public Patient(String name, String email, int age) {
		this.name = name;
		this.email = email;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", email=" + email + ", age=" + age + "]";
	}
}

public class GenericsApp {

	public static void main(String[] args) {
		
		Doctor doctor = new Doctor("Dr. James", "MBBS", 15);
		Patient patient1 = new Patient("Dave", "dave@example.com", 21);
		Patient patient2 = new Patient("George", "geirge@example.com", 32);
		
		MedicalRepresentative representative1 = new MedicalRepresentative("Harry", "Ranbaxy");
		
		Appointment<Patient> appointment1 = new Appointment<Patient>(doctor, patient1, "1st October, 2022", "10:00 AM");
		Appointment<Patient> appointment2 = new Appointment<Patient>(doctor, patient2, "1st October, 2022", "11:00 AM");
		Appointment<MedicalRepresentative> appointment3 = new Appointment<MedicalRepresentative>(doctor, representative1, "1st October, 2022", "4:30 PM");
		
		System.out.println(appointment1);
		System.out.println();
		
		System.out.println(appointment2);
		System.out.println();
		
		System.out.println(appointment3);
		

	}

}
