// Employee will by default inherit Object Class :)
public class Employee { // Employee is Child Of Object and Reference variable of Object can refer to the Employee

	String TAG = "[Employee] ";
	
	int employeeId;
	String name;
	String email;
	int salary;
		
	public Employee() {
		// this as execution for constructor
		this(0, "NA", "NA", 0); // Execute the Parameterized Constructor to initialize the object with some default data
	}

	public Employee(int employeeId, String name, String email, int salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	void showEmployee() {
		System.out.println(TAG+"EID: "+employeeId+" NAME: "+name+" EMAIL: "+email+" SALARY: "+salary);
	}
	
}
