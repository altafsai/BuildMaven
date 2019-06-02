package SampleTestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryDemo implements IRetryAnalyzer
{
    int minretryCount= 0;
    int maxretryCount= 2;

	@Override
	public boolean retry(ITestResult result) {
		if(minretryCount<=maxretryCount)
		{
			System.out.println("Method is failing "+result.getName());
			System.out.println("Retrying the test count is "+(minretryCount+1));
			minretryCount++;
			return true;
		}
		
		return false;
	}

}
