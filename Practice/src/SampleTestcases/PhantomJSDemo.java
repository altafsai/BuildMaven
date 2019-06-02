package SampleTestcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class PhantomJSDemo 
{
@Test
public void verifyFacebookTitle()
{
	File src= new File("C:\\Users\\altaf\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	System.setProperty("phantomjs.binary.path", src.get)
	WebDriver driver= new  phantomJSDriver(); 
}
	
	
}
