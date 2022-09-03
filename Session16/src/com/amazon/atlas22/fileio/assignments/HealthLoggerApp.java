package com.amazon.atlas22.fileio.assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class HealthLoggerApp {
	
	void logVitals(Vitals vitals) {
		
		try {
			
			File file = new File("/Users/ishant/Downloads/helathlogs.csv");
			FileWriter writer = new FileWriter(file, true); // enable append mode
			System.out.println("Writing Health Data "+vitals);
			writer.write(vitals.toString());
			writer.close();
			System.out.println("Health Data Written..");
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
		
	}
	
	void logVitalsWithPrintWriter(Vitals vitals) {
		
		try {
			
			File file = new File("/Users/ishant/Downloads/helathlogs-1.csv");
			
			PrintWriter writer = new PrintWriter(file);
			writer.print(vitals.toString());
			writer.close();
			System.out.println("Health Data Written..");
			
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
		
	}
	
	void readVitals() {
		
		try {
			
			File file = new File("/Users/ishant/Downloads/helathlogs.csv");
			FileReader reader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line = "";
			
			while((line = bufferedReader.readLine()) != null) {
				
				String[] vitals = line.split(",");
				System.out.println(vitals[0]+"\t"+vitals[1]+"\t"+vitals[2]);
			}
			
		} catch (Exception e) {
			System.err.println("Something Went Wrong: "+e);
		}
		
	}

	public static void main(String[] args) {
		
		Vitals vitals = new Vitals();
		vitals.inputVitals();
		//System.out.println(vitals);
		
		HealthLoggerApp app = new HealthLoggerApp();
		//app.logVitals(vitals);
		//app.readVitals();
		
		app.logVitalsWithPrintWriter(vitals);
	}

}
