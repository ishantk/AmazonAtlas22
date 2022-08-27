package com.amazon.atlas22.competitive;

public class AnotherBrickInTheWall {

	/*
	 	
	 	John & Jack construct wall of n bricks..
	 	
	 	Consider n is 9, i.e. John and Jack has to create a wall of 9 bricks..
	 	
	 			Brick Placed		Total Bricks
	 	John	1					1
	 	Jack	1*2 = 2				3
	 	John	2					5
	 	Jack	2*2 = 4				9
	 	
	 	Who placed the last brick => Jack
	 	How many bricks were placed in the last => 4
	 	
	 	---------------
	 	
	 	Consider n is 13, i.e. John and Jack has to create a wall of 13 bricks..
	
	 			Brick Placed		Total Bricks
	 	John	1					1
	 	Jack	1*2 = 2				3
	 	John	2					5
	 	Jack	2*2 = 4				9
	 	John	3					12
	 	Jack	3*2 = 6	| 1			13			
	 	
	 	Who placed the last brick => Jack
	 	How many bricks were placed in the last => 1
	 	
	 	
	 */
	
	static int[] placeBricks(int numOfBricks) {
		//		0th index:	John(1), Jack(2)
		//		1st index:	last bricks placed
		int[] result = {2, 1};
		
		int totalBricksPlaced = 0;
		
		for(int count=1; count<numOfBricks; count++) {
			
			totalBricksPlaced += count;		// Placed by John	
			System.out.println("John Placed Brick: "+count);
			System.out.println("Total Bricks after John Placed: "+totalBricksPlaced);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~");
			
			if(totalBricksPlaced > numOfBricks) {
				int lastBricks = (count*2 - (totalBricksPlaced - numOfBricks));
				result[0] = 1;
				result[1] = lastBricks;
				break;
			}
			
			totalBricksPlaced += count*2;	// Placed by Jack
			System.out.println("Jack Placed Brick: "+count*2);
			System.out.println("Total Bricks after Jack Placed: "+totalBricksPlaced);
			
			System.out.println();
			
			if(totalBricksPlaced > numOfBricks) {
				int lastBricks = (count*2 - (totalBricksPlaced - numOfBricks));
				result[0] = 2;
				result[1] = lastBricks;
				break;
			}
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] result = placeBricks(13);
		System.out.println("Last Brick Placed by: "+result[0]);
		System.out.println("Last Bricks Placed: "+result[1]);

	}

}
