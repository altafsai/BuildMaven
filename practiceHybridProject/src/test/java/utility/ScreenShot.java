package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class ScreenShot 
{
    static WebDriver driver;
	public static File pic(String fileName) throws Exception
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File fileLocation= new File(fileName);
		FileUtils.copyFile(scr, fileLocation);
		return fileLocation;
				
	}
	
	
	public static void conclude(ITestResult result, String fileName) throws Exception
	{
		if(ITestResult.SUCCESS==result.getStatus())
		{
			pic(fileName);
		}
		
	}
	
}
