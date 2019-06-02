package dayonetofour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnetoFour {
	
	@Test(retryAnalyzer=SampleTestcases.retryDemo.class)
	public static void verifyTitle(){
    int qty= 5;
    int price = 2;
    int amount = qty * price;
    
    System.out.println("The total is = " +amount);

    WebDriver driver = new FirefoxDriver();
    String url = "http://www.facebook.com";
    driver.get(url);
    driver.findElement(By.id("email")).sendKeys("alexsai");
    driver.findElement(By.id("pass")).sendKeys("7867876");
    driver.findElement(By.id("u_0_2")).click();
    
    System.out.println(driver.findElement(By.xpath("//a[@id='reg-link']")).getText());
    Assert.assertTrue(driver.getTitle().contains("altaf"));
   
   
    
    
	}
	
	

}
