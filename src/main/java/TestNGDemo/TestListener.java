package TestNGDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{
	public void onStart(ITestContext context) {
	    System.out.println("I am in start listener");
	  }
	
	public void onFinish(ITestContext context) {
	    // not implemented
		System.out.println("I am in finish listener");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test succeeded");
	  }
}
