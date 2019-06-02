package thirteenandfourteen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Utility {
	WebDriver driver;
	public void openBrowser(String webPageName)
	{
	    driver = new FirefoxDriver();
	    //String url = webPageName;
	    driver.get(webPageName);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	public void closeBrowser()
	{
        driver.close();
		driver.quit();
	}
	
	@Test
	public void method()
	
	{   Utility u= new Utility();
	    u.openBrowser("http://www.tdameritrade.com");
		u.closeBrowser();
	}

}
