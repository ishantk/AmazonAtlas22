public class HashSetApp {

	public static void main(String[] args) {
		
		HashSet set1 = new HashSet(); 	// capacity of 10
		HashSet set2 = new HashSet(13);	// capacity of 13
		
		
		set2.put(15);
		set2.put(20);
		//set2.put(13);
		//set2.put(26);
		set2.put(0);
		
		set2.remove(20);
		set2.remove(1);
		
		set2.iterate();
		
		System.out.println("SIZE of set1 is: "+set1.size());
		System.out.println("SIZE of set2 is: "+set2.size());
		
		System.out.println("CAPACITY of set1 is: "+set1.capacity());
		System.out.println("CAPACITY of set2 is: "+set2.capacity());
		
		System.out.println("Value at Idx 3 is: "+set2.get(3));
		System.out.println("Value at Idx 2 is: "+set2.get(2));
		
	}

}
