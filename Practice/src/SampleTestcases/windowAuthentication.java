package SampleTestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowAuthentication 
{
	WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriver driver= new FirefoxDriver();
	    Runtime.getRuntime().exec("C:\\Users\\altaf\\Desktop\\AutoIT\\authentication.exe");
	    driver.get("http://www.engprod-charter.net/");
	
	}
}
