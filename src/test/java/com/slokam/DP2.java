package com.slokam;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP2 {

	@Test(dataProvider="logindp2")
	public void verifyLogin(String username,String password) {
		if(username.equals("u2")) {
			Assert.fail();
		}
		login(username,password);
	}
	
	@DataProvider(name="logindp")
	public Object[][] dataP() {
		
		Object[][] obj = new Object[4][2];
		
		obj[0][0] = "u1";
		obj[0][1] = "p1";
		
		obj[1][0] = "u2";
		obj[1][1] = "p2";
		
		obj[2][0] = "u3";
		obj[2][1] = "p3";
		
		obj[3][0] = "u4";
		obj[3][1] = "p4";
		
		return obj;
		
	}
	
	
	@DataProvider(name="logindp2")
	public Object[][] dataP2() {
		ExcelManager ex = new ExcelManager();
		int size = ex.getNumberofRows();
		Object[][] obj = new Object[size-1][2];
		
		for (int i = 0; i < obj.length; i++) {
			obj[i][0] = ex.getCell(i+2, 2);
			obj[i][1] = ex.getCell(i+2, 3);
		}
	
		return obj;
		
	}
	
	
	public void login(String username,String password) {
		System.out.println("username : " + username + " password : " + password);
	}
}
