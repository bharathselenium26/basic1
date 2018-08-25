package slokam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public void test1() {
		File file  =new File("D:\\abc.xlsx");
		
		
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("bharath");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell =row.createCell(0);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("Bharath");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			book.write(fos);
			book.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		WriteExcel e = new WriteExcel();
		e.test1();
	}
}
