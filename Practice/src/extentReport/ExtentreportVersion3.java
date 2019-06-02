package extentReport;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentreportVersion3 {

	@Test
	public void LoginTest() throws IOException
	{
		System.out.println("login to amazon");
		ExtentHtmlReporter reporter= new ExtentHtmlReporter("./Reports/reprt1.html");
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger= extent.createTest("LoginTest");
		
	    
		logger.log(Status.INFO, "LoginTest");
		logger.log(Status.PASS, "LoginVerified");
		extent.flush();

		ExtentTest logger2= extent.createTest("Logoff Test");
		logger2.log(Status.FAIL, "logoff");
        //logger2.addScreenCaptureFromPath("C:\\Users\\altaf\\eclipse-workspace-practice\\Hybrid_Project\\Capture\\AlreadyExistEmailAddress.png");
		logger2.fail("Failed", MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\altaf\\eclipse-workspace-practice\\Hybrid_Project\\Capture\\AlreadyExistEmailAddress.png").build());
		extent.flush();
	
	}
	
}
