package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataProvider;
import factory.BrowserFactory;
import pages.homePage;
import pages.logINPage;

public class yahooPagesTest 

{

	WebDriver driver;

	//@Test(priority = 1)
	public void setUp() throws Exception {
		//BrowserFactory browserFactory= new BrowserFactory();
		BrowserFactory.getBrowser("chrome");}
	
	@Test(priority = 1)
	@Parameters("URL")
	public void url(String URL) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\altaf\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get(URL);
	}

	@Test(priority = 2)
	public void test1() throws Exception {
		homePage hp = PageFactory.initElements(driver, homePage.class);
		hp.logIn();

		logINPage lp = PageFactory.initElements(driver, logINPage.class);
		lp.verifyLink();

		SoftAssert sa = new SoftAssert();
		System.out.println(driver.getTitle());
		sa.assertTrue(driver.getTitle().contains("Yahoo"));

		ExcelDataProvider e = new ExcelDataProvider();
		lp.userLogin(e.getData(0, 0, 0));

		Thread.sleep(3000);

		sa.assertAll();

	}

}
