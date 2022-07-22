
public class HashTableLP {

	Integer capacity;
	Integer size;
	
	Integer[] buckets;
	
	static String TAG = "[HashTableLP] ";
	
	HashTableLP(){
		this(10);
	}
	
	HashTableLP(int capacity){
		this.capacity = capacity;
		buckets = new Integer[capacity];
		size = 0;
		print("Created HashTable with Capacity of "+capacity+" at "+buckets);
	}
	
	int hash(Integer key) {
		int hashCode = key % capacity;
		return hashCode;
	}
	
	void put(Integer data) {
		
		int idx = hash(data);
		
		if(buckets[idx] == null) {	
			size++;
			buckets[idx] = data;
			print("Data: "+data+" Added at HashCode i.e. idx: "+idx);
		}else {
				idx++;
				if(idx>=capacity && size<capacity) {
					idx=0;
					put(data, idx);
				}else {
					if(size<capacity) {
						put(data, idx);
					}else {
						print("put1: No More Bucket remaining for "+data+" [Overflown]");					}
				}
			}
				
	}
		

	void put(Integer data, int idx) {
		if(buckets[idx] == null) {	
			size++;
			buckets[idx] = data;
			print("Put2: Data: "+data+" Added at HashCode i.e. idx: "+idx);
		}else {
				idx++;
				if(idx>=capacity && size<capacity) {
					idx=0;
					put(data, idx);
				}else {
					if(size<capacity) {
						put(data, idx);
					}else {
						print("put2: No More Bucket remaining for "+data+" [Overflown]");
					}
				}
			}
	}
	
	/*
	// put will insert or update :)
	void put(Integer data) {
		
		int idx = hash(data);
		
		if(buckets[idx] == null) {	
			size++;
			buckets[idx] = data;
			print("put1: Data: "+data+" Added at HashCode i.e. idx: "+idx);
		}else {
			idx++;
			if(idx>=capacity) {
				idx=0;
			}
			put(data, idx);
		}
		
	}
	
	// Method Overloading
	void put(Integer data, int idx) {
		if(buckets[idx] == null) {	
			size++;
			buckets[idx] = data;
			print("put2: Data: "+data+" Added at HashCode i.e. idx: "+idx);
		}else {
			idx++;
			if(idx>=capacity) {
				idx=0;
			}
			put(data, idx);
		}
	}*/
	
	void iterate() {
		System.out.println(TAG+"Iterating Buckets Started SIZE: "+size+" Capacity: "+capacity);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		// Iterating in buckets array
		for(int idx=0;idx<buckets.length;idx++) {
			if(buckets[idx] != null) {
				System.out.println("Key: "+idx+" Value: "+buckets[idx]);
				System.out.println("^^^^^^^^^^^^^^^^^^");
			}
		}
		System.out.println(TAG+"Iterating Buckets Finished");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
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
