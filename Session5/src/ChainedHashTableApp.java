
public class ChainedHashTableApp {

	public static void main(String[] args) {
		
		System.out.println("[main] ChainedHashTable Demo");
		ChainedHashTable table = new ChainedHashTable(13);
		System.out.println("[main] table is: "+table);
		
		
		table.put(25);
		table.put(51);
		
		table.put(51);
		table.put(51);
		
		
		table.put(101);
		table.put(311);
		
		table.put(977);
		table.put(999);
		table.put(1224);
		
		table.iterate();
		
		table.remove(51);
		
		table.iterate();

	}

}
