package SampleTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class scollingPageAndScrollintoview 
{

WebDriver driver;
//@BeforeMethod
public void open() throws Exception
{
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://jqueryui.com");
	Thread.sleep(5000);
}

//@Test

public void scrollPage() throws Exception
{WebDriver driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://jqueryui.com");
Thread.sleep(5000);
	   JavascriptExecutor JE= (JavascriptExecutor)driver;
	
	   JE.executeScript("scroll(0,400)");
}

@Test
public void scrollintoView() throws Exception
{WebDriver driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
Thread.sleep(5000);
	   JavascriptExecutor JE= (JavascriptExecutor)driver;
	   
	   WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
	
	   JE.executeScript("arguments[0].scrollIntoView(true);", element);
	   
	   System.out.println(element.getText());
}
}
