package com.amazon.atlas22.collections;

import java.util.Date;
import java.util.LinkedHashSet;

public class ParkingTicketSetApp {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		ParkingTicket ticket1 = new ParkingTicket("KA10AB1234", date, date, "John");
		ParkingTicket ticket2 = new ParkingTicket("KA10AB1234", date, date, "John");
		
		LinkedHashSet<ParkingTicket> parkingSite = new LinkedHashSet<ParkingTicket>();
		parkingSite.add(ticket1);
		parkingSite.add(ticket2);
		
		System.out.println(ticket1.hashCode());
		System.out.println(ticket2.hashCode());
		
		System.out.println("parkingSite has "+parkingSite.size()+" tickets");
		
		for(ParkingTicket ticket : parkingSite) {
			System.out.println(ticket);
		}
		
		if(ticket1.equals(ticket2)){
			System.out.println("ticket1 is equal to ticket2");
		}else {
			System.out.println("ticket1 is not equal to ticket2");
		}

	}

}
