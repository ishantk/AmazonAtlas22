
public class RecursionMax {
	
	static int getMaxNumber(int[] numbers, int length) {
		
		System.out.println("[getMaxNumber] [PUSH] started with length as "+length);
		
		int num = 0;
		
		if(length == 1) {
			System.out.println("[getMaxNumber] [POP] finished with length as "+length);
			return numbers[0]; // if array has only 1 element, that element itself is max
		}else {
			num = getMaxNumber(numbers, length-1);
		}
		
		if(num > numbers[length-1]) {
			System.out.println("[getMaxNumber] [POP] finished with length as "+length);
			return num;
		}else {
			System.out.println("[getMaxNumber] [POP] finished with length as "+length);
			return numbers[length-1];
		}
	}

	public static void main(String[] args) {
		
		int[] data = {10, 20, 30};
		
		int max = RecursionMax.getMaxNumber(data, data.length);
		
		System.out.println("Max is: "+max);

	}

}


/*

with Loop:
 
int max = data[0];

for(int idx=1; idx<data.length;idx++) {
	
	if(data[idx] > max) {
		max = data[idx];
	}
	
}*/
