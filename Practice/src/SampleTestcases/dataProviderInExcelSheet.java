package SampleTestcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderInExcelSheet 
{
WebDriver driver;
String userName;
String passWord;
XSSFWorkbook wb;
int rows;
int rowsNum;
	
@Test(dataProvider="testdata")
public void testFirefox(String userName, String passWord)
	{
		driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(passWord);

	}


@DataProvider(name="testdata")
public Object[][] TestDataFeed() throws Exception, Exception
{
	
	wb = new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\altaf\\eclipse-workspace-practice\\Hybrid.com\\ApplicationTestData\\lakhani.xlsx")));
	int rows= wb.getSheetAt(0).getLastRowNum();
	int rowsNum= rows+1;
	
	Object[][] data= new Object[rowsNum][2];
	
	for(int i=0; i<rowsNum; i++)
	{
	data[i][0]=wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();
	data[i][1]=wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
	
	
	}
	return data;

}
}

