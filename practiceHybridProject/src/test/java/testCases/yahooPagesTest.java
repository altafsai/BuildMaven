package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.homePage;
import pages.logINPage;

public class yahooPagesTest extends BrowserFactory

{
   
    
    @BeforeMethod
    //@Test
	public static void setUp()
	{
		//BrowserFactory.getBrowser("chrome");
		//driver.get(DataProviderFactory.getConfig().appURL());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\altaf\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	driver= new ChromeDriver();
		//driver.get(DataProviderFactory.getConfig().appURL());

    	//driver= new FirefoxDriver();
    	driver.get("http://www.yahoo.com");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
    
    @Test
	public void test()
	{
		homePage hp= PageFactory.initElements(driver, homePage.class);
		hp.logIn();
		
		logINPage lp=PageFactory.initElements(driver, logINPage.class);
		lp.verifyLink();
		lp.userLogin("alex");
	
		
	}
	
    @AfterMethod
	public void close()
	{
    driver.close();
}
	
	
}
