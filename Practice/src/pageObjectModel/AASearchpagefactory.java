package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AASearchpagefactory {
	WebDriver driver;
	
	@FindBy (id = "reservationFlightSearchForm.originAirport") 
	WebElement origin;
	@FindBy (id = "reservationFlightSearchForm.destinationAirport") 
	WebElement destination;
	@FindBy (id = "aa-leavingOn") 
	WebElement departure;
	@FindBy (id = "aa-returningFrom") 
	WebElement arrival;
	//@FindBy (url = "http://www.aa.com") WebElement url;
	
	public void AASearchpagefactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	public void openbrowser(String webPagename)
	{
		driver = new FirefoxDriver();
		String url= webPagename;
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	
	public void origincity(String orig)
	{
		origin.sendKeys(orig);
	}
	public void destinationcity(String dest)
	{
		
		destination.sendKeys(dest);
	}	
	public void departuredate(String dep)
	{
		departure.clear();
		departure.sendKeys(dep);
	}	
	public void arrivaldate(String arri)
	{
		arrival.clear();
		arrival.sendKeys(arri);
	}

	

}
