package com.amazon.atlas22.fileio.assignments;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Vitals {

	private Date dateTimeStamp;
	private int bpHigh;
	private int bpLow;
	private int pulse;
	private int spo2;
	
	public Vitals() {
		
	}
	
	public Vitals(int bpHigh, int bpLow, int pulse, int spo2) {
		dateTimeStamp = new Date();
		this.bpHigh = bpHigh;
		this.bpLow = bpLow;
		this.pulse = pulse;
		this.spo2 = spo2;
	}
	
	public void inputVitals() {
		
		dateTimeStamp = new Date();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter BP High: ");
		bpHigh = scanner.nextInt();
		System.out.println("Enter BP Low: ");
		bpLow = scanner.nextInt();
		System.out.println("Enter Pulse: ");
		pulse = scanner.nextInt();
		System.out.println("Enter SPO2: ");
		spo2 = scanner.nextInt();
		
		scanner.close();
	}

	@Override
	public String toString() {
		
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatter2 = new SimpleDateFormat("hh:mm:ss");
		
		String date = formatter1.format(dateTimeStamp);
		String time = formatter2.format(dateTimeStamp);
		
		return date+","+time+","+bpHigh+"/"+bpLow+","+pulse+","+spo2+"\n";
	}
	
	
}
