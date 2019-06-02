package dayeight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Elementstate {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		String url= "http://www.facebook.com";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("#u_0_9")).click();
		boolean isSelected = driver.findElement(By.cssSelector("#u_0_9")).isSelected();
		if(isSelected)
		{
			System.out.println("Is selected");
		}
		if(!isSelected)
		{
			System.out.println("Is not selected");
		}
		
		driver.close();
		
	}

}
