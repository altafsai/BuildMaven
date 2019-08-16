package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import factory.BrowserFactory;

public class homePage extends BrowserFactory
{
    WebDriver driver;
	public homePage(WebDriver Idriver)
	{
		this.driver=Idriver;
	}
	
	@FindBy(xpath="//li[@class='Pos(r) Fl(start) Mend(26px)']//a[text()='Sign in']") 
	WebElement signIN;
	
	public void logIn()
	{
		signIN.click();
	}
	
}
