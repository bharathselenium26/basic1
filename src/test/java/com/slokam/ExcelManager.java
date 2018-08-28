package com.slokam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelManager {

	XSSFSheet sheet = null;
	
	public ExcelManager(){
		intial();
	}
	public void intial() {
		File file = new File("D:\\Login.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook book = new XSSFWorkbook(fis);
			sheet=  book.getSheet("Sheet1");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getCell(int rowNumber,int cellNumber) {
		XSSFRow row = sheet.getRow(rowNumber);
		XSSFCell cell = row.getCell(cellNumber);
		String value = "";
		if(cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
			double v = cell.getNumericCellValue();
			value= String.valueOf(v);
		}else if(cell.getCellType()==cell.CELL_TYPE_STRING) {
			value = cell.getStringCellValue();
		}
		
		return value;
	}
	
	
	public int getNumberofRows() {
		return sheet.getPhysicalNumberOfRows();
	}
	public static void main(String[] args) {
		ExcelManager manager = new ExcelManager();
		System.out.println(manager.getNumberofRows());
	}
}
