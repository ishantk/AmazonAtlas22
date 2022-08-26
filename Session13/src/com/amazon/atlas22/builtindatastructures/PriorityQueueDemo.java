package com.amazon.atlas22.builtindatastructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		//Queue<Integer> queue = new PriorityQueue<Integer>();
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		// We are adding data in the Queue as: 10 9 8 7 6 5 4 3 2 1
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		
		// Align the Queue based on Order i.e. (head) 1 2 3 4 5 6 7 8 9 10 (tail)
		
		/*System.out.println("Size of Queue is: "+queue.size());
		System.out.println("Queue is: ");
		System.out.println(queue);
		
		int head = queue.peek(); // Fetch the Head of Queue
		System.out.println("Head of Queue is: "+head+" and size is: "+queue.size());
		
		queue.poll();		 // Remove the Head of Queue
		head = queue.peek(); // Fetch the Head of Queue
		System.out.println("Head of Queue now is: "+head+" and size is: "+queue.size());
		 */
		
		for(int i=0;i<queue.size();i++) {
			System.out.println(queue.peek()); // peek gives head of queue
			
			queue.poll(); // removes head of queue -> it decreases the value of size by 1 :)
		}
		
		
	}

}
