package myseleniumpakg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersTest implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("*****onTestStart******"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*****onTestSuccess*****"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*****onTestFailure*****"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		System.out.println("***** onStart *****"+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("***** onFinish *****"+context.getName());
		
	}


}
