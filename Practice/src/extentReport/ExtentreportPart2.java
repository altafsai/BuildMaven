package extentReport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.utils.FileUtil;

public class ExtentreportPart2 {
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		ExtentHtmlReporter reporter= new ExtentHtmlReporter("./Reports/report2.html");
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		logger= extent.createTest("LoginTest");
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException, Exception
	{
			if(ITestResult.FAILURE==result.getStatus())	
				
			{   ExtentreportPart2 part2= new ExtentreportPart2();
				String temp= takesScreenShot();
				Thread.sleep(5000);
				logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
				Thread.sleep(5000);

			}
			extent.flush();
			driver.quit();
	}
	
	public String takesScreenShot()
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\altaf\\eclipse-workspace-practice\\Practice\\Shots\\1shot"+System.currentTimeMillis()+".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (Exception e) {
			System.out.println("captured failed" +e.getMessage());	}
			
			return path;
	}
	
	@Test
	public void LoginTest() throws IOException
	{
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
		Assert.assertTrue(driver.getTitle().contains("altaf"));
	
	}
	
}
