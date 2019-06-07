package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import factory.BrowserFactory;

public class ConfigDataProvider extends BrowserFactory
{
	Properties pro;
	public ConfigDataProvider()
	{
		File src= new File("./Configuration/config.properties");
		try {
			FileInputStream fis= new FileInputStream(src);
			Properties pro= new Properties();
			pro.load(fis);
		} 
		catch (Exception e) {
			e.getMessage();
		}
		
		
	}
	
	public String appURL()
	{
		String data= pro.getProperty("url");
		return data;
	}
	
	public String chromePath()
	{
		String data= pro.getProperty("chromeDriver");
		return data;
	}
	
}
