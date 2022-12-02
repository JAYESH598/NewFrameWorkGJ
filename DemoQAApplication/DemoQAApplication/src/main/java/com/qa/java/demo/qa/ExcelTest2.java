package com.qa.java.demo.qa;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelTest2 {

	public static void excleData() throws Exception {
		
		FileInputStream fi = new FileInputStream(new File("C:\\Users\\jv18280\\eclipse-workspace\\DemoQAApplication\\src\\test\\java\\excel\\drt.xlsx"));    
		
	    XSSFWorkbook wb = new XSSFWorkbook(fi);
	    XSSFSheet sh = wb.getSheet("Sheet1");
	    Row row= sh.getRow(0);
//	    String ss = row.getCell(0).getStringCellValue();
	    System.out.println(row.getCell(0).getStringCellValue());
	    wb.close();
		
	}
	public static void main(String[] args) throws Exception {
		excleData();
	}
	
	
	/*public static void Exl() throws Exception {
		excleData();
	}*/
		
		
		
		
		
		/*File file=new File(Resourcepath.Excelpath);
		FileInputStream fi = new FileInputStream(file);    
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("sheet1");
		String ss = sh.getRow(row).getCell(column).getStringCellValue();
		System.out.println(ss);
		wb.close();
		return ss;
		

	}*/
}
