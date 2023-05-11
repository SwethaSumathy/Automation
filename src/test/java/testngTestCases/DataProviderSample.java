package testngTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderSample {
	
	
	WebDriver driver;
	
	@Test(priority=0, dataProvider="data")
	public void launchUrl(String url)
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	@Test(priority=1, dataProvider="datas")
	public void pageLogin(String uname, String pwd)
	{
	 driver.findElement(By.id("email")).sendKeys(uname);
	 driver.findElement(By.id("pass")).sendKeys(pwd);
//	 driver.findElement(By.name("login")).click();
	 
	}

	
	@DataProvider
	public Object[] data()
	{
		Object[] arr = {"https://www.facebook.com"};
		return arr;
	}
	
	
	
	@DataProvider
	public Object[][] datas()
	{
		Object[][] tarr= { {"oranium@gmail.com", "749343"}, 
				            {"tech123", "483438"       } , 
				            {"chrompet", "9004930"    }
				            
				           };
		
		return tarr;
	}
}
