
public class NestedLoops {

	// Whenever we run the program JVM executes the code written inside the main
	public static void main(String[] args) {
		// whatever we write in main, will be executed in a sequence
		
		char whiteSquare = '\u25A0';
		char blackSquare = '\u25A1';
		char queen = '\u2656';
		
		
		/*
		 	
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		 	
		 */
		
		/*for(int i=0; i<8; i++) { // for idx value 0-7 for loop will run 8 times :)
			
			for(int j=0;j<8;j++) { // for j value, 0-7 for loop internally will run 8 times
				if(i%2==0) {
					System.out.print((j+1)%2+" ");
				}else {
					System.out.print(j%2+" ");
				}
			}
			
			System.out.println();
		}*/
		
		for(int i=0; i<8; i++) { // for idx value 0-7 for loop will run 8 times :)
			
			for(int j=0;j<8;j++) { // for j value, 0-7 for loop internally will run 8 times
				if(i%2==0) {
					//char square = (j+1)%2 == 0 ? blackSquare : whiteSquare;
					char square = (j+1)%2 == 0 ? blackSquare : queen;
					System.out.print(square+" ");
				}else {
					char square = j%2 == 0 ? blackSquare : whiteSquare;
					System.out.print(square+" ");
				}
			}
			
			System.out.println();
		}

	}

}

/*
 	Use Scanner and ask as input form the User
 	Where to place the Queen | Row and column will be entered by user | Lets say user entered 1, 1, place queen on 1, 1
 	Further user can place 2 queens on the chess board anywhere
 	But a condition, queens cannot be placed in the same row or same column or in the same diagonal
*/
