package com.slokam;

public class SwitchExample {

	//Constants 
	int a = 10;
	
	
	public static final String SUNDAY= "sunday";
	public static final String MONDAY= "monday";
	public static final String TUESDAY= "tuesaday";
	public static final String WEDNESDAY= "wednesday";
	public static final String THURSDAY= "thursday";
	public static final String FRIDAY= "friday";
	public static final String SATURDAY= "saturday";
	
	public void test4(String weekday) {
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
	
	
	
	
	
	public void test3() {
		System.out.println(a);
		a = 20;
		System.out.println(a);
	}
	
	public void test1(String browser) {
		if(browser.equals("firefox")) {
			System.out.println("firefox identified");
		}else if(browser.equals("ie")) {
			System.out.println("ie identified");
		}else if(browser.equals("chrome")) {
			System.out.println("chrome identified");
		}else if(browser.equals("safari")) {
			System.out.println("safari identified");
		}else {
			System.out.println("No browser valid");
		}
	}
	
	public void test2(String browser) {
		
		switch (browser) {
			case "firefox":
				System.out.println("firefox identified");
				break;
			case "chrome":
				System.out.println("chrome identified");
				break;
			case "ie":
				System.out.println("ie identified");
				break;
			case "safari":
				System.out.println("safari identified");
				break;
			
			default:
				System.out.println("No browser valid");
				break;
		}
		
		
	}
	
	
	
}
