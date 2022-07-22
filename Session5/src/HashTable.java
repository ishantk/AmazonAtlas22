
public class HashTable {

	static String TAG = "[HashTable] ";
	
	Integer capacity;
	Integer size;
	
	// Instead of the integer buckets, we got the Objects now
	// Which means it can store any type of Object
	
	// Keys are the indexes i.e. HashCode for us and they are as of now Integer only :)
	// Values will be some User Defined Objects
	Object[] buckets;
	
	HashTable(){
		//capacity = 10;
		//buckets = new Object[capacity];
		//print("Created with default Size of 10");
		this(10); // Executing Parameterized Constructor to create HashTable with capacity of 10 bucket as default capacity
	}
	
	HashTable(int capacity){
		this.capacity = capacity;
		buckets = new Object[capacity];
		size = 0;
		print("Created HashTable with Capacity of "+capacity+" at "+buckets);
	}
	
	// Hash Function Computes the Index for the Object to be inserted in the HashTable Bucket
	int hash(Integer key) {
		int hashCode = key % capacity;
		return hashCode;
	}
	
	/*boolean put(Integer key, Object value) {
		
		int idx = hash(key);
		
		if(buckets[idx] == null) {
			buckets[idx] = value;
			size++;
			print("For Key: "+key+" Value Added at index "+idx);
			return true;
		}else {
			print("Key Value Pair Already Exists: "+key+" at index: "+idx);
			return false;
		}
	}*/
	
	// put will insert or update :)
	boolean put(Integer key, Object value) {
		
		int idx = hash(key);
		
		if(buckets[idx] == null) {	
			size++;
		}
		
		buckets[idx] = value;
		print("For Key: "+key+" Value Added at index "+idx);
		
		
		return true;
	}
	
	// For Linear Probing in HashTable
	void putLP(Integer key, Object value) {
		
		int idx = hash(key);
		
		if(buckets[idx] == null) {	
			size++;
			buckets[idx] = value;
			print("put1: Key: "+key+" Value: "+((Employee)value).name+" Added");
		}else {
				idx++;
				if(idx>=capacity && size<capacity) {
					idx=0;
					putLP(key, value, idx);
				}else {
					if(size<capacity) {
						putLP(key, value, idx);
					}else {
						print("put1: No More Bucket remaining for "+key+" [Overflown]");					}
				}
			}	
	}

	// For Linear Probing in HashTable
	void putLP(Integer key, Object value, int idx) {
		if(buckets[idx] == null) {	
			size++;
			buckets[idx] = value;
			print("put2: Key: "+key+" Value: "+((Employee)value).name+" Added");
		}else {
				idx++;
				if(idx>=capacity && size<capacity) {
					idx=0;
					putLP(key, value, idx);
				}else {
					if(size<capacity) {
						putLP(key, value, idx);
					}else {
						print("put2: No More Bucket remaining for "+key+" [Overflown]");
					}
				}
			}
	}
	
	void iterate() {
		System.out.println(TAG+"Iterating Buckets Started | Size: "+size);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		// Iterating in buckets array
		for(int idx=0;idx<buckets.length;idx++) {
			if(buckets[idx] != null) {
				
				System.out.println("KEY: "+idx);
				// Downcast the Object back to Employee
				Employee emp = (Employee)buckets[idx];
				emp.showEmployee();
				System.out.println("^^^^^^^^^^^^^^^^^^");
		
			}
		}
		System.out.println(TAG+"Iterating Buckets Finished");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	
	Object get(Integer key) {
		
		int idx = hash(key);
		
		Employee emp = (Employee)buckets[idx];
		
		if(emp.employeeId == key)
			return buckets[idx]; // O(1)
		else
			return null;
	}
	
	boolean remove(Integer key) {
		int idx = hash(key);
		Employee emp = (Employee)buckets[idx];
		if(emp.employeeId == key) {
			buckets[idx] = null; // O(1)
			size--;
			print("Key: "+key+" Removed");
			return true;	
		}
		else {
			print("Key: "+key+" Not Found");
			return false;
		}
	}
	
	// Make Sure to remove the elements using Linear Probing
	boolean removeLP(Integer key) {
		// Implement this method yourself
		return true;
	}
	
	// Write a method which returns all the keys in the HashTable :)
	LinkedList keys() {
		LinkedList keys = new LinkedList();
		
		for(Object object : buckets) {
			if(object != null) {
				Employee emp = (Employee)object;
				keys.add(emp.employeeId);
			}
		}
		
		return keys;
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
