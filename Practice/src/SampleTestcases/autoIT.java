package SampleTestcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class autoIT 
{
    @Test
	public void AutoIT() throws Exception
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("C:\\Users\\altaf\\Desktop\\fileupload.html");
	    driver.findElement(By.name("resumeupload")).click();
	    Thread.sleep(5000);
	    Runtime.getRuntime().exec("C:\\Users\\altaf\\Desktop\\AutoIT\\AutoIT.exe");
	
	
	}
	
}
