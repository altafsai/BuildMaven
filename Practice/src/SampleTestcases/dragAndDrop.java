package SampleTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
	
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		Actions ac= new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();

	}

}
