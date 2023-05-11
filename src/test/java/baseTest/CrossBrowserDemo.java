package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserDemo {
	WebDriver driver;
	
	
	@Parameters({"browsername"})
	@BeforeTest
	public void setUp(String browsername)
	{
		switch(browsername)
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			break;
			
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
			default:
				System.out.println("Provide a valid browsername " + browsername );
			
		}
		
		driver.get("https://www.google.com");
	}
	
	
	@Test
	public void checkGoogle_Title()
	{
		String actual = driver.getTitle();
	    Assert.assertEquals(actual,"Google");
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
