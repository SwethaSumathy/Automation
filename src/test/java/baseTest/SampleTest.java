package baseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void checkTitle()
	{
		String actualtitle = driver.getTitle();
	
		Assert.assertEquals(actualtitle, "Google");
	}
	
	
	@Test
	public void checkUrl()
	{
		String actualurl = driver.getCurrentUrl();
		
		System.out.println(actualurl);  // https://www.google.com/
		Assert.assertEquals(actualurl, "https://www.google.com");
	}

	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}

}
