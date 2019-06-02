package dayten;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Hardassert {
    WebDriver driver;
    

	
	@BeforeMethod
	public void beforemethods()
	{
		driver = new FirefoxDriver();
	    String url = "http://www.facebook.com";
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	
@Test
	public void hardassert()
	{
		String expected = "Facebook - Log In or Sign U";
	    String actual = driver.getTitle();
		//System.out.println(driver.getTitle());
		Assert.assertEquals(actual, expected, "both messages r diff");
		System.out.println("both messages r different");
		
	}
@Test
	public void softassert()
	{
		
		SoftAssert sa = new SoftAssert();
		String expected = "Facebook - Log In or Sign U";
	    String actual = driver.getTitle();
		//System.out.println(driver.getTitle());
		sa.assertEquals(actual, expected, "both messages r diff");
		System.out.println("both messages r different");
		sa.assertAll();
		
	}
	
	
	
	
	
	
	
	
}
