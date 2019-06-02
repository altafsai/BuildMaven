package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trycatchfinally


{
	WebDriver driver;
	public void open()
	
	{
    driver = new FirefoxDriver();
    String url = "http://www.facebook.com";
    driver.get(url);
	}
    
    public void detail()
    {
    try {
		driver.findElement(By.id("emai")).sendKeys("alexsai");
		driver.findElement(By.id("pass")).sendKeys("7867876");
		driver.findElement(By.id("u_0_2")).click();
	} 
    catch (Exception e) {
    	System.out.println("Unable to locate the element");
		System.out.println(e);
	}
    }
    
    public void detail2()
    {
    driver.findElement(By.id("email")).sendKeys("alexsai");
    driver.findElement(By.id("pass")).sendKeys("7867876");
    driver.findElement(By.id("u_0_2")).click();
    }
    
    public void close()
    {
    	driver.close();
    }
    
    public static void main(String[] args) {
    	Trycatchfinally tcf= new Trycatchfinally();
    	tcf.open();
    	tcf.detail();
    	tcf.close();
    	tcf.open();
    	tcf.detail2();
    	tcf.close();
    	
	}

}
