package com.amazon.atlas22.collections;

import java.util.Date;

public class ParkingTicket {

	String vehcileNumber;
	Date parkedTimeStamp;
	Date unParkTimeStamp;
	String nameOfVehicleOwner;
	
	public ParkingTicket() {
		
	}
	
	public ParkingTicket(String vehcileNumber, Date parkedTimeStamp, Date unParkTimeStamp, String nameOfVehicleOwner) {
		this.vehcileNumber = vehcileNumber;
		this.parkedTimeStamp = parkedTimeStamp;
		this.unParkTimeStamp = unParkTimeStamp;
		this.nameOfVehicleOwner = nameOfVehicleOwner;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		ParkingTicket ticket = (ParkingTicket)obj;
		
		boolean result1 = vehcileNumber.equals(ticket.vehcileNumber);
		boolean result2 = parkedTimeStamp.toString().equals(ticket.parkedTimeStamp.toString());
		boolean result3 = unParkTimeStamp.toString().equals(ticket.unParkTimeStamp.toString());
		boolean result4 = nameOfVehicleOwner.equals(ticket.nameOfVehicleOwner);
		
		return result1 && result2 && result3 && result4;
	}

	@Override
	public int hashCode() {
		return vehcileNumber.hashCode();
	}
	
	@Override
	public String toString() {
		return "ParkingTicket [vehcileNumber=" + vehcileNumber + ", parkedTimeStamp=" + parkedTimeStamp
				+ ", unParkTimeStamp=" + unParkTimeStamp + ", nameOfVehicleOwner=" + nameOfVehicleOwner + "]";
	}
	
}
