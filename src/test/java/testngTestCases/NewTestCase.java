package testngTestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestCase {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test(priority=-1)
	public void checkTitle()
	{
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle,"OrangeHRM");
	}
	
	@Test(priority=0)
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("passwo")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterTest
	public void tear()
	{
		driver.quit();
	}
	
	public void captureScreenshot()
	{
		TakesScreenshot tks= (TakesScreenshot)driver;
		File temp = tks.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshotFail/newfailedcase" +System.currentTimeMillis()+".png");
		
		try {
			FileUtils.copyFile(temp, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
