package thirteenandfourteen;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Takesscreenshot
{static WebDriver driver;
@BeforeMethod
	public static void open() 
{
    driver = new FirefoxDriver();
    String url = "http://www.facebook.com";
    driver.get(url);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
	
	}
@Test	
	public static void details() throws Exception 
{
    driver.findElement(By.id("email")).sendKeys("alexsai");
    driver.findElement(By.id("pass")).sendKeys("7867876");
    String before= driver.getTitle();
    System.out.println(before);
    driver.findElement(By.id("u_0_2")).click();
    String after= driver.getTitle();
    System.out.println(after);

    if(before.equals("Facebook - Log In or Sign Up"))
    {
    	//Takesscreenshot shot= new Takesscreenshot();
    	//shot.capturescreenshot();
    	/*TakesScreenshot ts = (TakesScreenshot)driver;
    	File sourcefile= ts.getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(sourcefile, new File ("C:\\Users\\altaf\\Desktop\\sshoot.png"));
    	*/
    	capturescreenshot();
    	
    }
}

public static void capturescreenshot() throws Exception 
{
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File ("C:\\Users\\altaf\\Desktop\\sshoot1.png"));
	
}
}