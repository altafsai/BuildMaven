package dayten;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test(priority = 3)
	public void lastmethod()
	{
		System.out.println("This is the last method");
	}
	
	@Test(priority = 1)
	
	public void firstmethod()
	{
		System.out.println("This is the first method");
	}
	
	
	@Test(priority = 2)

	public void secondmethod()
	{
		System.out.println("This is the second method");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("This is the before method");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("This is the after method");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("This is the before class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("This is the after class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is the before test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is the after test");
	}
	
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is the before suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("This is the after suite");
	}
	
	
	
	
	
	

}
