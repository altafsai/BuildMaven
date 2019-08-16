package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import factory.BrowserFactory;

public class ConfigDataProvider {
	Properties pro;
	WebDriver driver;

	public void ConfigDataProviderr() {

		try {
			File src = new File(
					"C:\\Users\\altaf\\git\\BuildMaven\\practiceHybridProject\\Configuration\\config.properties");
			FileInputStream fis = new FileInputStream(src);
			Properties pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {

			e.getMessage();
		}

	}

	public String appURL() {

		String data = pro.getProperty("url");
		return data;
	}

	public String chromePath() {

		String data = pro.getProperty("chromeDriver");

		return data;
	}

	public String ieDriver() {
		String data = pro.getProperty("iePath");
		return data;
	}

	// @Test
	public String test() throws Exception {

		File src = new File(
				"C:\\Users\\altaf\\git\\BuildMaven\\practiceHybridProject\\Configuration\\config.properties");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);

		String data = pro.getProperty("chromeDriver");
		return data;

	}
	

	public String test1() throws Exception {

		File src = new File(
				"C:\\Users\\altaf\\git\\BuildMaven\\practiceHybridProject\\Configuration\\config.properties");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);

		String data = pro.getProperty("url");
		return data;

	}

	@Test
	public void smallTest() throws Exception {
		ConfigDataProvider cdp = new ConfigDataProvider();
		System.setProperty("webdriver.chrome.driver", cdp.test());
		WebDriver driver = new ChromeDriver();
		System.out.println(cdp.test1());
	}

}
