package daynine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchwindows {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		String url= "http://www.CitiGroup.com";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Sign on to Accounts"))).perform();
		//driver.findElement(By.linkText("Sign on to Accounts")).click();
		driver.findElement(By.linkText("CitiBusiness")).click();
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		 
		for (String allWindows : driver.getWindowHandles())
		{
			driver.switchTo().window(allWindows);
		}
		
		System.out.println(driver.getTitle());
		
		
	
	
	
	
	}

}
