package dayeight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchtoalert {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new FirefoxDriver();
		String url= "http://www.google.com";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("alert('test alert')");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
	}

}
