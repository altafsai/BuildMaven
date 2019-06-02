package SampleTestcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class brokenLinks 
{
public static void main(String[] args) throws Exception {
	DesiredCapabilities dc= new DesiredCapabilities();
	dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	
	WebDriver driver= new FirefoxDriver(dc);
	driver.manage().window().maximize();
	driver.get("http://www.google.co.in/");
	List<WebElement> links= driver.findElements(By.tagName("a"));
	System.out.println("Total links = "+links.size() );
	
	for(int i=0;i<=links.size();i++)
	{
		String url= links.get(i).getAttribute("href");
		verifyLinkActive(url);
	}
	
	
}	

public static void verifyLinkActive(String linkUrl) throws Exception
{
	URL url= new URL(linkUrl);
	HttpURLConnection httpURLConnect= (HttpURLConnection)url.openConnection();
	httpURLConnect.setConnectTimeout(3000);
	httpURLConnect.connect();
	if(httpURLConnect.getResponseCode()==200)
	{
		System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage());
	}
	if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
	{
		System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage());
	}


}
	
}
