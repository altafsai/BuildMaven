package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.homePage;
import pages.logINPage;

public class yahooPagesReports extends BrowserFactory

{
	ExtentReports extent;
	ExtentTest logger;
    
    //@BeforeMethod
    @Test
	public static void setUp()
	{    
    	ExtentReports extent= new ExtentReports(".\\Reports\\loginReport.html", true);
    	ExtentTest logger= extent.startTest("YahooPages");
    	
		//BrowserFactory.getBrowser("chrome");
		//driver.get(DataProviderFactory.getConfig().appURL());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\altaf\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	driver= new ChromeDriver();
		//driver.get(DataProviderFactory.getConfig().appURL());

    	//driver= new FirefoxDriver();
    	driver.get("http://www.yahoo.com");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	logger.log(LogStatus.INFO, "Application is up and running");
		
	/*}*/
	
    
    /*@Test
	public void test()
	{*/
		homePage hp= PageFactory.initElements(driver, homePage.class);
		hp.logIn();
    	logger.log(LogStatus.PASS, "Successfully move to another page");

		logINPage lp=PageFactory.initElements(driver, logINPage.class);
		lp.verifyLink();
    	logger.log(LogStatus.PASS, "Condition is verified");

		lp.userLogin("alex");
    	logger.log(LogStatus.PASS, "Successfully login");

	
		
	/*}
	
    @AfterMethod
	public void close()
	{*/
    extent.endTest(logger);	
    extent.flush();
    driver.close();
}
	
	
}
