package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigDataProvider;

public class BrowserFactory 
{
    public static WebDriver driver;
	public static WebDriver getBrowser(String browserName) throws Exception 
	{
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
		{  
			ConfigDataProvider c= new ConfigDataProvider();
			String path= c.test();
			System.setProperty("webdriver.chrome.driver", path);
            driver= new ChromeDriver();
            driver.get("http://www.yahoo.com");
		}
		
		else if(browserName.equalsIgnoreCase("ie"))
		{   ConfigDataProvider ca= new ConfigDataProvider();
			System.setProperty("webdriver.ie.driver", ca.ieDriver());
			driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	public static void closeBrowser(WebDriver  ldriver)
	{
		ldriver.close();
	}
	
	
}
