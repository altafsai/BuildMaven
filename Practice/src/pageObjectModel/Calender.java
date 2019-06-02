package pageObjectModel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender {
	public static void main(String[] args) {
		WebDriver driver;
		
		
	
		driver = new FirefoxDriver();
		String url= "http://www.aa.com";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("DFW");
	    //element.sendKeys("DFW");
	
		driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("HOU");
	    //element.sendKeys("HOU");
	
	
		//element= driver.findElement(By.id("aa-leavingOn"));
		//element.clear();
	    //element.sendKeys(depdate);
	    driver.findElement(By.id("aa-leavingOn")).clear();
	    
	   // WebElement cal= driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger'][@type='button']"));
	    WebElement cal= driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]"));
 
	    List<WebElement> dates= cal.findElements(By.tagName("td"));
	    
	    int totalDates= dates.size();
	    
	    for (int i=0; i<totalDates; i++)
	    {
	    	String date= dates.get(i).getText();
	    	
	    	if(date.equals("25"))
	    	{
	    		dates.get(i).click();
	    		break;
	    	}
	    }
	
	
	
		driver.findElement(By.id("aa-returningFrom")).clear();
		//element.clear();
        //element.sendKeys(retdate);
	    //WebElement call= driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger'][@type='button']"));
	    //WebElement call= driver.findElement(By.xpath("//label[@for='aa-returningFrom']//button[@class='ui-datepicker-trigger'][@type='button']"));
	   // WebElement call= driver.findElement(By.xpath("//label[@for='aa-returningFrom']//button[@class='ui-datepicker-trigger']"));
	    WebElement call= driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']//div[@class='ui-datepicker-group ui-datepicker-group-last']"));
 
	    List<WebElement> datesss= call.findElements(By.tagName("td"));
	    
	    int totalDat= datesss.size();
	    
	    for (int i=0; i<totalDat; i++)
	    {
	    	String da= datesss.get(i).getText();
	    	
	    	if(da.equals("28"))
	    	{
	    		datesss.get(i).click();
	    		break;
	    	}
	    }
	    driver.close();
	}
	}

