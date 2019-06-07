package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import factory.BrowserFactory;

public class ExcelDataProvider extends BrowserFactory
{
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
	File src= new File("C:\\Users\\altaf\\eclipse-workspace-practice\\practiceHybridProject\\ApplicationTestData\\dataProvider.xlsx");
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
	String data= wb.getSheetAt(sheetNumber).getRow(row).getCell(column).getStringCellValue();
	return data;
	
	
	}
	}
	
