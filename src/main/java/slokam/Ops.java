package slokam;

public class Ops {

	public static void main(String[] args) {
		
		Student st1  = new Student();
		Student st2 =  new Student();
		st1.callingbell();
		st1.openDoor();
		st1.enterStudent();
		st1.closeDoor();
		
		st1.age = 40;
		System.out.println(st1.age);
		System.out.println(st2.age);
		
	
	}
}
