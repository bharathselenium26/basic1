package slokam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExacel {

	
	public void test1() {
		File file =new File("D:\\f21.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet1");
			XSSFRow row = sheet.getRow(2);
			XSSFCell cell = row.getCell(0);
			System.out.println(cell);
			cell = row.getCell(1);
			System.out.println(cell);
			
			row = sheet.getRow(3);
			cell = row.getCell(1);
			System.out.println(cell);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ReadExacel excel = new ReadExacel();
		excel.test1();
	}
}
