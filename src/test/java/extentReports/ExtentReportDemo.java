package extentReports;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	
//	ExtentSparkReporter spark = new ExtentSparkReporter("user/build/name/");
//	ExtentReports extent = new ExtentReports();
//	extent.AttachReporter(spark);
	
	@BeforeTest
	public void start()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Report\\extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}
	
	@Test
	public void signIn()
	{
	 test = extent.createTest("User is signing on first page");
	 test.log(Status.PASS, "Sign in page got pass");
	 
	}
	
	@Test
	
	public void homepage()
	{
		test= extent.createTest("Homepage Test").assignAuthor("Oranium").assignCategory("smoke").assignDevice("chrome");
		test.pass("User is on home page succesfully");
	}
	
	@Test
	public void productpage()
	{
		test= extent.createTest("Product page test").assignAuthor("Guys").assignCategory("Regression").assignDevice("Edge");
		test.fail("Product page test case got failed"); 
		
	}
	
	
	@AfterTest
	public void quit()
	{
		extent.flush();
	}
	
}
