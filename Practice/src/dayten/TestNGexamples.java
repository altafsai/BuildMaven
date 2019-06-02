package dayten;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNGexamples 

{
	WebDriver driver;
	@BeforeMethod 
	public void open()
	{
		driver = new FirefoxDriver();
	    String url = "http://www.facebook.com";
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	
	@Test (priority = 2)
	public void method2()
	{    
	driver.findElement(By.id("email")).sendKeys("alex");
    driver.findElement(By.id("pass")).sendKeys("786");
    driver.findElement(By.id("u_0_2")).click();
		
	}
	
	@Test (priority = 1)
	public void method()
	{    
	driver.findElement(By.id("email")).sendKeys("alexsai");
    driver.findElement(By.id("pass")).sendKeys("7867876");
    driver.findElement(By.id("u_0_2")).click();
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}

}
