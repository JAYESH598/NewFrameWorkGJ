package com.qa.java.demo.qa;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;





public class ExcelTest {

	public static String excleData (int row, int column) throws Exception {
		
		FileInputStream fi = new FileInputStream(new File(Resourcepath.Excelpath));    
		
	    XSSFWorkbook wb = new XSSFWorkbook(fi);
	    XSSFSheet sh = wb.getSheet("Sheet1");
	    String ss = sh.getRow(row).getCell(column).getStringCellValue();
	    System.out.println(ss);
	    wb.close();
	    return ss;
		
	}
		
		
		
		
		
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
