package Datadrivenframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {

	public static void main(String[] args) throws Exception {
		File src= new File("C:\\Users\\altaf\\eclipse-workspace\\DDF\\Testcases\\Data.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet excelsheet= wb.getSheetAt(0);
        
        String data= excelsheet.getRow(1).getCell(0).getStringCellValue();
        String data1= excelsheet.getRow(2).getCell(0).getStringCellValue();
        String data2= excelsheet.getRow(3).getCell(0).getStringCellValue();
        String data3= excelsheet.getRow(4).getCell(0).getStringCellValue();
        
        System.out.println(data);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
       
        wb.close();

	}

}
