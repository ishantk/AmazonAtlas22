package com.amazon.atlas22.threads;

class Printer{
	
	String name;
	
	Printer(){
		name = "EPSON T20";
		System.out.println("[Printer] Object Created..");
	}
	
	//public synchronized void print(String docName, int copies) {
	public void print(String docName, int copies) {
		for(int i=1; i<=copies; i++) {
			
			System.out.println("[Printer] printing "+docName+" copy #"+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	void testPage() {
		System.out.println("[Printer] printing TestPage");
	}
	
	
	// Several More Methods...
}

class Desktop extends Thread{
	
	Printer printer;
	
	void attachPrinter(Printer p) {
		printer = p;
		System.out.println("[Desktop] Printer "+printer.name+" attached...");
	}
	
	public void run() {
		
		synchronized (printer) {
			
			try {
				printer.wait(); // wait on printer object and release the lock...
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			printer.testPage();
			System.out.println();
			printer.print(" #LearningJava.pdf# ", 7);
			System.out.println("~~~~~~~~~~~~~~~~~~");
		}
		
	}
	
}

class Laptop extends Thread{
	
	Printer printer;
	
	void attachPrinter(Printer printer) {
		this.printer = printer;
		System.out.println("[Laptop] Printer "+printer.name+" attached...");
	}
	
	public void run() {
		synchronized (printer) {
			printer.print(" *PythonicPython.pdf* ", 12);
			printer.notify(); // Notify the Thread waiting on printer object :)

			//printer.notifyAll();
		}
	}
}

public class SyncApp {

	public static void main(String[] args) {
		
		System.out.println("[main] SyncApp Started..");
		
		// Only 1 Printer Object in Memory
		Printer printer = new Printer();
		
		System.out.println("[main] Creating Desktop and Laptop..");
		Desktop desktop = new Desktop();
		Laptop laptop = new Laptop();
		
		System.out.println("[main] Attaching Printer to Desktop and Laptop..");
		// Desktop and Laptop has the Same Printer Object Reference
		desktop.attachPrinter(printer);
		laptop.attachPrinter(printer);
		
		desktop.start();
		laptop.start();
		
		
		System.out.println("[main] SyncApp Finished..");
	}

}
