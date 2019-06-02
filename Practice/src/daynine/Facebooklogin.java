package daynine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklogin {
	static WebDriver driver;

	public static void openbrowser() {
    driver = new FirefoxDriver();
    String url = "http://www.facebook.com";
    driver.get(url);}

	public static void userdetails()
{    driver.findElement(By.id("email")).sendKeys("alexsai");
    driver.findElement(By.id("pass")).sendKeys("7867876");
    driver.findElement(By.id("u_0_2")).click();}
	
	public static void closebrowser() {
		
		driver.close();
	}
	
	
	public static void main(String[] args) {
		
		openbrowser();
		userdetails();
	    closebrowser();
		
	}


	
}
