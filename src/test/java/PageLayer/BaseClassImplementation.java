package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassImplementation {
	public WebDriver driver;

	@BeforeTest
	public void browserSetup()
	{
                System.out.ptintln("first");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();


	}
	@AfterTest
	public void closeBrowser()
	{

		driver.close();
	}

	


	
}
