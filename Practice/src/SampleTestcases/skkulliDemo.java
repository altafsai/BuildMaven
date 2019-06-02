package SampleTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class skkulliDemo 
{
public static void main(String[] args) throws FindFailed {
	Screen screen= new Screen();
	
	Pattern image= new Pattern("C:\\image\\Capture1.PNG");
	Pattern image1= new Pattern("C:\\image\\Capture2.PNG");
	Pattern image2= new Pattern("C:\\image\\Capture3.PNG");
    WebDriver driver= new FirefoxDriver();
    driver.manage().window().maximize();
    driver.get("http://www.google.com");
    screen.wait(image, 10);
    screen.click(image);
    screen.wait(image1, 10);

    screen.click(image1);
    screen.wait(image2, 10);

    screen.type(image2, "alezx@gmail.com");


}
}
