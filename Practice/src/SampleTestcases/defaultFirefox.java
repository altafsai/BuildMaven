package SampleTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.Test;

public class defaultFirefox 
{@Test
/*
	ProfilesIni init= new ProfilesIni();
	FirefoxProfile profile= init.getProfile("default");
	WebDriver driver= new FirefoxDriver(profile);
	driver.get("http://learn-automation.com/");*/
	
    // Create object of ProfilesIni class
	public void defaultProfile()
	{

    ProfilesIni init=new ProfilesIni();



    // Get the default session  

    FirefoxProfile profile=init.getProfile("default");



   // Pass the session/profile to FirefoxDriver 

    WebDriver driver=new FirefoxDriver(profile);



    driver.get("http://learn-automation.com/");



    driver.quit();
	}
	
}
