package com.amazon.atlas22.java8features;

class PrinterThread implements Runnable{
	
	@Override
	public void run() {
		
		for(int idx=1;idx<=10;idx++) {
			System.out.println("Printing Page#"+idx);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class LambdaThreadsApp {

	public static void main(String[] args) {
		
		/*Runnable r = new PrinterThread();
		Thread th = new Thread(r);
		th.start();*/
		
		//new Thread(new PrinterThread()).start();
		
		
		/*Runnable runnable = ()->{
			for(int idx=1;idx<=10;idx++) {
				System.out.println("Printing Page#"+idx);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		new Thread(runnable).start();*/
		
		new Thread(
				()->{
					for(int idx=1;idx<=10;idx++) {
						System.out.println("Printing Page#"+idx);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}	
		).start();
		
	}

}
