package thirteenandfourteen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Stockdatadriven 
{   
	WebDriver driver;
	XSSFWorkbook wb;
@Test (priority =1)
	public void browser()
	{
		//Utility.openBrowser("http://www.tdameritrade.com");
	    driver = new FirefoxDriver();
	    //String url = webPageName;
	    driver.get("http://www.tdameritrade.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	
@Test  (priority =2)
	public void search() throws Exception
	{
		
		
		File src= new File("C:\\Users\\altaf\\Desktop\\Book2.xlsx");
		
		FileInputStream fis= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet excelsheet= wb.getSheetAt(0);
		
		int rowcount= excelsheet.getLastRowNum();
		
		for (int i=1; i<=rowcount; i++)
		{
			String data= excelsheet.getRow(i).getCell(0).getStringCellValue();
		    
			driver.findElement(By.id("header-search-desktop")).sendKeys(data, Keys.ENTER);
			
			Thread.sleep(2000);
			
			Boolean ispresent= driver.findElements(By.className("stock-result-title")).size()>0;
		
		    if (ispresent.equals(false))
		    {
				driver.findElement(By.id("header-search-desktop")).clear();
				
				excelsheet.getRow(i).createCell(1).setCellValue("notFound");
				excelsheet.getRow(i).createCell(2).setCellValue("notFound");
				
				FileOutputStream fos= new FileOutputStream(src);
				
				wb.write(fos);
				
				
    	
		    }
		    
		    if (ispresent.equals(true))
		    {   WebElement company= driver.findElement(By.className("stock-result-title"));
				
		       String companyName= company.getText(); 
		        
				
				excelsheet.getRow(i).createCell(1).setCellValue(companyName);
				
				String price= driver.findElement(By.className("current-stock-price")).getText();
				excelsheet.getRow(i).createCell(2).setCellValue(price);
				
                FileOutputStream fos1= new FileOutputStream(src);
				
				wb.write(fos1);
				
			    driver.findElement(By.id("header-search-desktop")).clear();
			    

				
		    }
		    
		  /*  Utility ut= new Utility();	
		    //wb.close();
		    ut.closeBrowser();
		    wb.close();*/
		    
		    //driver.close();
		   // wb.close();
			wb.close();

		    
		}
	}


	@Test (priority =3)
	public void finalstep() throws Exception
	{
	
	
//    Utility.closeBrowser();
//	wb.close();}
	driver.close();
	//wb.close();
	
	
	
	}

/*@Test
  public void closeup() throws Exception
{
   Utility ut= new Utility();	
   //wb.close();
   ut.closeBrowser();
   wb.close();
}*/
	

}
