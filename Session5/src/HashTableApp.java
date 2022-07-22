
public class HashTableApp {

	public static void main(String[] args) {
		
		//HashTable table1 = new HashTable();
		HashTable table2 = new HashTable(13);
		
		//System.out.println("For table1, Initial Size: "+table1.size()+" and Capacity: "+table1.capacity()+" HashCode: "+table1);
		System.out.println("[main] For table2, Initial Size: "+table2.size()+" and Capacity: "+table2.capacity()+" HashCode: "+table2);

		Employee emp1 = new Employee(101, "John", "john@example.com", 30000);
		Employee emp2 = new Employee(331, "Fionna", "fionna@example.com", 40000);
		Employee emp3 = new Employee(971, "Dave", "dave@example.com", 55000);
		Employee emp4 = new Employee(765, "Mark", "mark@example.com", 70000);
		Employee emp5 = new Employee(122, "Anna", "anna@example.com", 65000);
		
		Employee emp6 = new Employee(101, "Kim", "kim@example.com", 57000);
		
		System.out.println("[main] emp1: "+emp1);
		System.out.println("[main] emp2: "+emp2);
		System.out.println("[main] emp3: "+emp3);
		System.out.println("[main] emp4: "+emp4);
		System.out.println("[main] emp5: "+emp5);
		
		// We are passing the key as Employee ID and value as Employee Object
		table2.put(emp1.employeeId, emp1);
		table2.put(emp2.employeeId, emp2);
		table2.put(emp3.employeeId, emp3);
		table2.put(emp4.employeeId, emp4);
		table2.put(emp5.employeeId, emp5);
		
		System.out.println("[main] For table2 after Employee Insertions, Size: "+table2.size()+" and Capacity: "+table2.capacity());
		
		table2.put(emp6.employeeId, emp6);
		System.out.println("[main] For table2 after Duplicate Key Inserted, Size: "+table2.size()+" and Capacity: "+table2.capacity());
		
		table2.iterate();
		
		LinkedList keys = table2.keys();
		System.out.println("#####################");
		System.out.println("[main] Keys in HashTable");
		keys.iterate();
		System.out.println("#####################");
		
		Employee emp = (Employee)table2.get(999);
		//Employee emp = (Employee)table2.get(0);
		if(emp!=null) {
			emp.showEmployee();
		}else {
			System.out.println("[main]: HashTable Returned null which means no object at given key");
		}
		
		table2.remove(331);
		table2.remove(101);
		
		table2.remove(999);
		
		System.out.println("[main] For table2 after Delete of Keys Size: "+table2.size()+" and Capacity: "+table2.capacity());
		table2.iterate();
		
		keys = table2.keys();
		System.out.println("#####################");
		System.out.println("[main] Keys in HashTable after remove operation on hashTable");
		keys.iterate();
		System.out.println("#####################");
	}

}
