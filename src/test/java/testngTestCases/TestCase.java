package testngTestCases;

import java.io.File;
import java.io.IOException;

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

public class TestCase {
	
	 static WebDriver driver;
	
	@BeforeTest
	public void  launchBrowser()

	{
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
	}
	
	
	@Test
	public void login()
	{
		driver.findElement(By.id("emai")).sendKeys("oranium@gmail,cop");
	}
	
	
	@AfterTest
	public void quit()
	{
		driver.close();
	}
	
	
	public  void captureScreenshot()
	{
		TakesScreenshot tks = (TakesScreenshot)driver;
		File temp = tks.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshotfailed/fb" +System.currentTimeMillis()+".png");
		try {
			FileUtils.copyFile(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
