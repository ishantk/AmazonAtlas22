package com.amazon.atlas22.queries;

class MyThread extends Thread{
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("**MyThread** Doing some Job Number "+i);
		}
	}
}

class CA{
	
}

//class YourThread extends CA, Thread{ // -> Multiple Inheritance not supported
class YourThread extends CA implements Runnable{
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("~~YourThread~~ Doing some Job Number "+i);
		}
	}
	
}

class Student{
	String name;
	int marks;
}

class Teacher1 extends Thread{
	
	Student student;
	
	Teacher1(Student student){
		this.student = student;
	}
	
	public void run() {
		
		synchronized (student) {
			student.marks = 80;
			System.out.println("[Teacher1] Current Marks of Student "+student.name+" : "+student.marks);
		}
		
	}
}

interface Inf{
	void draw();
}

class Teacher2 extends Thread{
	
	Student student;
	
	Inf i = new Inf() {
		
		@Override
		public void draw() {
			// TODO Auto-generated method stub
			
		}
	};
	
	Teacher2(Student student){
		this.student = student;
		
	}
	
	public void run() {
		
		synchronized (student) {
			student.marks = 90;
			System.out.println("[Teacher2] Current Marks of Student "+student.name+" : "+student.marks);
		}
	}
}


public class MultiThreadingApp {

	// 1 process has 1 main method -> i.e. main thread :)
	public static void main(String[] args) {
		
		/*MyThread mRef = new MyThread();
		
		Runnable r = new YourThread();
		Thread th = new Thread(r);
		
		mRef.start();
		th.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("^^Main^^ Doing some Job Number "+i);
		}*/
		
		Student s1 = new Student();
		s1.name = "John";
		s1.marks = 0;
		
		Teacher1 teacher1 = new Teacher1(s1);
		Teacher2 teacher2 = new Teacher2(s1);
		
		teacher1.start();
		teacher2.start();

	}

}
