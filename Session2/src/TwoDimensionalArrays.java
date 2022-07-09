
public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
		/*
		// 1 D Arrays
		int[] ani = {40, 1, 10055, 5, 129};
		int[] ap = {1816, 156 , 2307116, 191, 14731};
		int[] chd = {375,7 ,92759, 70, 1165};
		*/
		// 2 D Array
		// Array of 1D Arrays
		//int[][] indiaCovidCases = new int[][]{
		int[][] indiaCovidCases = {
				{40, 1, 10055, 5},						// 0
				{1816, 156 , 2307116},					// 1
				{375,7 ,92759, 70, 1165},				// 2
				{375,7 ,92759, 70, 1165, 34, 55, 77}	// 3
		};
		
		
		/*System.out.println("ani is: "+ani+" and length is: "+ani.length);
		System.out.println("ap is: "+ap+" and length is: "+ap.length);
		System.out.println("chd is: "+chd+" and length is: "+chd.length);
		*/
		
		System.out.println("indiaCovidCases is: "+indiaCovidCases+" and length is: "+indiaCovidCases.length);
		//System.out.println("indiaCovidCases[0] is: "+indiaCovidCases[0]); // ?
		for(int idx=0;idx<indiaCovidCases.length;idx++) {
			System.out.println("indiaCovidCases["+idx+"] is: "+indiaCovidCases[idx]+" Length: "+indiaCovidCases[idx].length);
		}
		
		for(int i=0;i<indiaCovidCases.length;i++) {
			for(int j=0;j<indiaCovidCases[i].length;j++) {
				System.out.print(indiaCovidCases[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Enhanced For Loop
		for(int[] array : indiaCovidCases) { // here we are iterating in 1 D Arrays
			for(int element : array) {	// here we are iterating in elements  of 1 D Array
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 5 1D Arrays, with each 1D Array having 3 elements ald those 3 elements are 0 by default
		int a1[][] = new int[5][3];
		a1[1][2] = 1;
		
		// 3 1D Arrays but size as of now not decided in this 2 D Arrays 
		//int a2[][] = new int[3][];
		//int[][] a2 = new int[3][];
		int[][] a2;
		a2 = new int[3][];
		
		a2[0] = new int[5];
		a2[1] = new int[7];
		a2[2] = new int[11];
		
		for(int[] array : a2) { // here we are iterating in 1 D Arrays
			for(int element : array) {	// here we are iterating in elements  of 1 D Array
				System.out.print(element+" ");
			}
			System.out.println();
		}

	}

}

















