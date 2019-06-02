package dayfivetosix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fivetosix {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver= new FirefoxDriver();
		String url= "http://www.facebook.com";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Forgot account?")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.name("firstname")).sendKeys("alex");
		driver.findElement(By.name("lastname")).sendKeys("lak");
		driver.findElement(By.name("reg_email__")).sendKeys("alex@yahoo.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("alex@yahoo.com");
		Select monthlist= new Select(driver.findElement(By.id("month")));
		monthlist.selectByIndex(8);
		Select daylist= new Select(driver.findElement(By.id("day")));
		daylist.selectByValue("2");
		Select yearlist= new Select(driver.findElement(By.id("year")));
		yearlist.selectByVisibleText("1992");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());


		
	

		
		
		
	}

}
