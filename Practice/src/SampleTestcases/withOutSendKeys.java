package SampleTestcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class withOutSendKeys 
{
@Test
	public static void withJavascipt()
	{
	WebDriver driver= new FirefoxDriver();
	driver.get("http://www.facebook.com");
	((JavascriptExecutor)driver).executeScript("document.getElementById('email').value='altaf';");
	((JavascriptExecutor)driver).executeScript("document.getElementById('pass').value='altaf';");
	((JavascriptExecutor)driver).executeScript("document.getElementById('u_0_2').click;");

	}
}
