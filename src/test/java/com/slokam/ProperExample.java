package com.slokam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ProperExample {

	
	public void test1() {
		
		Properties prop = new Properties();
		File file = new File("D:\\env.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String nameValue = prop.getProperty("wait");
		System.out.println(nameValue);
		int i = Integer.parseInt(prop.getProperty("wait"));
		int k = 120;
		int j =i +k;
		System.out.println(nameValue+k);
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		
		ProperExample p = new ProperExample();
		p.test1();
	}
}

