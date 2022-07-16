
public class StackApp {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("[StackApp] [main] Data on TOP is: "+stack.top());
		stack.push(40);
		stack.push(50);
		
		stack.iterate();
		
		System.out.println("[StackApp] [main] Data on TOP is: "+stack.top());
		
		stack.pop();
		stack.pop();
		
		System.out.println("[StackApp] [main] Data on TOP is: "+stack.top());
		stack.iterate();

	}

}
