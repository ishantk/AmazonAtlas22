package com.amazon.atlas22.casestudy;

public class MovieTicket {
	
	String name;
	String time;
	int price;
	int seatNumber;
	char rowNumber;
	String userEmail;
	
	public MovieTicket() {
		
	}
	
	public MovieTicket(String name, String time, int price, int seatNumber, char rowNumber) {
		this.name = name;
		this.time = time;
		this.price = price;
		this.seatNumber = seatNumber;
		this.rowNumber = rowNumber;
		userEmail = "";
	}
	
	public void payForTicket(int amount, User user) {
		
		if(userEmail.isEmpty()) {
			System.out.println("Paying for Movie: "+name);
			System.out.println("Thank you "+user.name+" to make a payment..");
			userEmail = user.email;
			System.out.println("Ticket with seat number #"+seatNumber+" Booked for "+user.email+" and Email Sent....");
			System.out.println();
		}else {
			System.out.println(user.name+" Sorry !! The ticket with seat# "+seatNumber+" is sold...");
		}
	}

	@Override
	public String toString() {
		return "MovieTicket [name=" + name + ", time=" + time + ", price=" + price + ", seatNumber=" + seatNumber
				+ ", rowNumber=" + rowNumber + ", userEmail=" + userEmail + "]";
	}

}
