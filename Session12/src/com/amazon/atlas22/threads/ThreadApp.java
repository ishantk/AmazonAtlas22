package com.amazon.atlas22.threads;

/*class PrinitngTask{
	
	public void printDocuments(String docName, int copies) {
		for(int i=1; i<=copies; i++) {
			System.out.println("[printDocuments] printing "+docName+" copy #"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class TicketTask{
	
	public void createTickets(String movieName, int number) {
		for(int i=1; i<=number; i++) {
			System.out.println("[createTickets] creating "+movieName+" ticket #"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}*/

class PrinitngTask extends Thread{ // IS-A Relation: PrinitngTask IS A Thread
	
	String docName;
	int copies;
	
	PrinitngTask(String docName, int copies){
		this.docName = docName;
		this.copies = copies;
	}
	
	// run is a method, which we need to override and write the tasks to be done by child thread inside this method
	public void run() {
		for(int i=1; i<=copies; i++) {
			System.out.println("[printDocuments] printing "+docName+" copy #"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Ticket{
	
	String movieName;
	int number;
	
}

//class TicketTask extends Ticket, Thread{ error: multiple inheritance not supported
class TicketTask extends Ticket implements Runnable{
	
	TicketTask(String movieName, int number){
		this.movieName = movieName;
		this.number = number;
	}
	
	// run is a method, which we need to override and write the tasks to be done by child thread inside this method
	public void run() {
		for(int i=1; i<=number; i++) {
			System.out.println("[createTickets] creating "+movieName+" ticket #"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadApp {

	// main thread, executes the instructions inside the main method in a sequence
	// i.e. main thread is executed automatically by JVM and child threads are suppose to be started from the main
	public static void main(String[] args) {
		
		System.out.println("[main] Welcome to App");
		
		PrinitngTask task = new PrinitngTask("LearningJava.pdf", 10);
		
		Runnable runnable =  new TicketTask("Rocketry", 15); // Write a Polymorphic Statement
		Thread ticketTask = new Thread(runnable);
		
		System.out.println("[main] PrinitngTask 1: State: "+task.getState());
		
		task.setName("PrinitngTaskThread");
		ticketTask.setName("TicketTaskThread");
		Thread.currentThread().setName("MyMain");
		
		// Thread Priority is a request to JVM
		// To execute the threads accordingly, in case JVM has low memory/time conditions
		task.setPriority(Thread.MIN_PRIORITY);					 	// 1
		ticketTask.setPriority(Thread.NORM_PRIORITY); 				// 5
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY); 	// 1
		
		// Can make any thread to be a daemon thread :)
		task.setDaemon(true);
		
		System.out.println("[main] PrinitngTask name is: "+task.getName()+" Priority: "+task.getPriority());
		System.out.println("[main] TicketTask name is: "+ticketTask.getName()+" Priority: "+ticketTask.getPriority());
		System.out.println("[main] MainThread name is: "+Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority());
		
		// start method is a built in method in Thread class, which internally executes the run method
		task.start();
		
		try {
			task.join(); // immediately after starting the PrinitngTask thread
						 // we executed the join method
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		ticketTask.start();
		
		System.out.println("[main] PrinitngTask 2: State: "+task.getState());
		
		//TicketTask ticketTask = new TicketTask("Rocketry", 15);
		//ticketTask.start();
		
		
		
		
		int[] array = {12000, 121311, 45423, 7612, 787487, 283645};
		int max = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		
		
		System.out.println("[main] Maximum in Array is: "+max);
		
		System.out.println("[main] App Finished");
		
		System.out.println("[main] PrinitngTask 3: State: "+task.getState());
		
		
	}

}
