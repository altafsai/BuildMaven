package dayeight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switchtoiframe {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		String url= "http://seleniumhq.github.io/selenium/docs/api/java/index.html";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.switchTo().frame(2);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium.condition")).click();
	}

}
