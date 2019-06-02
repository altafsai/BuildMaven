package pageObjectModel;

import org.testng.annotations.Test;

public class AAPageobjectmodel {

	
	
	@Test
	public static void AADetails()
	{
		AASearchpage.openbrowser("http://www.aa.com");
		AASearchpage.Flyfrom("DFW");
		AASearchpage.Flyto("HOU");
		AASearchpage.departuredate("04/25/2019");
		AASearchpage.returndate("04/28/2019");
		

	}
}
