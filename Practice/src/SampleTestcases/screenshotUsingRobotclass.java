package SampleTestcases;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshotUsingRobotclass 
{

	public static void main(String[] args) throws Exception, Exception {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		BufferedImage image= new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File("./Shots/bufferedImageDemo.png"));
		
	}
	
}
