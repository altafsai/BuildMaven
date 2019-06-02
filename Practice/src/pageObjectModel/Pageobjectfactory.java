package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import thirteenandfourteen.Utility;

public class Pageobjectfactory extends AASearchpagefactory {
static WebDriver driver;

@Test(priority=1)
public void open()
{

	driver = new FirefoxDriver();
	//String url= webPagename;
	driver.get("http://www.aa.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();
	
	//AASearchpage pof= new AASearchpage();
	//pof.openbrowser("http://www.aa.com");
    
    //Utility uti= new Utility();
   // uti.openBrowser("http://www.aa.com");
}

/*public static void main(String[] args) 
{   Utility uti= new Utility();
	uti.openBrowser("http://www.aa.com");
	
	AASearchpagefactory sp= PageFactory.initElements(driver, AASearchpagefactory.class);
	
	sp.origincity("DFW");
	sp.destinationcity("HOU");
	sp.departuredate("04/25/2019");
	sp.arrivaldate("04/28/2019");
	
}*/





	@Test(priority=2)
	public void Details()
	{
		
		AASearchpagefactory sp= PageFactory.initElements(driver, AASearchpagefactory.class);
		
		sp.origincity("DFW");
		sp.destinationcity("HOU");
		sp.departuredate("04/25/2019");
		sp.arrivaldate("04/28/2019");
		
	}
}
