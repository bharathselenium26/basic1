package com.slokam;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DP {
	@Test	
	public void validTest() {
		String username= "xyz";
		String password= "xyz123";
		login(username,password);
	}
	
	@Test
	public void invalidTest1() {
		
		String username= "mnl";
		String password= "mnl123";
		login(username,password);
	}
	
	@Test
	public void invalidTest2() {
		
		String username= "bharath";
		String password= "bharath123";
		login(username,password);
	}
	
	@Test
	public void invalidTest3() {
		
		String username= "dasarath";
		String password= "dasarath";
		login(username,password);
	}
	
	@Test
	public void invalidTest() {
		
		String username= "abc";
		String password= "abc123";
		login(username,password);
	}
	public void login(String username,String password) {
		System.out.println("username : " + username + " password : " + password);
	}
}
