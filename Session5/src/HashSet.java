// Create the Structure for HashTable
public class HashSet{
	
	static String TAG = "[HashSet] ";
	
	// Capacity means how much buckets do we have to store data
	int capacity;
	
	// Size of HashSet menas, how many elements have we inserted i.e. put
	int size;
	
	// Create an Array Reference Variable :)
	//int[] buckets; // default it is null
	Integer[] buckets;	
	
	// HashTable Construction with default capacity i.e. bucket size of 10
	public HashSet() {
		capacity = 10;
		
		// when we create integer array, the default value at all the indexes will be 0
		//buckets = new int[10];
		buckets = new Integer[10];
		System.out.println(TAG+"Created with default Capacity of 10");
	}
	
	static void print(String text) {
		System.out.println(TAG+text);
	}

	// HashTable Construction with capacity as passed by the user in input of this constructor
	public HashSet(int capacity) {
		this.capacity = capacity;
		
		// when we create integer array, the default value at all the indexes will be 0
		//buckets = new int[capacity];
		buckets = new Integer[capacity];
		print("Created with Capacity of "+capacity);
	}
	
	int hash(int value) {
		// Algorithm: To compute remainder for the value with capacity
		int hashCode = value % capacity;
		return hashCode;
	}
	
	// the put function does not supports adding 0 as data and no collisions
	// Hence, it supports unique indexes to have unique data :) ==> HASH SET :)
	boolean put(int value) {
		
		// insert data at idx which is basically the HashCode
		int idx = hash(value);
		//if(buckets[idx] == 0) {
		if(buckets[idx] == null) {
			size++;
			buckets[idx] = value; // AUTO BOXING
			System.out.println(TAG+"put: value "+value+" added at idx: "+idx);
			return true;
		}else {
			System.err.println(TAG+"put: value "+value+" failed at idx: "+idx);
			return false;
		}
		
	}
	
	void remove(int value) {
		int idx = hash(value);
		if(buckets[idx] != null && buckets[idx]==value) {
			//buckets[idx] = 0;
			buckets[idx] = null;
			System.out.println(TAG+"remove: value "+value+" removed at idx: "+idx);
			size--;
		}else {
			System.err.println(TAG+"remove: value "+value+" does not exist at idx: "+idx);
		}
	}
	
	void iterate() {
		System.out.println(TAG+"Iterating Buckets Started");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		// Iterating in buckets array
		for(int idx=0;idx<buckets.length;idx++) {
			if(buckets[idx] != null) {
				System.out.println(TAG+"At idx: "+idx+" value is: "+buckets[idx]);
			}
		}
		System.out.println(TAG+"Iterating Buckets Finished");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	int size() {
		return size;
	}
	
	int capacity() {
		return capacity;
	}
	
	// Makes no sense in HashSet
	// As HashCodes are computed based on the value
	// We cannot remember the HashCodes which are computed internally
	int get(int key) {
		if(buckets[key] !=null) {
			return buckets[key]; // pass the key and get the value
		}else {
			System.err.println(TAG+"get: "+key+" not available");
			return -1;
		}
	}

}
