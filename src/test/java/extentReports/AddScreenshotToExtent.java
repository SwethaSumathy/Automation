package extentReports;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
public class AddScreenshotToExtent {
	WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;
	@BeforeTest
	public void browserSetup()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Report\\extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	@Test 
	public void checkTitle()
	{
		test=extent.createTest("Checking the google title").assignAuthor("oranium").assignCategory("regression");
		// test.log(Status.PASS, "Fetching the title of google page");
		String actualtitle = driver.getTitle();
		if(actualtitle.equals("Google"))
		{
			test.pass("Title matched succesfully");
		}
		else
		{
			test.fail("Title didnt get match" +actualtitle);
		}
	}
	@Test(priority=2)
	public void clickAboutLink() throws IOException
	{
		test= extent.createTest("Clicking the About link");
		try
		{
			driver.findElement(By.linkText("about")).click();
		}
		catch(Exception e )
		{
			test.fail("Exception handled " +e.getMessage());
			test.addScreenCaptureFromPath(captureScreenshot());
			System.out.println("Handled the exception: " );
		}
	}
	@AfterTest
	public void tear()
	{
		driver.quit();
		extent.flush();
	}
	public String captureScreenshot() throws IOException
	{
		TakesScreenshot tks = (TakesScreenshot)driver;
		File temp = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshotfail/newgoogle" +System.currentTimeMillis()+".png");
		FileUtils.copyFile(temp, dest);
		String absolutePath = dest.getAbsolutePath();
		return absolutePath;
	}
}
