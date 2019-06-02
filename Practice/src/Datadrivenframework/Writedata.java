package Datadrivenframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public static void main(String[] args) throws Exception {
		File src= new File("C:\\Users\\altaf\\eclipse-workspace\\DDF\\Testcases\\Data.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet excelsheet= wb.getSheet("Sheet1");
        
        excelsheet.getRow(11).createCell(0).setCellValue("Altaf");
        excelsheet.getRow(11).createCell(1).setCellValue("Al");
        excelsheet.getRow(12).createCell(0).setCellValue("javeed");

        //excelsheet.getRow(15).createCell(1).setCellValue("javeed");
       // excelsheet.getRow(10).createCell(0).setCellValue("Alt");
    //excelsheet.getRow(12).createCell(0).setCellValue("dee");
        //excelsheet.getRow(13).createCell(0).setCellValue("javeed");
       // excelsheet.getRow(14).createCell(0).setCellValue("hashim");
        
        FileOutputStream fos= new FileOutputStream(src);
        wb.write(fos);
        wb.close();

	}

}
