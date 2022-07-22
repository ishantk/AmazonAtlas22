
public class MenuHashTable {
	
static String TAG = "[MenuHashTable] ";
	
	Integer capacity;
	Integer size;
	
	DishList[] buckets;
	
	public MenuHashTable() {
		this(10);
	}
	
	public MenuHashTable(int capacity) {
		this.capacity = capacity;
		size = 0;
		buckets = new DishList[capacity];
		print("Created HashTable with Capacity of "+capacity+" and buckets is: "+buckets);
	}
	
	int hash(Integer key) {
		int hashCode = key % capacity;
		return hashCode;
	}
	
	void put(Integer key, Dish value) {
		
		int idx = hash(key);
		
		if(buckets[idx] == null) {
			buckets[idx] = new DishList();
			print("LinkedList Created for "+idx+" hashCode: "+buckets[idx]);
		}
		
		size++;
		buckets[idx].add(value);
		print("Dish "+value.name+" Added at "+idx);
		
	}
	
	void iterate() {
		
		print("Iterating in MenuHashTable: Size: "+size);
		
		for(int idx=0;idx<buckets.length;idx++) {
			
			if(buckets[idx] != null) {
				print("Iterating in Bucket: "+idx);
				DishList list = buckets[idx];
				list.iterate();
			}
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
