package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testngTestCases.NewTestCase;

public class MyListener extends NewTestCase implements ITestListener{
	
	  public void onTestStart(ITestResult result) {
		 System.out.println("On Test start ");
		  }
	  
	 public  void onTestSuccess(ITestResult result) {
		    
		 
		 System.out.println("On Test success ");
		  }
	 
	 
	 public void onTestFailure(ITestResult result) {
		   captureScreenshot(); 
		  System.out.println("On Test failure ");
		  }
	 
	 public void onTestSkipped(ITestResult result) {
		   System.out.println("On test skipped");
		  }

	 
	 public void onStart(ITestContext context) {
		System.out.println("On start");
		  }
	  public void onFinish(ITestContext context) {
		 System.out.println("On finish ");
		  }

}
