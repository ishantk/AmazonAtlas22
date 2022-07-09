
public class BreakContinueLabels {

	public static void main(String[] args) {
		
		int myFloor = 5;
		
		for(int floor=1; floor<=10; floor++) {
			System.out.println("Elevator is at floor#"+floor);
			
			if(floor == myFloor) {
				System.out.println("My Floor Arrived :)");
				break;
			}
			
		}
		
		System.out.println();
		
		for(int roll=1; roll<=20; roll++) {
			
			if(roll <= 13) {
				continue; // skipping the statements in the loop and taking the loop into next iteration
			}
			
			System.out.println("Lets start interview for roll#"+roll);
			System.out.println("Thank you for your time roll#"+roll+" We will update you shortly");
			System.out.println();
		}

		
		outer:
		for(int i=1;i<=5;i++) {
			
			System.out.println("For i: "+i);
			
			inner:
			for(int j=1;j<=3;j++) {
				System.out.print(j+" ");
				
				if(j == 3) {
					break outer;
				}
			}
			
			System.out.println();
		}
	}

}







