
public class HashTableLPApp {

	public static void main(String[] args) {
		
		HashTable table = new HashTable(5);
		
		System.out.println("[main] For table, Initial Size: "+table.size()+" and Capacity: "+table.capacity()+" HashCode: "+table);

		// Bucket Size: 5
		// 5 -> 0
		// 10 -> 0
		// 11 -> 1
		// 16 -> 1 
		// 20 -> 0
		Employee emp1 = new Employee(5, "John", "john@example.com", 30000);
		Employee emp2 = new Employee(10, "Fionna", "fionna@example.com", 40000);
		Employee emp3 = new Employee(11, "Dave", "dave@example.com", 55000);
		Employee emp4 = new Employee(16, "Mark", "mark@example.com", 70000);
		Employee emp5 = new Employee(20, "Anna", "anna@example.com", 65000);
		Employee emp6 = new Employee(6, "Kim", "kim@example.com", 57000);
		
		System.out.println("[main] emp1: "+emp1);
		System.out.println("[main] emp2: "+emp2);
		System.out.println("[main] emp3: "+emp3);
		System.out.println("[main] emp4: "+emp4);
		System.out.println("[main] emp5: "+emp5);
		System.out.println("[main] emp6: "+emp6);
		
		table.putLP(emp1.employeeId, emp1);
		table.putLP(emp2.employeeId, emp2);
		table.putLP(emp3.employeeId, emp3);
		table.putLP(emp4.employeeId, emp4);
		table.putLP(emp5.employeeId, emp5);
		table.putLP(emp6.employeeId, emp6);
		
		table.iterate();

	}

}
