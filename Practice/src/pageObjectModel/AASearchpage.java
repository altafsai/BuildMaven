package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AASearchpage {
	
	static WebDriver driver;
	static WebElement element;
	
	
	
	public static void openbrowser(String webPagename)
	{
		driver = new FirefoxDriver();
		String url= webPagename;
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	public static void Flyfrom(String origin)
	{
		element= driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
	    element.sendKeys(origin);
	}
	
	public static void Flyto(String destinaton)
	{
		element= driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
	    element.sendKeys(destinaton);
	}
	
	public static void departuredate(String depdate)
	{
		element= driver.findElement(By.id("aa-leavingOn"));
		element.clear();
	    element.sendKeys(depdate);
	}
	
	public static void returndate(String retdate)
	{
		element= driver.findElement(By.id("aa-returningFrom"));
		element.clear();
        element.sendKeys(retdate);
	}
	
	
	
	
		
		
	}


