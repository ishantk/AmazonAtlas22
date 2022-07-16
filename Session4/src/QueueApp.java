
public class QueueApp {

	public static void main(String[] args) {
		
		Queue queue = new Queue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		System.out.println("[QueueApp] [main] Head of Queue is: "+queue.front());
		System.out.println("[QueueApp] [main] Size of Queue is: "+queue.size);
		
		queue.dequeue();
		queue.dequeue();
		
		queue.iterate();
		

	}

}
