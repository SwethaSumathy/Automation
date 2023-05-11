package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiDataProvider {

	@Test(dataProvider = "getData")
	public void loginFacebook(String uname, String pwd)
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(uname);

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys(pwd);

	}
	
	@Test
	@DataProvider
	public Object[][] getData()
	{
		
		
		Object a[][] = new Object[2][2];
		
		a[0][0]="oranium@gmail.com";
		a[0][1]="pass@123";
		
		a[1][0]="selenium@gmail.com";
		a[1][1]="sel123";
		
		return a;
		
		
		
	}
	
	
	
	



}
