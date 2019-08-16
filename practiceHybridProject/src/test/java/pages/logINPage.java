package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import factory.BrowserFactory;

public class logINPage 
{
WebDriver driver;
public logINPage(WebDriver ldriver)
{
	this.driver=ldriver;
}

@FindBy(xpath="//div[@id='username-country-code-field']/input") WebElement userName;

@FindBy(xpath="//form[@id='login-username-form']/input[3]") WebElement nextStep;

By account= By.xpath("//p[@class='row sign-up-link']/a");
public void userLogin(String user)
{
	userName.sendKeys(user);
	nextStep.click();
}

public void verifyLink()
{
	WebDriverWait wait= new WebDriverWait(driver, 20);
	WebElement ele=wait.until(ExpectedConditions.presenceOfElementLocated(account));
	String text=ele.getText();
	Assert.assertEquals(text, "Create account");
}

}
