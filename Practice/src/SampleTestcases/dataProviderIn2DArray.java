package SampleTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(SampleTestcases.iTestListenerDemo.class)
public class dataProviderIn2DArray 
{
WebDriver driver;
	
@Test(dataProvider="testdata")
public void testFirefox(String userName, String passWord)
	{
		driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(passWord);

	}


@DataProvider(name="testdata")
public Object[][] TestDataFeed()
{
	Object[][] data= new Object[2][2];
	data[0][0]="Selenium@gmail.com";
	data[0][1]="Password1";
	data[1][0]="Selenium@gmail.com";
	data[1][1]="Password2";
	return data;

}
}

