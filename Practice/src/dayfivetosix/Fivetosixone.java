package dayfivetosix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fivetosixone {
	
	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		String url= "http://www.facebook.com";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.xpath("//a[contains(@href, 'https://www.facebook.com/recover/initiate?')]")).click();
		//driver.findElement(By.xpath("//a[starts-with(@href, 'https://www.facebook.com/recover/initiate?')]")).click();
		//driver.findElement(By.xpath("//a[text()='Forgot account?']")).click();
        //driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' or @data-type='text']")).sendKeys("alex");
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("123");
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("123");
		//driver.findElement(By.cssSelector("input[id='email'][class='inputtext']")).sendKeys("123");
		//driver.findElement(By.cssSelector("input[data-testid*='royal_']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[data-testid$='email']")).sendKeys("123");
        
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("alex@yahoo.com");
		String value= driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		String email= driver.findElement(By.xpath("//input[@id='email']")).getAttribute("id");
		
		System.out.println( value +" and " +email);
		
		
		
	}

	
	
	
	
}
