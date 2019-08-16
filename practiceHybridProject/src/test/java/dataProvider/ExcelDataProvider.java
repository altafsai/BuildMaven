package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import factory.BrowserFactory;

public class ExcelDataProvider 
{
	static XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
	File src= new File("./ApplicationTestData/dataProvider.xlsx");
    try {
		FileInputStream fis= new FileInputStream(src);
		wb= new XSSFWorkbook(fis);
	} 
    catch (Exception e) {
		e.getMessage();
	}


	}
	
	public String getData(int sheetNumber, int row, int column)
	{
		File src= new File("C:\\Users\\altaf\\git\\BuildMaven\\practiceHybridProject\\ApplicationTestData\\dataProvider.xlsx");
	    try {
			FileInputStream fis= new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		} 
	    catch (Exception e) {
			e.getMessage();
		}
	String data= wb.getSheetAt(sheetNumber).getRow(row).getCell(column).getStringCellValue();
	return data;
	
	
	}
	
	
	@Test
	public void triger() throws Exception
	{
		/*File src= new File("C:\\Users\\altaf\\git\\BuildMaven\\practiceHybridProject\\ApplicationTestData\\dataProvider.xlsx");
	    FileInputStream fis= new FileInputStream(src);
	    wb= new XSSFWorkbook(fis);*/
		 
	ExcelDataProvider e= new ExcelDataProvider();  
	//String data= getData(0, 0, 0);
	System.out.println(e.getData(0, 0, 0));
	}
	}
	
