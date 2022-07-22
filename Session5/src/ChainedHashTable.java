
public class ChainedHashTable {

	static String TAG = "[ChainedHashTable] ";
	
	Integer capacity;
	Integer size;
	
	LinkedList[] buckets;
	
	public ChainedHashTable() {
		this(10);
	}
	
	public ChainedHashTable(int capacity) {
		this.capacity = capacity;
		size = 0;
		// HashTable Buckets which has Nodes inside it as Slots
		buckets = new LinkedList[capacity];
		print("Created HashTable with Capacity of "+capacity+" and buckets is: "+buckets);
	}
	
	int hash(Integer key) {
		int hashCode = key % capacity;
		return hashCode;
	}
	
	void put(Integer data) {
		
		int idx = hash(data);
		
		if(buckets[idx] == null) {
			buckets[idx] = new LinkedList();
			print("LinkedList Created for "+idx+" hashCode: "+buckets[idx]);
		}
		
		size++;
		buckets[idx].add(data);
		print("Data "+data+" Added at "+idx);
		
	}
	
	void iterate() {
		
		print("Iterating in ChainedHashTable: Size: "+size);
		
		for(int idx=0;idx<buckets.length;idx++) {
			
			if(buckets[idx] != null) {
				print("Iterating in Bucket: "+idx);
				LinkedList list = buckets[idx];
				list.iterate();
			}
		}
	}
	
	void remove(int data) {
		
		int idx = hash(data);
		if(buckets[idx] != null) {
			print("Deleting Data "+data+"....");
			LinkedList list = buckets[idx];
			list.delete(data);
			size--;
		}else {
			print("Data Not Available to Remove");
		}
		
	}
	
	static void print(String text) {
		System.out.println(TAG+text);
	}
	
	int size() {
		return size;
	}
	
	int capacity() {
		return capacity;
	}
	
}
