package slokam;


public class Student {
	
	//variables -- data
	//methods -- operations

	public int age = 30;
	private String name = "bharath";
	protected double percentage = 76.5;
	boolean result  = false;
	
 	void closeDoor(){
		System.out.println("Closing the door");
		System.out.println("Door closed.");
	}
 	void openDoor(){
		System.out.println("Opening the door");
		System.out.println("Door Opened.");
	}
 	void enterStudent() {
 		System.out.println("enter student");
 	}
 	void callingbell() {
 		System.out.println("calling bell ringed");
 		
 	}
 	
 	void accumulator() {
 		callingbell();
 		openDoor();
 		enterStudent();
 		closeDoor();
 	}
 	
 	public void result(int marks) {
 		if(marks<40) {
 			System.out.println("Student failed");
 		}else {
 			System.out.println("Student pass");
 		}
 	}
	
 	public int add(int a , int b) {
 		int c  =  a +b;
 		return c;
 	}
 	
 	public void average(int value) {
 		
 		int z = value/2;
 		System.out.println(z);
 	}
 	
 	public Student getStudent() {
 		Student st = new Student();
 		return st;
 	}
 	
 	
 	public static void main(String[] args) {
		Student st1 = new Student();
		st1.average(10);
		int d = st1.add(10, 20);
	}
}

	
	