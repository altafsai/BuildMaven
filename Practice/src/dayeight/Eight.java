package dayeight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Eight {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		String url= "http://www.amazon.com";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
	    WebElement clickOnList= driver.findElement(By.linkText("Create a List"));
	    act.contextClick(clickOnList).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
	
	
	
	}
	
	
	

}
