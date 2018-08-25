package com.slokam.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileIO {

	@Test
	public void test1() {
		
		File file  = new File("D:\\sample.txt");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bf = new BufferedReader(fileReader);
			String st = bf.readLine();
			System.out.println(st);
			
			while(!(st==null)) {
				st = bf.readLine();
				System.out.println(st);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void test2() {
		File file  = new File("D:\\sample.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			int s = bis.read();
			System.out.println(s);
			char c = (char)s;
			System.out.println(c);
			
			
			while(!(s==-1)) {
				s = bis.read();
				c = (char)s;
				System.out.println(c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void write1() {
		
		File file = new File("D:\\abc.txt");
		try {
			FileWriter write = new FileWriter(file);
			BufferedWriter w = new BufferedWriter(write);
			w.write("I am bharath");
			w.close();
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public void write2() {
		
		File file = new File("D:\\abc1.txt");
		try {
			FileOutputStream write = new FileOutputStream(file);
			BufferedOutputStream w = new BufferedOutputStream(write);
			byte[] bu = new byte[5];
			bu[0] = 72;
			bu[1] = 88;
			w.write(bu);
			w.close();
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		FileIO io =new FileIO();
		io.write2();
	}
}
