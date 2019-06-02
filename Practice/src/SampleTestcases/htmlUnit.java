package SampleTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;


public class htmlUnit 
{
WebDriver driver;
@Test
	public void html() throws Exception
	{   /*WebDriver driver = new HtmlUnitDriver();

        driver.setJavascriptEnabled(true);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("alexsai");
		driver.findElement(By.id("pass")).sendKeys("7867876");
		driver.findElement(By.id("u_0_2")).click();
		System.out.println("After login the title is "+driver.getTitle());*/
		
		// Declaring and initialize  HtmlUnitWebDriver
	   HtmlUnitDriver driver = new HtmlUnitDriver();
		
		//driver.setJavascriptEnabled(true);

		// open facebook webpage
		driver.get("http://www.facebook.com");

		// Print the title
		System.out.println("Title of the page "+ driver.getTitle());

		// find the username field
		WebElement username = driver.findElement(By.id("email"));

		// enter username
		username.sendKeys("mukeshotwani.50@gmail.com");

		// find the password field
		WebElement password = driver.findElement(By.id("pass"));

		// Click the loginbutton
		password.sendKeys("pjs@903998");

		// find the Sign up button
		WebElement Signup_button = driver.findElement(By.id("loginbutton"));

		// Click the loginbutton
		Signup_button.click();

		// wait for 5 second to login
		Thread.sleep(5000);

		// You will get new title after login
		System.out.println("After login title is = " + driver.getTitle());
		
		
		
	}
}
