package SampleTestcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class iTestListenerDemo implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
     	System.out.println("onFinish "+result.getName());
	}

	@Override
	public void onStart(ITestContext result) {
     	System.out.println("onStart "+result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
     	System.out.println("onTestFailedButWithinSuccessPercentage "+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
     	System.out.println("onTestFailure "+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
     	System.out.println("onTestSkipped "+result.getName());

	}

	@Override
	public void onTestStart(ITestResult result) {
     	System.out.println("onTestStart "+result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
     	System.out.println("onTestSuccess "+result.getName());

	}

}
