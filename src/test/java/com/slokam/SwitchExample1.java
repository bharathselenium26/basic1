package com.slokam;

public class SwitchExample1 {

	
	public void test5(WEEKDAY weekday) {
	
	switch (weekday) {
		case SUNDAY:
			System.out.println("sunday identified");
			break;
		case MONDAY:
			System.out.println("monday identified");
			break;
		case TUESDAY:
			System.out.println("tuesday identified");
			break;
		case WEDNESDAY:
			System.out.println("wed identified");
			break;
		case THURSDAY:
			System.out.println("thurs identified");
			break;
		case FRIDAY:
			System.out.println("friday identified");
			break;
		case SATURDAY:
			System.out.println("saturday identified");
			break;
		
		default:
			System.out.println("No browser valid");
			break;
		}
	}
}
