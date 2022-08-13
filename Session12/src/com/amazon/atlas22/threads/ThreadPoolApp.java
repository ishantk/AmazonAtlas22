package com.amazon.atlas22.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FlightTicket{
	
	static int seatCounter = 0;
	
	String pnr;
	String fname;
	String lname;
	int seatNumber;
	boolean checkedIn;
	
	public FlightTicket() {
		
	}
	
	public FlightTicket(String pnr, String fname, String lname) {
		this.pnr = pnr;
		this.fname = fname;
		this.lname = lname;
		seatNumber = 0;
		checkedIn = false;;
	}

	@Override
	public String toString() {
		return "FlightTicket [pnr=" + pnr + ", fname=" + fname + ", lname=" + lname + ", seatNumber=" + seatNumber
				+ ", checkedIn=" + checkedIn + "]";
	}
	
}

/*class CheckInTask implements Runnable{
	
	FlightTicket ticketToCheckIn;
	
	CheckInTask(FlightTicket ticket){
		ticketToCheckIn = ticket;	
	}
	
	
	public void run() {
		ticketToCheckIn.checkedIn = true;
		ticketToCheckIn.seatNumber = ++FlightTicket.seatCounter;
		System.out.println("[CheckInTask] ticket checked in for "+ticketToCheckIn.fname);
		System.out.println("[CheckInTask] seat allocated for "+ticketToCheckIn.fname+" is Seat#"+ticketToCheckIn.seatNumber);
	}
	
}*/

class CheckInTask implements Callable<String>{
	
	FlightTicket ticketToCheckIn;
	
	CheckInTask(FlightTicket ticket){
		ticketToCheckIn = ticket;	
	}
		
	public String call() throws Exception {
	
		ticketToCheckIn.checkedIn = true;
		ticketToCheckIn.seatNumber = ++FlightTicket.seatCounter;
		
		// Result to get in Future :)
		return "ticket checked in for "+ticketToCheckIn.fname+" and seat allocated is Seat#"+ticketToCheckIn.seatNumber;
	}
	
}

public class ThreadPoolApp {

	public static void main(String[] args) {
		
		FlightTicket ticket1 = new FlightTicket("ABCQ1", "Harry", "Watson");
		FlightTicket ticket2 = new FlightTicket("Q1BCA", "Kim", "Joe");
		FlightTicket ticket3 = new FlightTicket("RRBCQ", "Sia", "Shawn");
		FlightTicket ticket4 = new FlightTicket("9ACTV", "Fionna", "Flynn");
		FlightTicket ticket5 = new FlightTicket("YYAZX", "Sam", "Bora");
		
		
		// Thread Pool in Java
		/*ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(new CheckInTask(ticket1));
		service.execute(new CheckInTask(ticket2));
		service.execute(new CheckInTask(ticket3));
		service.execute(new CheckInTask(ticket4));
		service.execute(new CheckInTask(ticket5));
		
		service.shutdown();*/
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		Future<String> future1 = service.submit(new CheckInTask(ticket1)); // Now, submit method takes Callable as input
		Future<String> future2 = service.submit(new CheckInTask(ticket2)); 
		Future<String> future3 = service.submit(new CheckInTask(ticket3)); 
		Future<String> future4 = service.submit(new CheckInTask(ticket4)); 
		Future<String> future5 = service.submit(new CheckInTask(ticket5)); 
		
		try {
			
			System.out.println(future1.get());
			System.out.println(future2.get());
			System.out.println(future3.get());
			System.out.println(future4.get());
			System.out.println(future5.get());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		service.shutdown();
	}

}
