package SampleTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase1 
{   WebDriver driver;
	
	@Test
    @Parameters("Browser")
	public void test1(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{   System.setProperty("webdriver.chrome.driver", "C:\\Users\\altaf\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.quit();
	}
	
	
}
