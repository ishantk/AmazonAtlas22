
public class MethodsInMemoryAgain {

	static int increment(int num) {
		
		System.out.println("[increment] started");
		System.out.println("[increment] num before is: "+num);
		num += 15;
		System.out.println("[increment] num after is: "+num);
		System.out.println("[increment] finished");
		
		return num;
		
	}
	
	static void square(int num) {
		System.out.println("[square] started");
		System.out.println("[square] num before is: "+num); // 10
		
		num = MethodsInMemoryAgain.increment(num);
		
		num = num*num; // 25 * 25 -> 625
		System.out.println("[square] num after is: "+num); // 625
		System.out.println("[square] finished");
	}
	
	public static void main(String[] args) {
	
		System.out.println("[main] started");
		
		int x = 10;
		
		MethodsInMemoryAgain.square(x);
		
		System.out.println("[main] x is: "+x);
		
		
		System.out.println("[main] finished");
		
	}

}
