package com.amazon.atlas22.casestudy;

class BookTicketTask extends Thread{
	
	MovieTicket ticketToBook;
	User userToBook;
	
	
	BookTicketTask(MovieTicket ticket, User user){
		ticketToBook = ticket;
		userToBook = user;
	}
	
	public void run() {
		
		synchronized (ticketToBook) {
			ticketToBook.payForTicket(ticketToBook.price, userToBook);
		}
		
	}

}

public class BookMeTicketApp {

	public static void main(String[] args) {
		
		MovieTicket ticket1 = new MovieTicket("Rocketry", "12:00", 300, 1, 'A');
		MovieTicket ticket2 = new MovieTicket("Rocketry", "12:00", 300, 2, 'A');
		MovieTicket ticket3 = new MovieTicket("Rocketry", "12:00", 300, 3, 'A');
		MovieTicket ticket4 = new MovieTicket("Rocketry", "12:00", 300, 4, 'A');
		MovieTicket ticket5 = new MovieTicket("Rocketry", "12:00", 300, 5, 'A');
		
		User user1 = new User("John", "+91 99999 11111", "john@example.com");
		User user2 = new User("Dave", "+91 99999 22222", "dave@example.com");
		User user3 = new User("Fionna", "+91 99999 33333", "fonna@example.com");
		
		// Select Seat Option...
		BookTicketTask task1 = new BookTicketTask(ticket1, user2);
		
		// user1 and user3 wish to book the same movie ticket
		BookTicketTask task2 = new BookTicketTask(ticket3, user1);
		BookTicketTask task3 = new BookTicketTask(ticket3, user3);
		
		task1.start();
		task2.start();
		task3.start();
	}

}
