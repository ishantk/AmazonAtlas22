
public class HashTableLinearProbingApp {

	public static void main(String[] args) {
		
		HashTableLP table = new HashTableLP(29);
		System.out.println("[main] Size: "+table.size()+" Capacity: "+table.capacity());

		table.put(10);
		table.put(20);
		table.put(29);
		table.put(58);
		table.put(87);
		table.put(27);
		table.put(28);
		table.put(29);
		table.put(56);
		table.put(30);
		table.put(31);
		table.put(32);
		table.put(33);
		table.put(11);
		table.put(22);
		table.put(40);
		table.put(42);
		table.put(47);
		table.put(49);
		table.put(51);
		table.put(31);
		table.put(32);
		table.put(33);
		table.put(11);
		table.put(22);
		table.put(40);
		table.put(42);
		table.put(47);
		table.put(49);
		table.put(77);
		table.put(91);
		
		table.iterate();
		
	}


}
