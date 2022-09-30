package com.amazon.atlas22.queries;

class Perumtation{
	
	void permute(String str, int idx, String perm) {
		
		if(str.length() == 0) {
			System.out.println(perm);
			return;
		}
		for(int i=0; i<str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i+1);
			permute(newStr, idx+1, perm+currChar);
		}
	}
}

public class Recursion {

	public static void main(String[] args) {
		
		String text = "ABC";
		// -> n! permutations :)
		// ABC, ACB, BAC, BCA, CBA, CAB
		
		/*
		 				ABC						Step1 -> Original String
		 				
		 		Pick A and Swap with All
		
   Swap A with A    Swap A with B	Swap A with C
		 	ABC			BAC			CBA			Step2 -> Did some swap Operation :)

		 	
		ABC 	ACB	  BAC	BCA		CBA	  CAB	Step3 -> Did some swap Operation :)
		AB		AC	  BA    BC		CB	  CA 	-> no more further swap
		 
		 */

		Perumtation perumtation = new Perumtation();
		perumtation.permute(text, 0, "");
				
		
	}

}
