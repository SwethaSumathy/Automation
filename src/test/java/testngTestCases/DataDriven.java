package testngTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven {
	WebDriver driver;
	
	//@Parameters({"URL"})
	@Test(priority=0,dataProvider="data")
	public void fburl(String url)
	{
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	
	//@Parameters({"username","password"})
	@Test(priority=1,dataProvider="datas")
	public void fbLogin(String uname, String password)
	{
	    WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys(uname);
	    WebElement pass = driver.findElement(By.id("pass"));
	    pass.sendKeys(password);
	    
	    driver.findElement(By.name("login")).click();

	}
	
	
	@DataProvider
	public Object data()
	{
		Object [] data= { "https://www.facebook.com"};
		return data;
	}

	
	
	@DataProvider
	public Object datas()
	{
		Object[][] datas= { {"oranium","48934i3"}, 
				            { "oranium3e3","803909"} , 
				{ "tech@gmail.com","930903093"}
		};
		
		return datas;
	}
	
}
